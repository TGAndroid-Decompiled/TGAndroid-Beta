package lh;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.qc;
public final class r1 extends mh.g5 {
    public final g2 f12921o1;

    public r1(g2 g2Var, Context context, int i10, long j10, g6 g6Var) {
        super(context, i10, j10, g6Var, null);
        this.f12921o1 = g2Var;
    }

    @Override
    public final qc getBulletinFactory() {
        g6 g6Var;
        g2 g2Var = this.f12921o1;
        org.telegram.ui.ActionBar.f3 f3Var = g2Var.container;
        g6Var = g2Var.resourcesProvider;
        return new qc(f3Var, g6Var);
    }
}
