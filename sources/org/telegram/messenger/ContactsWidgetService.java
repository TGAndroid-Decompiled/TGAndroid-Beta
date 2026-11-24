package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViewsService;
import java.util.ArrayList;
public class ContactsWidgetService extends RemoteViewsService {
    @Override
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        Context applicationContext = getApplicationContext();
        ?? obj = new Object();
        obj.a = new ArrayList();
        obj.g = new vh6();
        obj.b = applicationContext;
        cmb.S(applicationContext);
        boolean z = false;
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        obj.c = intExtra;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("shortcut_widget", 0);
        int i = sharedPreferences.getInt("account" + intExtra, -1);
        if (i >= 0) {
            obj.d = j5.a(i);
        }
        StringBuilder sb = new StringBuilder("deleted");
        sb.append(intExtra);
        obj.h = (sharedPreferences.getBoolean(sb.toString(), false) || obj.d == null) ? true : true;
        return obj;
    }
}
