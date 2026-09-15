package k2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import ci.g7;
public final class d extends ContentObserver {
    public final ContentResolver f13235a;
    public final Uri f13236b;
    public final g7 f13237c;

    public d(g7 g7Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f13237c = g7Var;
        this.f13235a = contentResolver;
        this.f13236b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        g7 g7Var = this.f13237c;
        g7Var.a(b.c((Context) g7Var.f4688b, (b2.e) g7Var.f4693j, (a6.m) g7Var.f4692i));
    }
}
