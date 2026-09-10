package k2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import bi.h8;
public final class d extends ContentObserver {
    public final ContentResolver f12080a;
    public final Uri f12081b;
    public final h8 f12082c;

    public d(h8 h8Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f12082c = h8Var;
        this.f12080a = contentResolver;
        this.f12081b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        h8 h8Var = this.f12082c;
        h8Var.a(b.c((Context) h8Var.f2794b, (b2.e) h8Var.f2799j, (a6.i) h8Var.f2798i));
    }
}
