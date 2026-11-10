package n2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class d extends ContentObserver {
    public final ContentResolver f20146a;
    public final Uri f20147b;
    public final e f20148c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f20148c = eVar;
        this.f20146a = contentResolver;
        this.f20147b = uri;
    }

    @Override
    public final void onChange(boolean z9) {
        this.f20148c.c();
    }
}
