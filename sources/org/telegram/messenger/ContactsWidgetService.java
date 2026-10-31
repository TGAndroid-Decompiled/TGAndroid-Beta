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
        obj.f16525a = new ArrayList();
        obj.f16529g = new a0.h();
        obj.f16526b = applicationContext;
        org.telegram.ui.ActionBar.t6.T(applicationContext);
        boolean z10 = false;
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        obj.f16527c = intExtra;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("shortcut_widget", 0);
        int i10 = sharedPreferences.getInt("account" + intExtra, -1);
        if (i10 >= 0) {
            obj.d = c.a(i10);
        }
        StringBuilder sb2 = new StringBuilder("deleted");
        sb2.append(intExtra);
        obj.h = (sharedPreferences.getBoolean(sb2.toString(), false) || obj.d == null) ? true : true;
        return obj;
    }
}
