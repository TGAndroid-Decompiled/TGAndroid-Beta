package k2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class d extends ContentObserver {
    public final ContentResolver f14666a;
    public final Uri f14667b;
    public final e f14668c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f14668c = eVar;
        this.f14666a = contentResolver;
        this.f14667b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        this.f14668c.c();
    }
}
