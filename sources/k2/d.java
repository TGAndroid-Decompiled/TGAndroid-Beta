package k2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class d extends ContentObserver {
    public final ContentResolver f13863a;
    public final Uri f13864b;
    public final e f13865c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f13865c = eVar;
        this.f13863a = contentResolver;
        this.f13864b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        this.f13865c.c();
    }
}
