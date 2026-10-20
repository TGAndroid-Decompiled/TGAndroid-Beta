package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.yg0;
public final class ea implements o1.f {
    public final int f8974a;
    public final float f8975b;
    public final Object f8976c;

    public ea(Object obj, float f7, int i10) {
        this.f8974a = i10;
        this.f8976c = obj;
        this.f8975b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f8974a) {
            case 0:
                vb vbVar = (vb) this.f8976c;
                if (!z10) {
                    vbVar.M0.setTranslationY(this.f8975b);
                    vbVar.M0.K = false;
                    vbVar.f9993o2 = null;
                    vbVar.f9996p2 = null;
                    return;
                }
                return;
            case 1:
                gi.e4 e4Var = (gi.e4) this.f8976c;
                e4Var.v = null;
                float f11 = this.f8975b;
                if (!z10) {
                    e4Var.f11185f = f11;
                    e4Var.c();
                    return;
                }
                e4Var.h = f11;
                return;
            default:
                yg0 yg0Var = (yg0) this.f8976c;
                if (!z10) {
                    ah0 ah0Var = yg0Var.d;
                    o1.l lVar = ah0Var.M.f17559u;
                    int i10 = ah0Var.H;
                    float f12 = (i10 / 2.0f) + this.f8975b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f17565i = dp;
                    return;
                }
                return;
        }
    }
}
