package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
public final class p1 extends l41 {
    public final w1 P;

    public p1(w1 w1Var, pj0 pj0Var, Context context, int i7, ai.e eVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(pj0Var, context, i7, 0, true, eVar, f6Var);
        this.P = w1Var;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        super.t(d1Var, i7);
        View view = d1Var.f57044a;
        if (!(view instanceof u1)) {
            return;
        }
        u1 u1Var = (u1) view;
        r1 r1Var = u1Var.f4792w;
        boolean f12 = this.P.f1(r1Var);
        u1Var.f4786c.f(f12, false);
        u1Var.f4790r.a(f12, false);
        u1Var.setOnClickListener(new r(4, this, r1Var));
    }
}
