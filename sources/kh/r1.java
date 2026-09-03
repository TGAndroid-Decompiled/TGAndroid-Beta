package kh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.qc;
public final class r1 extends lh.g5 {
    public final g2 f10890o1;

    public r1(g2 g2Var, Context context, int i10, long j10, f6 f6Var) {
        super(context, i10, j10, f6Var, null);
        this.f10890o1 = g2Var;
    }

    @Override
    public final qc getBulletinFactory() {
        f6 f6Var;
        g2 g2Var = this.f10890o1;
        org.telegram.ui.ActionBar.e3 e3Var = g2Var.container;
        f6Var = g2Var.resourcesProvider;
        return new qc(e3Var, f6Var);
    }
}
