package ih;

import android.content.Context;
import org.telegram.ui.Components.tc;
public final class r1 extends e6 {
    public final h2 f9351t0;

    public r1(h2 h2Var, Context context, int i10, cg.n nVar, long j10, y0 y0Var) {
        super(context, i10, null, nVar, j10, y0Var, false, false);
        this.f9351t0 = h2Var;
    }

    @Override
    public final tc X() {
        org.telegram.ui.ActionBar.c6 c6Var;
        h2 h2Var = this.f9351t0;
        org.telegram.ui.ActionBar.d3 d3Var = h2Var.container;
        c6Var = h2Var.resourcesProvider;
        return new tc(d3Var, c6Var);
    }
}
