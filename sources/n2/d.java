package n2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class d extends ContentObserver {
    public final ContentResolver f21073a;
    public final Uri f21074b;
    public final e f21075c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f21075c = eVar;
        this.f21073a = contentResolver;
        this.f21074b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        this.f21075c.c();
    }
}
