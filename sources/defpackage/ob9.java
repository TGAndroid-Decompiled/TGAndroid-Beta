package defpackage;

import android.content.Context;
import android.view.View;
public final class ob9 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        pb9 pb9Var = (pb9) view;
        lk0 lk0Var = (lk0) c4cVar.H;
        pb9Var.a = lk0Var;
        pb9Var.F = (nb9) c4cVar.I;
        pb9Var.c(lk0Var);
        pb9Var.h();
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        pb9 pb9Var = new pb9(i, wjbVar, context);
        pb9Var.setBackground(new ed9(bkb.v0(bkb.c6, wjbVar)));
        return pb9Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
