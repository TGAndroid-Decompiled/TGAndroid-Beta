package n2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class d extends ContentObserver {
    public final ContentResolver f21107a;
    public final Uri f21108b;
    public final e f21109c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f21109c = eVar;
        this.f21107a = contentResolver;
        this.f21108b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        this.f21109c.c();
    }
}
