package defpackage;

import android.content.Context;
import android.view.View;
public final class hd9 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        ((id9) view).h((ll0) c6cVar.H, (wg9) c6cVar.I);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        id9 id9Var = new id9(i, ylbVar, context);
        id9Var.setBackground(new gf9(cmb.v0(cmb.c6, ylbVar)));
        return id9Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
