package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.rg0;
public final class sa implements o1.f {
    public final int f5510a;
    public final float f5511b;
    public final Object f5512c;

    public sa(Object obj, float f7, int i10) {
        this.f5510a = i10;
        this.f5512c = obj;
        this.f5511b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f5510a) {
            case 0:
                lc lcVar = (lc) this.f5512c;
                if (!z10) {
                    lcVar.M0.setTranslationY(this.f5511b);
                    lcVar.M0.K = false;
                    lcVar.f5079o2 = null;
                    lcVar.f5082p2 = null;
                    return;
                }
                return;
            case 1:
                ei.p4 p4Var = (ei.p4) this.f5512c;
                p4Var.v = null;
                float f11 = this.f5511b;
                if (!z10) {
                    p4Var.f8545f = f11;
                    p4Var.c();
                    return;
                }
                p4Var.h = f11;
                return;
            default:
                pg0 pg0Var = (pg0) this.f5512c;
                if (!z10) {
                    rg0 rg0Var = pg0Var.d;
                    o1.l lVar = rg0Var.M.f15549u;
                    int i10 = rg0Var.H;
                    float f12 = (i10 / 2.0f) + this.f5511b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f15555i = dp;
                    return;
                }
                return;
        }
    }
}
