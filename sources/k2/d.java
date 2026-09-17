package k2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import di.g7;
import ji.u4;
public final class d extends ContentObserver {
    public final ContentResolver f14551a;
    public final Uri f14552b;
    public final g7 f14553c;

    public d(g7 g7Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f14553c = g7Var;
        this.f14551a = contentResolver;
        this.f14552b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        g7 g7Var = this.f14553c;
        g7Var.a(b.c((Context) g7Var.f7293b, (b2.e) g7Var.f7299j, (u4) g7Var.f7298i));
    }
}
