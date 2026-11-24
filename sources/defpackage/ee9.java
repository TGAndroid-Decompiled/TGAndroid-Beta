package defpackage;

import android.content.Context;
import android.view.View;
public final class ee9 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        fe9 fe9Var = (fe9) view;
        ll0 ll0Var = (ll0) c6cVar.H;
        fe9Var.a = ll0Var;
        fe9Var.w = (zf9) c6cVar.I;
        fe9Var.x = jb6.a0;
        fe9Var.c(ll0Var);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new fe9(context, ylbVar);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
