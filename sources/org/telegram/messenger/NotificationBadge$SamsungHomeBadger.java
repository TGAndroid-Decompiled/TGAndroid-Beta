package org.telegram.messenger;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class NotificationBadge$SamsungHomeBadger implements cs {
    public static final String[] f21325a = {"_id", "class"};
    public static NotificationBadge$DefaultBadger f21326b;

    public static ContentValues c(ComponentName componentName, int i7, boolean z9) {
        ContentValues contentValues = new ContentValues();
        if (z9) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i7));
        return contentValues;
    }

    @Override
    public final void a(int i7) {
        try {
            if (f21326b == null) {
                f21326b = new NotificationBadge$DefaultBadger();
            }
            f21326b.a(i7);
        } catch (Exception unused) {
        }
        Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = t0.f25570b.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(parse, f21325a, "package=?", new String[]{fs.d.getPackageName()}, null);
            if (cursor != null) {
                String className = fs.d.getClassName();
                boolean z9 = false;
                while (cursor.moveToNext()) {
                    contentResolver.update(parse, c(fs.d, i7, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                    if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                        z9 = true;
                    }
                }
                if (!z9) {
                    contentResolver.insert(parse, c(fs.d, i7, true));
                }
            }
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        } catch (Throwable th2) {
            LinkedList linkedList = fs.f22469a;
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
