package l3;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import c2.z0;
public final class j extends ContentObserver {
    public final ContentResolver f11154a;
    public final Uri f11155b;
    public final z0 f11156c;

    public j(z0 z0Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f11156c = z0Var;
        this.f11154a = contentResolver;
        this.f11155b = uri;
    }

    @Override
    public final void onChange(boolean z4) {
        z0 z0Var = this.f11156c;
        z0.a(z0Var, g.a((Context) z0Var.f2047b));
    }
}
