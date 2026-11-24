package defpackage;

import android.content.Context;
import android.view.View;
public final class od9 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        pd9 pd9Var = (pd9) view;
        ll0 ll0Var = (ll0) c6cVar.H;
        pd9Var.a = ll0Var;
        pd9Var.F = (nd9) c6cVar.I;
        pd9Var.c(ll0Var);
        pd9Var.h();
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        pd9 pd9Var = new pd9(i, ylbVar, context);
        pd9Var.setBackground(new gf9(cmb.v0(cmb.c6, ylbVar)));
        return pd9Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
