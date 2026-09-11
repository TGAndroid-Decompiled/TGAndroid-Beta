package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.eg0;
public final class va implements o1.f {
    public final int f8297a;
    public final float f8298b;
    public final Object f8299c;

    public va(Object obj, float f7, int i10) {
        this.f8297a = i10;
        this.f8299c = obj;
        this.f8298b = f7;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        float dp;
        switch (this.f8297a) {
            case 0:
                pc pcVar = (pc) this.f8299c;
                if (!z10) {
                    pcVar.M0.setTranslationY(this.f8298b);
                    pcVar.M0.K = false;
                    pcVar.f7888o2 = null;
                    pcVar.f7891p2 = null;
                    return;
                }
                return;
            case 1:
                fi.q4 q4Var = (fi.q4) this.f8299c;
                q4Var.v = null;
                float f11 = this.f8298b;
                if (!z10) {
                    q4Var.f9908f = f11;
                    q4Var.c();
                    return;
                }
                q4Var.h = f11;
                return;
            default:
                cg0 cg0Var = (cg0) this.f8299c;
                if (!z10) {
                    eg0 eg0Var = cg0Var.d;
                    o1.l lVar = eg0Var.M.f16825u;
                    int i10 = eg0Var.H;
                    float f12 = (i10 / 2.0f) + this.f8298b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f16832i = dp;
                    return;
                }
                return;
        }
    }
}
