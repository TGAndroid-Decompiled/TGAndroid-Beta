package defpackage;

import android.content.Context;
import android.view.View;
public final class dc9 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ec9 ec9Var = (ec9) view;
        lk0 lk0Var = (lk0) c4cVar.H;
        ec9Var.a = lk0Var;
        ec9Var.w = (vd9) c4cVar.I;
        ec9Var.x = k96.a0;
        ec9Var.c(lk0Var);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new ec9(context, wjbVar);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
