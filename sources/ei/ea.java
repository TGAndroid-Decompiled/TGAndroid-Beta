package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.Components.zg0;
public final class ea implements o1.f {
    public final int f8977a;
    public final float f8978b;
    public final Object f8979c;

    public ea(Object obj, float f7, int i10) {
        this.f8977a = i10;
        this.f8979c = obj;
        this.f8978b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f8977a) {
            case 0:
                vb vbVar = (vb) this.f8979c;
                if (!z10) {
                    vbVar.M0.setTranslationY(this.f8978b);
                    vbVar.M0.K = false;
                    vbVar.f9996o2 = null;
                    vbVar.f9999p2 = null;
                    return;
                }
                return;
            case 1:
                gi.e4 e4Var = (gi.e4) this.f8979c;
                e4Var.v = null;
                float f11 = this.f8978b;
                if (!z10) {
                    e4Var.f11188f = f11;
                    e4Var.c();
                    return;
                }
                e4Var.h = f11;
                return;
            default:
                xg0 xg0Var = (xg0) this.f8979c;
                if (!z10) {
                    zg0 zg0Var = xg0Var.d;
                    o1.l lVar = zg0Var.M.f17562u;
                    int i10 = zg0Var.H;
                    float f12 = (i10 / 2.0f) + this.f8978b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f17568i = dp;
                    return;
                }
                return;
        }
    }
}
