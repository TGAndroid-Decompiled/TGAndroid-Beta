package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.ch0;
public final class aa implements o1.f {
    public final int f10517a;
    public final float f10518b;
    public final Object f10519c;

    public aa(Object obj, float f7, int i10) {
        this.f10517a = i10;
        this.f10519c = obj;
        this.f10518b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f10517a) {
            case 0:
                sb sbVar = (sb) this.f10519c;
                if (!z10) {
                    sbVar.M0.setTranslationY(this.f10518b);
                    sbVar.M0.K = false;
                    sbVar.f11651o2 = null;
                    sbVar.f11654p2 = null;
                    return;
                }
                return;
            case 1:
                hi.n4 n4Var = (hi.n4) this.f10519c;
                n4Var.v = null;
                float f11 = this.f10518b;
                if (!z10) {
                    n4Var.f13158f = f11;
                    n4Var.c();
                    return;
                }
                n4Var.h = f11;
                return;
            default:
                ah0 ah0Var = (ah0) this.f10519c;
                if (!z10) {
                    ch0 ch0Var = ah0Var.d;
                    o1.k kVar = ch0Var.M.f18969u;
                    int i10 = ch0Var.H;
                    float f12 = (i10 / 2.0f) + this.f10518b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    kVar.f18975i = dp;
                    return;
                }
                return;
        }
    }
}
