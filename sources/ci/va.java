package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.rg0;
public final class va implements o1.f {
    public final int f5667a;
    public final float f5668b;
    public final Object f5669c;

    public va(Object obj, float f7, int i10) {
        this.f5667a = i10;
        this.f5669c = obj;
        this.f5668b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f5667a) {
            case 0:
                oc ocVar = (oc) this.f5669c;
                if (!z10) {
                    ocVar.M0.setTranslationY(this.f5668b);
                    ocVar.M0.K = false;
                    ocVar.f5249o2 = null;
                    ocVar.f5252p2 = null;
                    return;
                }
                return;
            case 1:
                ei.p4 p4Var = (ei.p4) this.f5669c;
                p4Var.v = null;
                float f11 = this.f5668b;
                if (!z10) {
                    p4Var.f8550f = f11;
                    p4Var.c();
                    return;
                }
                p4Var.h = f11;
                return;
            default:
                pg0 pg0Var = (pg0) this.f5669c;
                if (!z10) {
                    rg0 rg0Var = pg0Var.d;
                    o1.l lVar = rg0Var.M.f15537u;
                    int i10 = rg0Var.H;
                    float f12 = (i10 / 2.0f) + this.f5668b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f15543i = dp;
                    return;
                }
                return;
        }
    }
}
