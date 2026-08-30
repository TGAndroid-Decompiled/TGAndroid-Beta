package kh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
public final class i1 extends e6 {
    public final h2 f10667u0;

    public i1(h2 h2Var, Context context, int i10, TL_stars.StarGift starGift, long j10, x0 x0Var, boolean z4, boolean z10) {
        super(context, i10, starGift, null, j10, x0Var, z4, z10);
        this.f10667u0 = h2Var;
    }

    @Override
    public final qc X() {
        org.telegram.ui.ActionBar.f6 f6Var;
        h2 h2Var = this.f10667u0;
        org.telegram.ui.ActionBar.e3 e3Var = h2Var.container;
        f6Var = h2Var.resourcesProvider;
        return new qc(e3Var, f6Var);
    }
}
