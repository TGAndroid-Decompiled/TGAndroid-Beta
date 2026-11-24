package defpackage;

import android.content.Context;
import android.view.View;
public final class xb extends b6c {
    static {
        b6c.h(new b6c());
    }

    public static c6c i(int i, int i2, CharSequence charSequence, String str) {
        c6c K = c6c.K(xb.class);
        K.d = i;
        K.A = i2;
        K.k = 2131231108;
        K.m = charSequence;
        K.n = str;
        return K;
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        ((yb) view).a(c6cVar.A, c6cVar.k, c6cVar.m, c6cVar.n);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new yb(context, ylbVar);
    }
}
