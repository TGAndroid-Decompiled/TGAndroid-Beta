package gi;

import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.ie0;
public final class g9 implements q1.c {
    public final int f12842a;
    public final float f12843b;
    public final Object f12844c;

    public g9(Object obj, float f10, int i3) {
        this.f12842a = i3;
        this.f12844c = obj;
        this.f12843b = f10;
    }

    @Override
    public final void a(q1.g gVar, boolean z10, float f10, float f11) {
        float L;
        switch (this.f12842a) {
            case 0:
                va vaVar = (va) this.f12844c;
                if (!z10) {
                    vaVar.N0.setTranslationY(this.f12843b);
                    vaVar.N0.L = false;
                    vaVar.f13747p2 = null;
                    vaVar.f13750q2 = null;
                    return;
                }
                return;
            case 1:
                ii.c4 c4Var = (ii.c4) this.f12844c;
                c4Var.f14882w = null;
                float f12 = this.f12843b;
                if (!z10) {
                    c4Var.f14878f = f12;
                    c4Var.c();
                    return;
                }
                c4Var.h = f12;
                return;
            default:
                fe0 fe0Var = (fe0) this.f12844c;
                if (!z10) {
                    ie0 ie0Var = fe0Var.d;
                    q1.h hVar = ie0Var.N.f53653m;
                    int i3 = ie0Var.I;
                    float f13 = (i3 / 2.0f) + this.f12843b;
                    int i10 = org.telegram.messenger.g0.f22608q.x;
                    if (f13 >= i10 / 2.0f) {
                        L = (i10 - i3) - org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(16.0f);
                    }
                    hVar.f53661i = L;
                    return;
                }
                return;
        }
    }
}
