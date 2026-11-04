package m2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class d extends ContentObserver {
    public final ContentResolver f18839a;
    public final Uri f18840b;
    public final e f18841c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f18841c = eVar;
        this.f18839a = contentResolver;
        this.f18840b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        this.f18841c.c();
    }
}
