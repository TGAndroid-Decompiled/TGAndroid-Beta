package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class uz extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final vz c;

    public uz(vz vzVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = vzVar;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override
    public final void onChange(boolean z) {
        this.c.l();
    }
}
