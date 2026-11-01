package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$NovaHomeBadger implements ms {
    @Override
    public final void a(int i10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", ps.d.getPackageName() + "/" + ps.d.getClassName());
        contentValues.put("count", Integer.valueOf(i10));
        w0.f18945b.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }

    @Override
    public final List b() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }
}
