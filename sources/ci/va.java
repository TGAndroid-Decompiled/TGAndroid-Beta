package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.eg0;
public final class va implements o1.f {
    public final int f5665a;
    public final float f5666b;
    public final Object f5667c;

    public va(Object obj, float f7, int i10) {
        this.f5665a = i10;
        this.f5667c = obj;
        this.f5666b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f5665a) {
            case 0:
                oc ocVar = (oc) this.f5667c;
                if (!z10) {
                    ocVar.M0.setTranslationY(this.f5666b);
                    ocVar.M0.K = false;
                    ocVar.f5247o2 = null;
                    ocVar.f5250p2 = null;
                    return;
                }
                return;
            case 1:
                ei.p4 p4Var = (ei.p4) this.f5667c;
                p4Var.v = null;
                float f11 = this.f5666b;
                if (!z10) {
                    p4Var.f8548f = f11;
                    p4Var.c();
                    return;
                }
                p4Var.h = f11;
                return;
            default:
                cg0 cg0Var = (cg0) this.f5667c;
                if (!z10) {
                    eg0 eg0Var = cg0Var.d;
                    o1.l lVar = eg0Var.M.f15349u;
                    int i10 = eg0Var.H;
                    float f12 = (i10 / 2.0f) + this.f5666b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f15355i = dp;
                    return;
                }
                return;
        }
    }
}
