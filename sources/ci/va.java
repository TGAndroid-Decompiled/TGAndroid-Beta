package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.og0;
public final class va implements o1.f {
    public final int f5669a;
    public final float f5670b;
    public final Object f5671c;

    public va(Object obj, float f7, int i10) {
        this.f5669a = i10;
        this.f5671c = obj;
        this.f5670b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f5669a) {
            case 0:
                oc ocVar = (oc) this.f5671c;
                if (!z10) {
                    ocVar.M0.setTranslationY(this.f5670b);
                    ocVar.M0.K = false;
                    ocVar.f5251o2 = null;
                    ocVar.f5254p2 = null;
                    return;
                }
                return;
            case 1:
                ei.p4 p4Var = (ei.p4) this.f5671c;
                p4Var.v = null;
                float f11 = this.f5670b;
                if (!z10) {
                    p4Var.f8551f = f11;
                    p4Var.c();
                    return;
                }
                p4Var.h = f11;
                return;
            default:
                mg0 mg0Var = (mg0) this.f5671c;
                if (!z10) {
                    og0 og0Var = mg0Var.d;
                    o1.l lVar = og0Var.M.f15522u;
                    int i10 = og0Var.H;
                    float f12 = (i10 / 2.0f) + this.f5670b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f15528i = dp;
                    return;
                }
                return;
        }
    }
}
