package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class tz extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final uz c;

    public tz(uz uzVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = uzVar;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override
    public final void onChange(boolean z) {
        this.c.c();
    }
}
