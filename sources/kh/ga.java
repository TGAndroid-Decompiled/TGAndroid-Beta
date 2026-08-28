package kh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.pf0;
public final class ga implements o1.f {
    public final int f15323a;
    public final float f15324b;
    public final Object f15325c;

    public ga(Object obj, float f10, int i9) {
        this.f15323a = i9;
        this.f15325c = obj;
        this.f15324b = f10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        float dp;
        switch (this.f15323a) {
            case 0:
                wb wbVar = (wb) this.f15325c;
                if (!z10) {
                    wbVar.I0.setTranslationY(this.f15324b);
                    wbVar.I0.G = false;
                    wbVar.f16282k2 = null;
                    wbVar.f16284l2 = null;
                    return;
                }
                return;
            case 1:
                mh.f4 f4Var = (mh.f4) this.f15325c;
                f4Var.v = null;
                float f12 = this.f15324b;
                if (!z10) {
                    f4Var.f17841f = f12;
                    f4Var.c();
                    return;
                }
                f4Var.h = f12;
                return;
            default:
                nf0 nf0Var = (nf0) this.f15325c;
                if (!z10) {
                    pf0 pf0Var = nf0Var.d;
                    o1.k kVar = pf0Var.I.f18800u;
                    int i9 = pf0Var.D;
                    float f13 = (i9 / 2.0f) + this.f15324b;
                    int i10 = AndroidUtilities.displaySize.x;
                    if (f13 >= i10 / 2.0f) {
                        dp = (i10 - i9) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    kVar.f18807i = dp;
                    return;
                }
                return;
        }
    }
}
