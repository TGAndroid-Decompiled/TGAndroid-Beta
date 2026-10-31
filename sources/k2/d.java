package k2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class d extends ContentObserver {
    public final ContentResolver f10626a;
    public final Uri f10627b;
    public final e f10628c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f10628c = eVar;
        this.f10626a = contentResolver;
        this.f10627b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        this.f10628c.c();
    }
}
