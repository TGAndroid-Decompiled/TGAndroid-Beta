package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
public final class p1 extends m41 {
    public final w1 P;

    public p1(w1 w1Var, qj0 qj0Var, Context context, int i7, ai.e eVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(qj0Var, context, i7, 0, true, eVar, g6Var);
        this.P = w1Var;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        super.t(d1Var, i7);
        View view = d1Var.f57056a;
        if (!(view instanceof u1)) {
            return;
        }
        u1 u1Var = (u1) view;
        r1 r1Var = u1Var.f4790w;
        boolean f12 = this.P.f1(r1Var);
        u1Var.f4784c.f(f12, false);
        u1Var.f4788r.a(f12, false);
        u1Var.setOnClickListener(new r(4, this, r1Var));
    }
}
