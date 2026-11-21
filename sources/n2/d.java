package n2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class d extends ContentObserver {
    public final ContentResolver f21104a;
    public final Uri f21105b;
    public final e f21106c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f21106c = eVar;
        this.f21104a = contentResolver;
        this.f21105b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        this.f21106c.c();
    }
}
