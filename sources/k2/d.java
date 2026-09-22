package k2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import ci.g7;
public final class d extends ContentObserver {
    public final ContentResolver f13239a;
    public final Uri f13240b;
    public final g7 f13241c;

    public d(g7 g7Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f13241c = g7Var;
        this.f13239a = contentResolver;
        this.f13240b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        g7 g7Var = this.f13241c;
        g7Var.a(b.c((Context) g7Var.f4692b, (b2.e) g7Var.f4697j, (e) g7Var.f4696i));
    }
}
