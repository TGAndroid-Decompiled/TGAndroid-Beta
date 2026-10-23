package k2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class d extends ContentObserver {
    public final ContentResolver f14704a;
    public final Uri f14705b;
    public final e f14706c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f14706c = eVar;
        this.f14704a = contentResolver;
        this.f14705b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        this.f14706c.c();
    }
}
