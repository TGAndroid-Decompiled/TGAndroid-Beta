package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.og0;
public final class ec implements o1.f {
    public final int f2673a;
    public final float f2674b;
    public final Object f2675c;

    public ec(Object obj, float f7, int i10) {
        this.f2673a = i10;
        this.f2675c = obj;
        this.f2674b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f2673a) {
            case 0:
                ce ceVar = (ce) this.f2675c;
                if (!z10) {
                    ceVar.M0.setTranslationY(this.f2674b);
                    ceVar.M0.K = false;
                    ceVar.f2476o2 = null;
                    ceVar.f2479p2 = null;
                    return;
                }
                return;
            case 1:
                di.t4 t4Var = (di.t4) this.f2675c;
                t4Var.v = null;
                float f11 = this.f2674b;
                if (!z10) {
                    t4Var.f6919f = f11;
                    t4Var.c();
                    return;
                }
                t4Var.h = f11;
                return;
            default:
                mg0 mg0Var = (mg0) this.f2675c;
                if (!z10) {
                    og0 og0Var = mg0Var.d;
                    o1.l lVar = og0Var.M.f14134u;
                    int i10 = og0Var.H;
                    float f12 = (i10 / 2.0f) + this.f2674b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f14140i = dp;
                    return;
                }
                return;
        }
    }
}
