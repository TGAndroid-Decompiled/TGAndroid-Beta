package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViewsService;
import java.util.ArrayList;
public class ChatsWidgetService extends RemoteViewsService {
    @Override
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        Context applicationContext = getApplicationContext();
        ?? obj = new Object();
        obj.f22186a = new ArrayList();
        obj.f22191g = new a0.h();
        obj.h = new a0.h();
        obj.f22187b = applicationContext;
        org.telegram.ui.ActionBar.m6.T(applicationContext);
        boolean z9 = false;
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        obj.f22188c = intExtra;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("shortcut_widget", 0);
        int i7 = sharedPreferences.getInt("account" + intExtra, -1);
        if (i7 >= 0) {
            obj.d = c.a(i7);
        }
        StringBuilder sb2 = new StringBuilder("deleted");
        sb2.append(intExtra);
        obj.f22192i = (sharedPreferences.getBoolean(sb2.toString(), false) || obj.d == null) ? true : true;
        return obj;
    }
}
