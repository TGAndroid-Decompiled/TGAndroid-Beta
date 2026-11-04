package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.tj0;
public final class i1 extends f41 {
    public final p1 Q;

    public i1(p1 p1Var, tj0 tj0Var, Context context, int i3, ai.c cVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(tj0Var, context, i3, 0, true, cVar, e6Var);
        this.Q = p1Var;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        super.t(d1Var, i3);
        View view = d1Var.f55540a;
        if (!(view instanceof n1)) {
            return;
        }
        n1 n1Var = (n1) view;
        k1 k1Var = n1Var.f5584w;
        boolean f12 = this.Q.f1(k1Var);
        n1Var.f5578c.f(f12, false);
        n1Var.f5582r.a(f12, false);
        n1Var.setOnClickListener(new ai.d(9, this, k1Var));
    }
}
