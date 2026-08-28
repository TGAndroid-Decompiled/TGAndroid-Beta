package fh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.oc;
public final class p1 extends u6 {
    public final p2 f6677t0;

    public p1(p2 p2Var, Context context, int i9, TL_stars.StarGift starGift, long j10, c1 c1Var, boolean z10, boolean z11) {
        super(context, i9, starGift, null, j10, c1Var, z10, z11);
        this.f6677t0 = p2Var;
    }

    @Override
    public final oc W() {
        org.telegram.ui.ActionBar.b6 b6Var;
        p2 p2Var = this.f6677t0;
        org.telegram.ui.ActionBar.d3 d3Var = p2Var.container;
        b6Var = p2Var.resourcesProvider;
        return new oc(d3Var, b6Var);
    }
}
