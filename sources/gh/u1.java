package gh;

import android.content.Context;
import org.telegram.ui.Components.mc;

public final class u1 extends m6 {

    public final k2 f7549t0;

    public u1(k2 k2Var, Context context, int i10, ag.p pVar, long j10, a1 a1Var) {
        super(context, i10, null, pVar, j10, a1Var, false, false);
        this.f7549t0 = k2Var;
    }

    @Override
    public final mc X() {
        k2 k2Var = this.f7549t0;
        return new mc(k2Var.container, k2Var.resourcesProvider);
    }
}
