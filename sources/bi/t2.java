package bi;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.kc;
public final class t2 extends f9 {
    public final p3 f4073v2;

    public t2(p3 p3Var, Context context, int i7, TL_stars.StarGift starGift, long j3, j2 j2Var, boolean z10, boolean z11) {
        super(context, i7, starGift, null, j3, j2Var, z10, z11);
        this.f4073v2 = p3Var;
    }

    @Override
    public final kc f1() {
        p3 p3Var = this.f4073v2;
        return new kc(p3Var.f30229c, p3Var.J0);
    }
}
