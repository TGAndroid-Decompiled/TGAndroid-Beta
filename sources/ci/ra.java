package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.rg0;
public final class ra implements o1.f {
    public final int f5461a;
    public final float f5462b;
    public final Object f5463c;

    public ra(Object obj, float f7, int i10) {
        this.f5461a = i10;
        this.f5463c = obj;
        this.f5462b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f5461a) {
            case 0:
                kc kcVar = (kc) this.f5463c;
                if (!z10) {
                    kcVar.M0.setTranslationY(this.f5462b);
                    kcVar.M0.K = false;
                    kcVar.f5028o2 = null;
                    kcVar.f5031p2 = null;
                    return;
                }
                return;
            case 1:
                ei.p4 p4Var = (ei.p4) this.f5463c;
                p4Var.v = null;
                float f11 = this.f5462b;
                if (!z10) {
                    p4Var.f8536f = f11;
                    p4Var.c();
                    return;
                }
                p4Var.h = f11;
                return;
            default:
                pg0 pg0Var = (pg0) this.f5463c;
                if (!z10) {
                    rg0 rg0Var = pg0Var.d;
                    o1.l lVar = rg0Var.M.f15572u;
                    int i10 = rg0Var.H;
                    float f12 = (i10 / 2.0f) + this.f5462b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f15578i = dp;
                    return;
                }
                return;
        }
    }
}
