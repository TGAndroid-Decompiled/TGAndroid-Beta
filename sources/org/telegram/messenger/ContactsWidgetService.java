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
        obj.f23050a = new ArrayList();
        obj.f23055g = new a0.h();
        obj.f23051b = applicationContext;
        org.telegram.ui.ActionBar.m6.T(applicationContext);
        boolean z9 = false;
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        obj.f23052c = intExtra;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("shortcut_widget", 0);
        int i7 = sharedPreferences.getInt("account" + intExtra, -1);
        if (i7 >= 0) {
            obj.d = c.a(i7);
        }
        StringBuilder sb2 = new StringBuilder("deleted");
        sb2.append(intExtra);
        obj.h = (sharedPreferences.getBoolean(sb2.toString(), false) || obj.d == null) ? true : true;
        return obj;
    }
}
