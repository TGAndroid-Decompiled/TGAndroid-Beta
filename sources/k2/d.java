package k2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class d extends ContentObserver {
    public final ContentResolver f10627a;
    public final Uri f10628b;
    public final e f10629c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f10629c = eVar;
        this.f10627a = contentResolver;
        this.f10628b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        this.f10629c.c();
    }
}
