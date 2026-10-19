package k2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class d extends ContentObserver {
    public final ContentResolver f14661a;
    public final Uri f14662b;
    public final e f14663c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f14663c = eVar;
        this.f14661a = contentResolver;
        this.f14662b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        this.f14663c.c();
    }
}
