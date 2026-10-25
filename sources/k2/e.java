package k2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class e extends ContentObserver {
    public final ContentResolver f16147a;
    public final Uri f16148b;
    public final f f16149c;

    public e(f fVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f16149c = fVar;
        this.f16147a = contentResolver;
        this.f16148b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        this.f16149c.c();
    }
}
