package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.Components.zg0;
public final class ea implements o1.f {
    public final int f8976a;
    public final float f8977b;
    public final Object f8978c;

    public ea(Object obj, float f7, int i10) {
        this.f8976a = i10;
        this.f8978c = obj;
        this.f8977b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f8976a) {
            case 0:
                vb vbVar = (vb) this.f8978c;
                if (!z10) {
                    vbVar.M0.setTranslationY(this.f8977b);
                    vbVar.M0.K = false;
                    vbVar.f9995o2 = null;
                    vbVar.f9998p2 = null;
                    return;
                }
                return;
            case 1:
                gi.e4 e4Var = (gi.e4) this.f8978c;
                e4Var.v = null;
                float f11 = this.f8977b;
                if (!z10) {
                    e4Var.f11187f = f11;
                    e4Var.c();
                    return;
                }
                e4Var.h = f11;
                return;
            default:
                xg0 xg0Var = (xg0) this.f8978c;
                if (!z10) {
                    zg0 zg0Var = xg0Var.d;
                    o1.l lVar = zg0Var.M.f17561u;
                    int i10 = zg0Var.H;
                    float f12 = (i10 / 2.0f) + this.f8977b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f17567i = dp;
                    return;
                }
                return;
        }
    }
}
