package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.jh0;
public final class sa implements o1.f {
    public final int f5960a;
    public final float f5961b;
    public final Object f5962c;

    public sa(Object obj, float f7, int i10) {
        this.f5960a = i10;
        this.f5962c = obj;
        this.f5961b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f5960a) {
            case 0:
                lc lcVar = (lc) this.f5962c;
                if (!z10) {
                    lcVar.M0.setTranslationY(this.f5961b);
                    lcVar.M0.K = false;
                    lcVar.f5503o2 = null;
                    lcVar.f5506p2 = null;
                    return;
                }
                return;
            case 1:
                ei.o4 o4Var = (ei.o4) this.f5962c;
                o4Var.v = null;
                float f11 = this.f5961b;
                if (!z10) {
                    o4Var.f9260f = f11;
                    o4Var.c();
                    return;
                }
                o4Var.h = f11;
                return;
            default:
                hh0 hh0Var = (hh0) this.f5962c;
                if (!z10) {
                    jh0 jh0Var = hh0Var.d;
                    o1.l lVar = jh0Var.M.f16691u;
                    int i10 = jh0Var.H;
                    float f12 = (i10 / 2.0f) + this.f5961b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f16698i = dp;
                    return;
                }
                return;
        }
    }
}
