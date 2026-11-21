package bi;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lc;
public final class r2 extends d9 {
    public final n3 f4047v2;

    public r2(n3 n3Var, Context context, int i7, TL_stars.StarGift starGift, long j3, h2 h2Var, boolean z10, boolean z11) {
        super(context, i7, starGift, null, j3, h2Var, z10, z11);
        this.f4047v2 = n3Var;
    }

    @Override
    public final lc f1() {
        n3 n3Var = this.f4047v2;
        return new lc(n3Var.f30176c, n3Var.J0);
    }
}
