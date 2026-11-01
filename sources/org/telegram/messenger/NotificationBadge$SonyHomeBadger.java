package org.telegram.messenger;

import android.content.AsyncQueryHandler;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$SonyHomeBadger implements ms {
    public static os f14509b;
    public final Uri f14510a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    @Override
    public final void a(int i10) {
        boolean z10 = false;
        if (w0.f18945b.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null) {
            if (i10 < 0) {
                return;
            }
            if (f14509b == null) {
                f14509b = new AsyncQueryHandler(w0.f18945b.getApplicationContext().getContentResolver());
            }
            String packageName = ps.d.getPackageName();
            String className = ps.d.getClassName();
            ContentValues contentValues = new ContentValues();
            contentValues.put("badge_count", Integer.valueOf(i10));
            contentValues.put("package_name", packageName);
            contentValues.put("activity_name", className);
            f14509b.startInsert(0, null, this.f14510a, contentValues);
            return;
        }
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", ps.d.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", ps.d.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i10));
        if (i10 > 0) {
            z10 = true;
        }
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z10);
        i0.g3(new t(intent, 5));
    }

    @Override
    public final List b() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }
}
