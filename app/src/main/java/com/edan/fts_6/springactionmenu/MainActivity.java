package com.edan.fts_6.springactionmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.lilei.springactionmenu.ActionMenu;
import com.lilei.springactionmenu.OnActionItemClickListener;

public class MainActivity extends AppCompatActivity implements OnActionItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionMenu actionMenu = (ActionMenu) findViewById(R.id.actionMenu);

// add menu items
        actionMenu.addView(R.drawable.search, getItemColor(R.color.menuNormalInfo), getItemColor(R.color.menuPressInfo));
        actionMenu.addView(R.drawable.like, getItemColor(R.color.menuNormalRed), getItemColor(R.color.menuPressRed));
        actionMenu.addView(R.drawable.write);

        actionMenu.setItemClickListener(this);
    }

    private int getItemColor(int colorID) {
        return getResources().getColor(colorID);
    }

    @Override
    public void onItemClick(int i) {
        Log.e("aaa", "onItemClick " + i);
    }

    @Override
    public void onAnimationEnd(boolean b) {

    }
}
