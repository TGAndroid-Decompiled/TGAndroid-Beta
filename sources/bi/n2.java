package bi;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lc;
public final class n2 extends z8 {
    public final j3 f3875v2;

    public n2(j3 j3Var, Context context, int i7, TL_stars.StarGift starGift, long j3, d2 d2Var, boolean z10, boolean z11) {
        super(context, i7, starGift, null, j3, d2Var, z10, z11);
        this.f3875v2 = j3Var;
    }

    @Override
    public final lc f1() {
        j3 j3Var = this.f3875v2;
        return new lc(j3Var.f30193c, j3Var.J0);
    }
}
