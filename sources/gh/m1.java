package gh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.mc;

public final class m1 extends m6 {

    public final k2 f7427t0;

    public m1(k2 k2Var, Context context, int i10, TL_stars.StarGift starGift, long j10, a1 a1Var, boolean z10, boolean z11) {
        super(context, i10, starGift, null, j10, a1Var, z10, z11);
        this.f7427t0 = k2Var;
    }

    @Override
    public final mc X() {
        k2 k2Var = this.f7427t0;
        return new mc(k2Var.container, k2Var.resourcesProvider);
    }
}
