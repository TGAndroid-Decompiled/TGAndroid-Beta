package ih;

import android.content.Context;
import org.telegram.ui.Components.tc;
public final class s1 extends jh.h5 {
    public final h2 f9370n1;

    public s1(h2 h2Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, j10, c6Var, null);
        this.f9370n1 = h2Var;
    }

    @Override
    public final tc getBulletinFactory() {
        org.telegram.ui.ActionBar.c6 c6Var;
        h2 h2Var = this.f9370n1;
        org.telegram.ui.ActionBar.d3 d3Var = h2Var.container;
        c6Var = h2Var.resourcesProvider;
        return new tc(d3Var, c6Var);
    }
}
