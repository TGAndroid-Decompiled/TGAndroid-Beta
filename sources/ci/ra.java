package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.rg0;
public final class ra implements o1.f {
    public final int f5874a;
    public final float f5875b;
    public final Object f5876c;

    public ra(Object obj, float f7, int i10) {
        this.f5874a = i10;
        this.f5876c = obj;
        this.f5875b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f5874a) {
            case 0:
                kc kcVar = (kc) this.f5876c;
                if (!z10) {
                    kcVar.M0.setTranslationY(this.f5875b);
                    kcVar.M0.K = false;
                    kcVar.f5420o2 = null;
                    kcVar.f5423p2 = null;
                    return;
                }
                return;
            case 1:
                ei.q4 q4Var = (ei.q4) this.f5876c;
                q4Var.v = null;
                float f11 = this.f5875b;
                if (!z10) {
                    q4Var.f9286f = f11;
                    q4Var.c();
                    return;
                }
                q4Var.h = f11;
                return;
            default:
                pg0 pg0Var = (pg0) this.f5876c;
                if (!z10) {
                    rg0 rg0Var = pg0Var.d;
                    o1.l lVar = rg0Var.M.f16984u;
                    int i10 = rg0Var.H;
                    float f12 = (i10 / 2.0f) + this.f5875b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f16991i = dp;
                    return;
                }
                return;
        }
    }
}
