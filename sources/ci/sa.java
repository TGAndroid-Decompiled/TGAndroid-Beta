package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.ih0;
public final class sa implements o1.f {
    public final int f5961a;
    public final float f5962b;
    public final Object f5963c;

    public sa(Object obj, float f7, int i10) {
        this.f5961a = i10;
        this.f5963c = obj;
        this.f5962b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f5961a) {
            case 0:
                lc lcVar = (lc) this.f5963c;
                if (!z10) {
                    lcVar.M0.setTranslationY(this.f5962b);
                    lcVar.M0.K = false;
                    lcVar.f5504o2 = null;
                    lcVar.f5507p2 = null;
                    return;
                }
                return;
            case 1:
                ei.o4 o4Var = (ei.o4) this.f5963c;
                o4Var.v = null;
                float f11 = this.f5962b;
                if (!z10) {
                    o4Var.f9262f = f11;
                    o4Var.c();
                    return;
                }
                o4Var.h = f11;
                return;
            default:
                gh0 gh0Var = (gh0) this.f5963c;
                if (!z10) {
                    ih0 ih0Var = gh0Var.d;
                    o1.l lVar = ih0Var.M.f16988u;
                    int i10 = ih0Var.H;
                    float f12 = (i10 / 2.0f) + this.f5962b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f16995i = dp;
                    return;
                }
                return;
        }
    }
}
