package mh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class c1 extends w51 {
    public final i1 K;

    public c1(i1 i1Var, sl0 sl0Var, Context context, int i10, eg.p1 p1Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(sl0Var, context, i10, 0, true, p1Var, g6Var);
        this.K = i1Var;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        super.v(m1Var, i10);
        View view = m1Var.f5875a;
        if (!(view instanceof g1)) {
            return;
        }
        g1 g1Var = (g1) view;
        e1 e1Var = g1Var.v;
        boolean R = this.K.R(e1Var);
        g1Var.f14070c.f(R, false);
        g1Var.f14074r.a(R, false);
        g1Var.setOnClickListener(new dg.n(20, this, e1Var));
    }
}
