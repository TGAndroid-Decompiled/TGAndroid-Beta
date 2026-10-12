package k2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import ci.e7;
public final class d extends ContentObserver {
    public final ContentResolver f14414a;
    public final Uri f14415b;
    public final e7 f14416c;

    public d(e7 e7Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f14416c = e7Var;
        this.f14414a = contentResolver;
        this.f14415b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        e7 e7Var = this.f14416c;
        e7Var.a(b.c((Context) e7Var.f5029b, (b2.e) e7Var.f5035j, (a4.l) e7Var.f5034i));
    }
}
