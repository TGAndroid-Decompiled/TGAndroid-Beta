package kh;

import android.content.Context;
import org.telegram.ui.Components.qc;
public final class r1 extends lh.g5 {
    public final h2 f10776o1;

    public r1(h2 h2Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, j10, f6Var, null);
        this.f10776o1 = h2Var;
    }

    @Override
    public final qc getBulletinFactory() {
        org.telegram.ui.ActionBar.f6 f6Var;
        h2 h2Var = this.f10776o1;
        org.telegram.ui.ActionBar.e3 e3Var = h2Var.container;
        f6Var = h2Var.resourcesProvider;
        return new qc(e3Var, f6Var);
    }
}
