package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.hh0;
public final class sa implements o1.f {
    public final int f5962a;
    public final float f5963b;
    public final Object f5964c;

    public sa(Object obj, float f7, int i10) {
        this.f5962a = i10;
        this.f5964c = obj;
        this.f5963b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f5962a) {
            case 0:
                lc lcVar = (lc) this.f5964c;
                if (!z10) {
                    lcVar.M0.setTranslationY(this.f5963b);
                    lcVar.M0.K = false;
                    lcVar.f5505o2 = null;
                    lcVar.f5508p2 = null;
                    return;
                }
                return;
            case 1:
                ei.o4 o4Var = (ei.o4) this.f5964c;
                o4Var.v = null;
                float f11 = this.f5963b;
                if (!z10) {
                    o4Var.f9263f = f11;
                    o4Var.c();
                    return;
                }
                o4Var.h = f11;
                return;
            default:
                fh0 fh0Var = (fh0) this.f5964c;
                if (!z10) {
                    hh0 hh0Var = fh0Var.d;
                    o1.l lVar = hh0Var.M.f16942u;
                    int i10 = hh0Var.H;
                    float f12 = (i10 / 2.0f) + this.f5963b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f16949i = dp;
                    return;
                }
                return;
        }
    }
}
