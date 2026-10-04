package k2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import ci.e7;
public final class d extends ContentObserver {
    public final ContentResolver f14384a;
    public final Uri f14385b;
    public final e7 f14386c;

    public d(e7 e7Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f14386c = e7Var;
        this.f14384a = contentResolver;
        this.f14385b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        e7 e7Var = this.f14386c;
        e7Var.a(b.c((Context) e7Var.f5023b, (b2.e) e7Var.f5029j, (e) e7Var.f5028i));
    }
}
