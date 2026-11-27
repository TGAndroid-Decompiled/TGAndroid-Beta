package defpackage;

import android.content.Context;
import android.view.View;
public final class f34 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        g34 g34Var = (g34) view;
        g34Var.n = (pcc) b8cVar.H;
        g34Var.r = b8cVar;
        g34Var.b(b8cVar.A, false);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new g34(context, vnbVar);
    }
}
