package l3;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import c2.z0;
public final class j extends ContentObserver {
    public final ContentResolver f11518a;
    public final Uri f11519b;
    public final z0 f11520c;

    public j(z0 z0Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f11520c = z0Var;
        this.f11518a = contentResolver;
        this.f11519b = uri;
    }

    @Override
    public final void onChange(boolean z4) {
        z0 z0Var = this.f11520c;
        z0.a(z0Var, g.a((Context) z0Var.f2224b));
    }
}
