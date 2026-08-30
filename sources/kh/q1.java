package kh;

import android.content.Context;
import org.telegram.ui.Components.qc;
public final class q1 extends e6 {
    public final h2 f10758u0;

    public q1(h2 h2Var, Context context, int i10, eg.n nVar, long j10, x0 x0Var) {
        super(context, i10, null, nVar, j10, x0Var, false, false);
        this.f10758u0 = h2Var;
    }

    @Override
    public final qc X() {
        org.telegram.ui.ActionBar.f6 f6Var;
        h2 h2Var = this.f10758u0;
        org.telegram.ui.ActionBar.e3 e3Var = h2Var.container;
        f6Var = h2Var.resourcesProvider;
        return new qc(e3Var, f6Var);
    }
}
