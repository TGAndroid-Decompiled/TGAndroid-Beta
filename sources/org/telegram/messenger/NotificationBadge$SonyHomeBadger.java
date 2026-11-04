package org.telegram.messenger;

import android.content.AsyncQueryHandler;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$SonyHomeBadger implements ur {
    public static vr f21373b;
    public final Uri f21374a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    @Override
    public final void a(int i3) {
        boolean z10 = false;
        if (t0.f25457b.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null) {
            if (i3 < 0) {
                return;
            }
            if (f21373b == null) {
                f21373b = new AsyncQueryHandler(t0.f25457b.getApplicationContext().getContentResolver());
            }
            String packageName = wr.d.getPackageName();
            String className = wr.d.getClassName();
            ContentValues contentValues = new ContentValues();
            contentValues.put("badge_count", Integer.valueOf(i3));
            contentValues.put("package_name", packageName);
            contentValues.put("activity_name", className);
            f21373b.startInsert(0, null, this.f21374a, contentValues);
            return;
        }
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", wr.d.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", wr.d.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i3));
        if (i3 > 0) {
            z10 = true;
        }
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z10);
        g0.h3(new s(intent, 5));
    }

    @Override
    public final List b() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }
}
