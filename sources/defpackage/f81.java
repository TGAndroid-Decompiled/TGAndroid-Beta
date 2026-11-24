package defpackage;

import android.view.View;
public final class f81 implements f59 {
    public final r59 a;
    public final g81 b;

    public f81(g81 g81Var, r59 r59Var) {
        this.b = g81Var;
        this.a = r59Var;
    }

    @Override
    public final void g(int i, View view) {
        w81 w81Var = this.b.f;
        r59 r59Var = this.a;
        h81 h81Var = (h81) r59Var.getAdapter();
        p81 p81Var = (p81) h81Var.e.get(i);
        if (view instanceof sha) {
            int i2 = w81.H;
            w81Var.c(p81Var, (r81) h81Var, r59Var);
            return;
        }
        l81 l81Var = w81Var.G;
        if (l81Var != null) {
            l81Var.h(p81Var.c, p81Var.d, false);
        }
    }
}
