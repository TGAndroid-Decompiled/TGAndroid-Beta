package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.lm0;
public final class t1 extends a71 {
    public final a2 P;

    public t1(a2 a2Var, lm0 lm0Var, Context context, int i10, q qVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(lm0Var, context, i10, 0, true, qVar, g6Var);
        this.P = a2Var;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        super.v(b1Var, i10);
        View view = b1Var.f46342a;
        if (!(view instanceof y1)) {
            return;
        }
        y1 y1Var = (y1) view;
        v1 v1Var = y1Var.v;
        boolean S = this.P.S(v1Var);
        y1Var.f2476c.f(S, false);
        y1Var.f2479r.a(S, false);
        y1Var.setOnClickListener(new p(4, this, v1Var));
    }
}
