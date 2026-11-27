package defpackage;

import android.content.Context;
import android.view.View;
public final class uf9 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        vf9 vf9Var = (vf9) view;
        mk0 mk0Var = (mk0) b8cVar.H;
        vf9Var.a = mk0Var;
        vf9Var.w = (nh9) b8cVar.I;
        vf9Var.x = ob6.a0;
        vf9Var.c(mk0Var);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new vf9(context, vnbVar);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
