package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.fh0;
public final class ra implements o1.f {
    public final int f7727a;
    public final float f7728b;
    public final Object f7729c;

    public ra(Object obj, float f7, int i10) {
        this.f7727a = i10;
        this.f7729c = obj;
        this.f7728b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f7727a) {
            case 0:
                kc kcVar = (kc) this.f7729c;
                if (!z10) {
                    kcVar.M0.setTranslationY(this.f7728b);
                    kcVar.M0.K = false;
                    kcVar.f7283o2 = null;
                    kcVar.f7286p2 = null;
                    return;
                }
                return;
            case 1:
                fi.p4 p4Var = (fi.p4) this.f7729c;
                p4Var.v = null;
                float f11 = this.f7728b;
                if (!z10) {
                    p4Var.f9478f = f11;
                    p4Var.c();
                    return;
                }
                p4Var.h = f11;
                return;
            default:
                dh0 dh0Var = (dh0) this.f7729c;
                if (!z10) {
                    fh0 fh0Var = dh0Var.d;
                    o1.l lVar = fh0Var.M.f16161u;
                    int i10 = fh0Var.H;
                    float f12 = (i10 / 2.0f) + this.f7728b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f16167i = dp;
                    return;
                }
                return;
        }
    }
}
