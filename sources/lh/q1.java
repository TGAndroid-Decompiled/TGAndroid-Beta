package lh;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.qc;
public final class q1 extends e6 {
    public final g2 f12906u0;

    public q1(g2 g2Var, Context context, int i10, fg.n nVar, long j10, x0 x0Var) {
        super(context, i10, null, nVar, j10, x0Var, false, false);
        this.f12906u0 = g2Var;
    }

    @Override
    public final qc X() {
        g6 g6Var;
        g2 g2Var = this.f12906u0;
        org.telegram.ui.ActionBar.f3 f3Var = g2Var.container;
        g6Var = g2Var.resourcesProvider;
        return new qc(f3Var, g6Var);
    }
}
