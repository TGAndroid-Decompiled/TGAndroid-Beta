package lh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
public final class d1 extends w51 {
    public final j1 K;

    public d1(j1 j1Var, rl0 rl0Var, Context context, int i10, dg.r1 r1Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(rl0Var, context, i10, 0, true, r1Var, f6Var);
        this.K = j1Var;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        super.v(l1Var, i10);
        View view = l1Var.f5774a;
        if (!(view instanceof h1)) {
            return;
        }
        h1 h1Var = (h1) view;
        f1 f1Var = h1Var.v;
        boolean R = this.K.R(f1Var);
        h1Var.f12514c.f(R, false);
        h1Var.f12517r.a(R, false);
        h1Var.setOnClickListener(new cg.n(20, this, f1Var));
    }
}
