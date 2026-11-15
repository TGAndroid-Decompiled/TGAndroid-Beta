package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.uj0;
public final class b1 extends p41 {
    public final i1 Q;

    public b1(i1 i1Var, uj0 uj0Var, Context context, int i7, bi.b bVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(uj0Var, context, i7, 0, true, bVar, e6Var);
        this.Q = i1Var;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        super.t(e1Var, i7);
        View view = e1Var.f58535a;
        if (!(view instanceof g1)) {
            return;
        }
        g1 g1Var = (g1) view;
        d1 d1Var = g1Var.f8586w;
        boolean f12 = this.Q.f1(d1Var);
        g1Var.f8580c.f(f12, false);
        g1Var.f8584r.a(f12, false);
        g1Var.setOnClickListener(new ai.t2(11, this, d1Var));
    }
}
