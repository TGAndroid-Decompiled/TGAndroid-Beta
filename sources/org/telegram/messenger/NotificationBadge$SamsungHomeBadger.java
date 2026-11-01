package org.telegram.messenger;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class NotificationBadge$SamsungHomeBadger implements ms {
    public static final String[] f14507a = {"_id", "class"};
    public static NotificationBadge$DefaultBadger f14508b;

    public static ContentValues c(ComponentName componentName, int i10, boolean z10) {
        ContentValues contentValues = new ContentValues();
        if (z10) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i10));
        return contentValues;
    }

    @Override
    public final void a(int i10) {
        try {
            if (f14508b == null) {
                f14508b = new NotificationBadge$DefaultBadger();
            }
            f14508b.a(i10);
        } catch (Exception unused) {
        }
        Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = w0.f18945b.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(parse, f14507a, "package=?", new String[]{ps.d.getPackageName()}, null);
            if (cursor != null) {
                String className = ps.d.getClassName();
                boolean z10 = false;
                while (cursor.moveToNext()) {
                    contentResolver.update(parse, c(ps.d, i10, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                    if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    contentResolver.insert(parse, c(ps.d, i10, true));
                }
            }
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        } catch (Throwable th2) {
            LinkedList linkedList = ps.f17633a;
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th2;
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }
}
