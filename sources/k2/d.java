package k2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import ci.e7;
public final class d extends ContentObserver {
    public final ContentResolver f14418a;
    public final Uri f14419b;
    public final e7 f14420c;

    public d(e7 e7Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f14420c = e7Var;
        this.f14418a = contentResolver;
        this.f14419b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        e7 e7Var = this.f14420c;
        e7Var.a(b.c((Context) e7Var.f5031b, (b2.e) e7Var.f5037j, (a4.l) e7Var.f5036i));
    }
}
