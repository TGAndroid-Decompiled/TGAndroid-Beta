package jh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b51;

public final class e0 extends b51 {
    public final g2 J;

    public e0(g2 g2Var, hh.f1 f1Var, Context context, int i10, c0 c0Var, b bVar) {
        super(f1Var, context, i10, 0, false, c0Var, bVar);
        this.J = g2Var;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        n0 n0Var;
        s0 s0Var;
        super.v(o1Var, i10);
        g2 g2Var = this.J;
        if (g2Var.f14021y) {
            View view = o1Var.f5789a;
            if ((view instanceof n0) && (s0Var = (n0Var = (n0) view).G) != null && s0Var.f13929a == g2Var.f14020x) {
                n0Var.b();
                g2Var.f14021y = false;
            }
        }
    }

    @Override
    public final void y(f2.o1 o1Var) {
        n0 n0Var;
        s0 s0Var;
        super.y(o1Var);
        g2 g2Var = this.J;
        if (g2Var.f14021y) {
            View view = o1Var.f5789a;
            if ((view instanceof n0) && (s0Var = (n0Var = (n0) view).G) != null && s0Var.f13929a == g2Var.f14020x) {
                n0Var.b();
                g2Var.f14021y = false;
            }
        }
    }
}
