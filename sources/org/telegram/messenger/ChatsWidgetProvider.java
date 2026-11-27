package org.telegram.messenger;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public class ChatsWidgetProvider extends AppWidgetProvider {
    public static void a(Context context, AppWidgetManager appWidgetManager, int i) {
        a.v();
        int i2 = 2;
        while (i2 * 72 < appWidgetManager.getAppWidgetOptions(i).getInt("appWidgetMaxHeight")) {
            i2++;
        }
        int i3 = i2 - 1;
        Intent intent = new Intent(context, ChatsWidgetService.class);
        intent.putExtra("appWidgetId", i);
        intent.setData(Uri.parse(intent.toUri(1)));
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        int i4 = 2131492958;
        if (!sharedPreferences.getBoolean("deleted" + i, false)) {
            int i5 = sharedPreferences.getInt("account" + i, -1);
            if (i5 == -1) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt(uh9.k(i, "account"), yac.t0);
                edit.putInt("type" + i, 0).commit();
            }
            ArrayList arrayList = new ArrayList();
            if (i5 >= 0) {
                jf7.Y(k5.a(i5).a).n0(i, 0, arrayList, null, null, false);
            }
            if (i3 != 1 && arrayList.size() > 1) {
                i4 = (i3 == 2 || arrayList.size() <= 2) ? 2131492959 : (i3 == 3 || arrayList.size() <= 3) ? 2131492960 : 2131492961;
            }
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i4);
        remoteViews.setRemoteAdapter(i, 2131296478, intent);
        remoteViews.setEmptyView(2131296478, 2131296425);
        Intent intent2 = new Intent(a.b, LaunchActivity.class);
        intent2.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
        intent2.addFlags(67108864);
        intent2.addCategory("android.intent.category.LAUNCHER");
        remoteViews.setPendingIntentTemplate(2131296478, PendingIntent.getActivity(a.b, 0, intent2, 167772160));
        appWidgetManager.updateAppWidget(i, remoteViews);
        appWidgetManager.notifyAppWidgetViewDataChanged(i, 2131296478);
    }

    @Override
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        a(context, appWidgetManager, i);
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
    }

    @Override
    public final void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        a.v();
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (int i = 0; i < iArr.length; i++) {
            int i2 = sharedPreferences.getInt("account" + iArr[i], -1);
            if (i2 >= 0) {
                jf7 Y = jf7.Y(k5.a(i2).a);
                Y.a.c(new ad7(Y, iArr[i], (byte) 1));
            }
            edit.remove("account" + iArr[i]);
            edit.remove("type" + iArr[i]);
            edit.remove("deleted" + iArr[i]);
        }
        edit.commit();
    }

    @Override
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        for (int i : iArr) {
            a(context, appWidgetManager, i);
        }
    }
}
