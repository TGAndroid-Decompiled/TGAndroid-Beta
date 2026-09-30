package k2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import ci.e7;
public final class d extends ContentObserver {
    public final ContentResolver f13240a;
    public final Uri f13241b;
    public final e7 f13242c;

    public d(e7 e7Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f13242c = e7Var;
        this.f13240a = contentResolver;
        this.f13241b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        e7 e7Var = this.f13242c;
        e7Var.a(b.c((Context) e7Var.f4648b, (b2.e) e7Var.f4653j, (a6.m) e7Var.f4652i));
    }
}
