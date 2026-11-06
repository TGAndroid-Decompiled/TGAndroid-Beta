package n2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class d extends ContentObserver {
    public final ContentResolver f20138a;
    public final Uri f20139b;
    public final e f20140c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f20140c = eVar;
        this.f20138a = contentResolver;
        this.f20139b = uri;
    }

    @Override
    public final void onChange(boolean z9) {
        this.f20140c.c();
    }
}
