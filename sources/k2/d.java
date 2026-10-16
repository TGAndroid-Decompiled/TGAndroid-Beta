package k2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class d extends ContentObserver {
    public final ContentResolver f13866a;
    public final Uri f13867b;
    public final e f13868c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f13868c = eVar;
        this.f13866a = contentResolver;
        this.f13867b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        this.f13868c.c();
    }
}
