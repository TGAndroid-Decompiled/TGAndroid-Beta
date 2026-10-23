package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bh0;
import org.telegram.ui.Components.dh0;
public final class ea implements o1.f {
    public final int f8985a;
    public final float f8986b;
    public final Object f8987c;

    public ea(Object obj, float f7, int i10) {
        this.f8985a = i10;
        this.f8987c = obj;
        this.f8986b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f8985a) {
            case 0:
                vb vbVar = (vb) this.f8987c;
                if (!z10) {
                    vbVar.M0.setTranslationY(this.f8986b);
                    vbVar.M0.K = false;
                    vbVar.f10010o2 = null;
                    vbVar.f10013p2 = null;
                    return;
                }
                return;
            case 1:
                gi.e4 e4Var = (gi.e4) this.f8987c;
                e4Var.v = null;
                float f11 = this.f8986b;
                if (!z10) {
                    e4Var.f11207f = f11;
                    e4Var.c();
                    return;
                }
                e4Var.h = f11;
                return;
            default:
                bh0 bh0Var = (bh0) this.f8987c;
                if (!z10) {
                    dh0 dh0Var = bh0Var.d;
                    o1.l lVar = dh0Var.M.f17622u;
                    int i10 = dh0Var.H;
                    float f12 = (i10 / 2.0f) + this.f8986b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f17628i = dp;
                    return;
                }
                return;
        }
    }
}
