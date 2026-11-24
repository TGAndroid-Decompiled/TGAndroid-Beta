package defpackage;

import android.content.Context;
import android.view.View;
public final class xb extends b4c {
    static {
        b4c.h(new b4c());
    }

    public static c4c i(int i, int i2, CharSequence charSequence, String str) {
        c4c K = c4c.K(xb.class);
        K.d = i;
        K.A = i2;
        K.k = 2131231107;
        K.m = charSequence;
        K.n = str;
        return K;
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ((yb) view).a(c4cVar.A, c4cVar.k, c4cVar.m, c4cVar.n);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new yb(context, wjbVar);
    }
}
