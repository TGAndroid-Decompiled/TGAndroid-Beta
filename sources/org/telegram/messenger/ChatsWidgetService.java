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
        obj.f22310a = new ArrayList();
        obj.f22315g = new a0.h();
        obj.h = new a0.h();
        obj.f22311b = applicationContext;
        org.telegram.ui.ActionBar.k6.T(applicationContext);
        boolean z10 = false;
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        obj.f22312c = intExtra;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("shortcut_widget", 0);
        int i3 = sharedPreferences.getInt("account" + intExtra, -1);
        if (i3 >= 0) {
            obj.d = c.a(i3);
        }
        StringBuilder sb2 = new StringBuilder("deleted");
        sb2.append(intExtra);
        obj.f22316i = (sharedPreferences.getBoolean(sb2.toString(), false) || obj.d == null) ? true : true;
        return obj;
    }
}
