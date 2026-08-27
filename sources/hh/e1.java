package hh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.zk0;

public final class e1 extends b51 {
    public final l1 J;

    public e1(l1 l1Var, zk0 zk0Var, Context context, int i10, ch.c cVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(zk0Var, context, i10, 0, true, cVar, c6Var);
        this.J = l1Var;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        super.v(o1Var, i10);
        View view = o1Var.f5789a;
        if (view instanceof j1) {
            j1 j1Var = (j1) view;
            g1 g1Var = j1Var.v;
            boolean zR = this.J.R(g1Var);
            j1Var.f9512c.f(zR, false);
            j1Var.f9516r.a(zR, false);
            j1Var.setOnClickListener(new ag.q0(17, this, g1Var));
        }
    }
}
