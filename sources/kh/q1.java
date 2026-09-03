package kh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.qc;
public final class q1 extends d6 {
    public final g2 f10872u0;

    public q1(g2 g2Var, Context context, int i10, eg.n nVar, long j10, x0 x0Var) {
        super(context, i10, null, nVar, j10, x0Var, false, false);
        this.f10872u0 = g2Var;
    }

    @Override
    public final qc X() {
        f6 f6Var;
        g2 g2Var = this.f10872u0;
        org.telegram.ui.ActionBar.e3 e3Var = g2Var.container;
        f6Var = g2Var.resourcesProvider;
        return new qc(e3Var, f6Var);
    }
}
