package k2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class d extends ContentObserver {
    public final ContentResolver f14659a;
    public final Uri f14660b;
    public final e f14661c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f14661c = eVar;
        this.f14659a = contentResolver;
        this.f14660b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        this.f14661c.c();
    }
}
