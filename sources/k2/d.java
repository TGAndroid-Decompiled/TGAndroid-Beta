package k2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import di.g7;
import ji.u4;
public final class d extends ContentObserver {
    public final ContentResolver f14525a;
    public final Uri f14526b;
    public final g7 f14527c;

    public d(g7 g7Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f14527c = g7Var;
        this.f14525a = contentResolver;
        this.f14526b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        g7 g7Var = this.f14527c;
        g7Var.a(b.c((Context) g7Var.f7265b, (b2.e) g7Var.f7271j, (u4) g7Var.f7270i));
    }
}
