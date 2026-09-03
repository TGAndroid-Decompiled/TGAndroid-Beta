package l3;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import c2.a1;
public final class j extends ContentObserver {
    public final ContentResolver f11264a;
    public final Uri f11265b;
    public final a1 f11266c;

    public j(a1 a1Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f11266c = a1Var;
        this.f11264a = contentResolver;
        this.f11265b = uri;
    }

    @Override
    public final void onChange(boolean z4) {
        a1 a1Var = this.f11266c;
        a1.a(a1Var, g.a((Context) a1Var.f1902b));
    }
}
