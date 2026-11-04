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
    public static void a(Context context, AppWidgetManager appWidgetManager, int i3) {
        t0.w();
        int i10 = 2;
        while (i10 * 72 < appWidgetManager.getAppWidgetOptions(i3).getInt("appWidgetMaxHeight")) {
            i10++;
        }
        int i11 = i10 - 1;
        Intent intent = new Intent(context, ChatsWidgetService.class);
        intent.putExtra("appWidgetId", i3);
        intent.setData(Uri.parse(intent.toUri(1)));
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        int i12 = 2131492958;
        if (!sharedPreferences.getBoolean("deleted" + i3, false)) {
            int i13 = sharedPreferences.getInt("account" + i3, -1);
            if (i13 == -1) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt(k2.p1.i(i3, "account"), h10.f22829t0);
                edit.putInt("type" + i3, 0).commit();
            }
            ArrayList arrayList = new ArrayList();
            if (i13 >= 0) {
                qr.a0(c.a(i13).f21919a).q0(i3, 0, arrayList, null, null, false);
            }
            if (i11 != 1 && arrayList.size() > 1) {
                i12 = (i11 == 2 || arrayList.size() <= 2) ? 2131492959 : (i11 == 3 || arrayList.size() <= 3) ? 2131492960 : 2131492961;
            }
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i12);
        remoteViews.setRemoteAdapter(i3, 2131296476, intent);
        remoteViews.setEmptyView(2131296476, 2131296423);
        Intent intent2 = new Intent(t0.f25457b, LaunchActivity.class);
        intent2.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
        intent2.addFlags(67108864);
        intent2.addCategory("android.intent.category.LAUNCHER");
        remoteViews.setPendingIntentTemplate(2131296476, PendingIntent.getActivity(t0.f25457b, 0, intent2, 167772160));
        appWidgetManager.updateAppWidget(i3, remoteViews);
        appWidgetManager.notifyAppWidgetViewDataChanged(i3, 2131296476);
    }

    @Override
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i3, Bundle bundle) {
        a(context, appWidgetManager, i3);
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i3, bundle);
    }

    @Override
    public final void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        t0.w();
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i10 = sharedPreferences.getInt("account" + iArr[i3], -1);
            if (i10 >= 0) {
                qr a02 = qr.a0(c.a(i10).f21919a);
                a02.f24934a.c(new kp(a02, iArr[i3], 2));
            }
            edit.remove("account" + iArr[i3]);
            edit.remove("type" + iArr[i3]);
            edit.remove("deleted" + iArr[i3]);
        }
        edit.commit();
    }

    @Override
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        for (int i3 : iArr) {
            a(context, appWidgetManager, i3);
        }
    }
}
