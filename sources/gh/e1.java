package gh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class e1 extends z41 {
    public final l1 J;

    public e1(l1 l1Var, wk0 wk0Var, Context context, int i9, bh.c cVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(wk0Var, context, i9, 0, true, cVar, b6Var);
        this.J = l1Var;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        super.v(q1Var, i9);
        View view = q1Var.f5501a;
        if (!(view instanceof j1)) {
            return;
        }
        j1 j1Var = (j1) view;
        g1 g1Var = j1Var.v;
        boolean Q = this.J.Q(g1Var);
        j1Var.f8326c.f(Q, false);
        j1Var.f8330r.a(Q, false);
        j1Var.setOnClickListener(new bg.u1(16, this, g1Var));
    }
}
