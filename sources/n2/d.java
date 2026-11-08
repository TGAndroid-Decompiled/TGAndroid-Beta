package n2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class d extends ContentObserver {
    public final ContentResolver f20141a;
    public final Uri f20142b;
    public final e f20143c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f20143c = eVar;
        this.f20141a = contentResolver;
        this.f20142b = uri;
    }

    @Override
    public final void onChange(boolean z9) {
        this.f20143c.c();
    }
}
