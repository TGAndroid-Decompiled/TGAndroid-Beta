package defpackage;

import android.content.Context;
import android.view.View;
public final class vk9 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        ((xk9) view).d((ll0) c6cVar.H, (uk9) c6cVar.I, c6cVar.s);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        xk9 xk9Var = new xk9(context, ylbVar);
        xk9Var.setBackground(new gf9(cmb.v0(cmb.c6, ylbVar)));
        return xk9Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
