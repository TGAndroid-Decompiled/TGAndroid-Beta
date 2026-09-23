package k2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import ci.e7;
public final class d extends ContentObserver {
    public final ContentResolver f13226a;
    public final Uri f13227b;
    public final e7 f13228c;

    public d(e7 e7Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f13228c = e7Var;
        this.f13226a = contentResolver;
        this.f13227b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        e7 e7Var = this.f13228c;
        e7Var.a(b.c((Context) e7Var.f4640b, (b2.e) e7Var.f4645j, (a6.m) e7Var.f4644i));
    }
}
