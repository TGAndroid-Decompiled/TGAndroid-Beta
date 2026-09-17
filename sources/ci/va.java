package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.fg0;
public final class va implements o1.f {
    public final int f5668a;
    public final float f5669b;
    public final Object f5670c;

    public va(Object obj, float f7, int i10) {
        this.f5668a = i10;
        this.f5670c = obj;
        this.f5669b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f5668a) {
            case 0:
                oc ocVar = (oc) this.f5670c;
                if (!z10) {
                    ocVar.M0.setTranslationY(this.f5669b);
                    ocVar.M0.K = false;
                    ocVar.f5250o2 = null;
                    ocVar.f5253p2 = null;
                    return;
                }
                return;
            case 1:
                ei.p4 p4Var = (ei.p4) this.f5670c;
                p4Var.v = null;
                float f11 = this.f5669b;
                if (!z10) {
                    p4Var.f8551f = f11;
                    p4Var.c();
                    return;
                }
                p4Var.h = f11;
                return;
            default:
                dg0 dg0Var = (dg0) this.f5670c;
                if (!z10) {
                    fg0 fg0Var = dg0Var.d;
                    o1.l lVar = fg0Var.M.f15361u;
                    int i10 = fg0Var.H;
                    float f12 = (i10 / 2.0f) + this.f5669b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f15367i = dp;
                    return;
                }
                return;
        }
    }
}
