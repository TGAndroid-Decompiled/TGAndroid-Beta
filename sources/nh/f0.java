package nh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.w51;
public final class f0 extends w51 {
    public final g2 K;

    public f0(g2 g2Var, lh.e1 e1Var, Context context, int i10, d0 d0Var, b bVar) {
        super(e1Var, context, i10, 0, false, d0Var, bVar);
        this.K = g2Var;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        o0 o0Var;
        t0 t0Var;
        super.v(l1Var, i10);
        g2 g2Var = this.K;
        if (g2Var.f15962y) {
            View view = l1Var.f5774a;
            if ((view instanceof o0) && (t0Var = (o0Var = (o0) view).H) != null && t0Var.f15876a == g2Var.f15961x) {
                o0Var.c();
                g2Var.f15962y = false;
            }
        }
    }

    @Override
    public final void y(f2.l1 l1Var) {
        o0 o0Var;
        t0 t0Var;
        super.y(l1Var);
        g2 g2Var = this.K;
        if (g2Var.f15962y) {
            View view = l1Var.f5774a;
            if ((view instanceof o0) && (t0Var = (o0Var = (o0) view).H) != null && t0Var.f15876a == g2Var.f15961x) {
                o0Var.c();
                g2Var.f15962y = false;
            }
        }
    }
}
