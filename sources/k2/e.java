package k2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class e extends ContentObserver {
    public final ContentResolver f16146a;
    public final Uri f16147b;
    public final f f16148c;

    public e(f fVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f16148c = fVar;
        this.f16146a = contentResolver;
        this.f16147b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        this.f16148c.c();
    }
}
