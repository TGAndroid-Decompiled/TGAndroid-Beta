package defpackage;

import android.content.Context;
import android.view.View;
public final class ef9 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ff9 ff9Var = (ff9) view;
        mk0 mk0Var = (mk0) b8cVar.H;
        ff9Var.a = mk0Var;
        ff9Var.F = (df9) b8cVar.I;
        ff9Var.c(mk0Var);
        ff9Var.h();
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        ff9 ff9Var = new ff9(i, vnbVar, context);
        ff9Var.setBackground(new vg9(aob.v0(aob.d6, vnbVar)));
        return ff9Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
