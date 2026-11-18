package n2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class d extends ContentObserver {
    public final ContentResolver f21079a;
    public final Uri f21080b;
    public final e f21081c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f21081c = eVar;
        this.f21079a = contentResolver;
        this.f21080b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        this.f21081c.c();
    }
}
