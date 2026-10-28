package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bh0;
import org.telegram.ui.Components.dh0;
public final class aa implements o1.f {
    public final int f10516a;
    public final float f10517b;
    public final Object f10518c;

    public aa(Object obj, float f7, int i10) {
        this.f10516a = i10;
        this.f10518c = obj;
        this.f10517b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f10516a) {
            case 0:
                sb sbVar = (sb) this.f10518c;
                if (!z10) {
                    sbVar.M0.setTranslationY(this.f10517b);
                    sbVar.M0.K = false;
                    sbVar.f11650o2 = null;
                    sbVar.f11653p2 = null;
                    return;
                }
                return;
            case 1:
                hi.n4 n4Var = (hi.n4) this.f10518c;
                n4Var.v = null;
                float f11 = this.f10517b;
                if (!z10) {
                    n4Var.f13157f = f11;
                    n4Var.c();
                    return;
                }
                n4Var.h = f11;
                return;
            default:
                bh0 bh0Var = (bh0) this.f10518c;
                if (!z10) {
                    dh0 dh0Var = bh0Var.d;
                    o1.k kVar = dh0Var.M.f18968u;
                    int i10 = dh0Var.H;
                    float f12 = (i10 / 2.0f) + this.f10517b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    kVar.f18974i = dp;
                    return;
                }
                return;
        }
    }
}
