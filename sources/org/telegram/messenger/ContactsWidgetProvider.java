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
public class ContactsWidgetProvider extends AppWidgetProvider {
    public static void a(Context context, AppWidgetManager appWidgetManager, int i10) {
        w0.w();
        int i11 = 2;
        while (i11 * 86 < appWidgetManager.getAppWidgetOptions(i10).getInt("appWidgetMaxHeight")) {
            i11++;
        }
        int i12 = i11 - 1;
        Intent intent = new Intent(context, ContactsWidgetService.class);
        intent.putExtra("appWidgetId", i10);
        intent.setData(Uri.parse(intent.toUri(1)));
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        int i13 = 2131492903;
        if (!sharedPreferences.getBoolean("deleted" + i10, false)) {
            int i14 = sharedPreferences.getInt("account" + i10, -1);
            if (i14 == -1) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt(i0.a.i(i10, "account"), d20.f15147s0);
                edit.putInt("type" + i10, 0).commit();
            }
            ArrayList arrayList = new ArrayList();
            if (i14 >= 0) {
                hs.a0(c.a(i14).f14863a).q0(i10, 1, arrayList, null, null, false);
            }
            int ceil = (int) Math.ceil(arrayList.size() / 2.0f);
            if (i12 != 1 && ceil > 1) {
                i13 = (i12 == 2 || ceil <= 2) ? 2131492904 : (i12 == 3 || ceil <= 3) ? 2131492905 : 2131492906;
            }
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i13);
        remoteViews.setRemoteAdapter(i10, 2131296476, intent);
        remoteViews.setEmptyView(2131296476, 2131296423);
        Intent intent2 = new Intent(w0.f19025b, LaunchActivity.class);
        intent2.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
        intent2.addFlags(67108864);
        intent2.addCategory("android.intent.category.LAUNCHER");
        remoteViews.setPendingIntentTemplate(2131296476, PendingIntent.getActivity(w0.f19025b, 0, intent2, 167772160));
        appWidgetManager.updateAppWidget(i10, remoteViews);
        appWidgetManager.notifyAppWidgetViewDataChanged(i10, 2131296476);
    }

    @Override
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i10, Bundle bundle) {
        a(context, appWidgetManager, i10);
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i10, bundle);
    }

    @Override
    public final void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        w0.w();
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = sharedPreferences.getInt("account" + iArr[i10], -1);
            if (i11 >= 0) {
                hs a02 = hs.a0(c.a(i11).f14863a);
                a02.f15938a.c(new yp(a02, iArr[i10], 2));
            }
            edit.remove("account" + iArr[i10]);
            edit.remove("type" + iArr[i10]);
            edit.remove("deleted" + iArr[i10]);
        }
        edit.commit();
    }

    @Override
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        for (int i10 : iArr) {
            a(context, appWidgetManager, i10);
        }
    }
}
