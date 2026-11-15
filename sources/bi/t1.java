package bi;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
public final class t1 extends u6 {
    public final s2 f3873v2;

    public t1(s2 s2Var, Context context, int i7, TL_stars.StarGift starGift, long j3, k1 k1Var, boolean z10, boolean z11) {
        super(context, i7, starGift, null, j3, k1Var, z10, z11);
        this.f3873v2 = s2Var;
    }

    @Override
    public final cc e1() {
        s2 s2Var = this.f3873v2;
        return new cc(s2Var.f29685c, s2Var.J0);
    }
}
