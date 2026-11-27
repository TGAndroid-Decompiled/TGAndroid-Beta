package defpackage;

import android.content.Context;
public final class o92 implements h56 {
    public final Context a;
    public final v92 b;

    public o92(v92 v92Var, Context context) {
        this.b = v92Var;
        this.a = context;
    }

    @Override
    public final void d() {
        this.b.c0(true);
    }

    @Override
    public final void f() {
        v92 v92Var = this.b;
        bt5 bt5Var = new bt5(this.a, v92Var.m0, v92Var.Z, v92Var.p0, v92Var, v92Var.a0, true, xc2.T(v92Var.Y));
        v92Var.q0 = bt5Var;
        bt5Var.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void h() {
    }
}
