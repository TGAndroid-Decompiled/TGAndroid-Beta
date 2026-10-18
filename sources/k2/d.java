package k2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class d extends ContentObserver {
    public final ContentResolver f14668a;
    public final Uri f14669b;
    public final e f14670c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f14670c = eVar;
        this.f14668a = contentResolver;
        this.f14669b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        this.f14670c.c();
    }
}
