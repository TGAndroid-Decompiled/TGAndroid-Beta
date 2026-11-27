package defpackage;

import android.content.Context;
import android.view.View;
public final class yb extends a8c {
    static {
        a8c.h(new a8c());
    }

    public static b8c i(int i, int i2, CharSequence charSequence, String str) {
        b8c K = b8c.K(yb.class);
        K.d = i;
        K.A = i2;
        K.k = 2131231107;
        K.m = charSequence;
        K.n = str;
        return K;
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ((zb) view).a(b8cVar.A, b8cVar.k, b8cVar.m, b8cVar.n);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new zb(context, vnbVar);
    }
}
