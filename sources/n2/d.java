package n2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class d extends ContentObserver {
    public final ContentResolver f21170a;
    public final Uri f21171b;
    public final e f21172c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f21172c = eVar;
        this.f21170a = contentResolver;
        this.f21171b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        this.f21172c.c();
    }
}
