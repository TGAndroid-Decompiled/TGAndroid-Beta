package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.og0;
public final class sa implements o1.f {
    public final int f5501a;
    public final float f5502b;
    public final Object f5503c;

    public sa(Object obj, float f7, int i10) {
        this.f5501a = i10;
        this.f5503c = obj;
        this.f5502b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f5501a) {
            case 0:
                lc lcVar = (lc) this.f5503c;
                if (!z10) {
                    lcVar.M0.setTranslationY(this.f5502b);
                    lcVar.M0.K = false;
                    lcVar.f5072o2 = null;
                    lcVar.f5075p2 = null;
                    return;
                }
                return;
            case 1:
                ei.p4 p4Var = (ei.p4) this.f5503c;
                p4Var.v = null;
                float f11 = this.f5502b;
                if (!z10) {
                    p4Var.f8533f = f11;
                    p4Var.c();
                    return;
                }
                p4Var.h = f11;
                return;
            default:
                mg0 mg0Var = (mg0) this.f5503c;
                if (!z10) {
                    og0 og0Var = mg0Var.d;
                    o1.l lVar = og0Var.M.f15518u;
                    int i10 = og0Var.H;
                    float f12 = (i10 / 2.0f) + this.f5502b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f15524i = dp;
                    return;
                }
                return;
        }
    }
}
