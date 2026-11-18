package n2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class d extends ContentObserver {
    public final ContentResolver f21076a;
    public final Uri f21077b;
    public final e f21078c;

    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f21078c = eVar;
        this.f21076a = contentResolver;
        this.f21077b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        this.f21078c.c();
    }
}
