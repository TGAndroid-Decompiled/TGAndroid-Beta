package n2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class d extends ContentObserver {
    public final ContentResolver f20715a;
    public final Uri f20716b;
    public final e f20717c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f20717c = eVar;
        this.f20715a = contentResolver;
        this.f20716b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        this.f20717c.c();
    }
}
