package kh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.qc;
public final class i1 extends d6 {
    public final g2 f10774u0;

    public i1(g2 g2Var, Context context, int i10, TL_stars.StarGift starGift, long j10, x0 x0Var, boolean z4, boolean z10) {
        super(context, i10, starGift, null, j10, x0Var, z4, z10);
        this.f10774u0 = g2Var;
    }

    @Override
    public final qc X() {
        f6 f6Var;
        g2 g2Var = this.f10774u0;
        org.telegram.ui.ActionBar.e3 e3Var = g2Var.container;
        f6Var = g2Var.resourcesProvider;
        return new qc(e3Var, f6Var);
    }
}
