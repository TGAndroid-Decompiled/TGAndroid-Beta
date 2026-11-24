package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
public final class t00 extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final u00 c;

    public t00(u00 u00Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = u00Var;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override
    public final void onChange(boolean z) {
        this.c.l();
    }
}
