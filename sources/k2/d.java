package k2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import ci.g7;
public final class d extends ContentObserver {
    public final ContentResolver f13237a;
    public final Uri f13238b;
    public final g7 f13239c;

    public d(g7 g7Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f13239c = g7Var;
        this.f13237a = contentResolver;
        this.f13238b = uri;
    }

    @Override
    public final void onChange(boolean z10) {
        g7 g7Var = this.f13239c;
        g7Var.a(b.c((Context) g7Var.f4690b, (b2.e) g7Var.f4695j, (a6.m) g7Var.f4694i));
    }
}
