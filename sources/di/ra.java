package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.fh0;
public final class ra implements o1.f {
    public final int f7724a;
    public final float f7725b;
    public final Object f7726c;

    public ra(Object obj, float f7, int i10) {
        this.f7724a = i10;
        this.f7726c = obj;
        this.f7725b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f7724a) {
            case 0:
                kc kcVar = (kc) this.f7726c;
                if (!z10) {
                    kcVar.M0.setTranslationY(this.f7725b);
                    kcVar.M0.K = false;
                    kcVar.f7280o2 = null;
                    kcVar.f7283p2 = null;
                    return;
                }
                return;
            case 1:
                fi.p4 p4Var = (fi.p4) this.f7726c;
                p4Var.v = null;
                float f11 = this.f7725b;
                if (!z10) {
                    p4Var.f9475f = f11;
                    p4Var.c();
                    return;
                }
                p4Var.h = f11;
                return;
            default:
                dh0 dh0Var = (dh0) this.f7726c;
                if (!z10) {
                    fh0 fh0Var = dh0Var.d;
                    o1.l lVar = fh0Var.M.f16468u;
                    int i10 = fh0Var.H;
                    float f12 = (i10 / 2.0f) + this.f7725b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f16474i = dp;
                    return;
                }
                return;
        }
    }
}
