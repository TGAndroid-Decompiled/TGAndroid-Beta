package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.v90;
public final class c4 implements r1.c {
    public final int f14272a;
    public final FrameLayout f14273b;
    public final boolean f14274c;

    public c4(FrameLayout frameLayout, boolean z10, int i7) {
        this.f14272a = i7;
        this.f14273b = frameLayout;
        this.f14274c = z10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        int i7;
        switch (this.f14272a) {
            case 0:
                l5 l5Var = (l5) this.f14273b;
                t4 t4Var = l5Var.f14894g1;
                if (gVar == l5Var.f14904m1) {
                    l5Var.f14904m1 = null;
                    if (!this.f14274c) {
                        t4Var.setVisibility(8);
                        sg.k0.e(l5Var.f14909p1).g();
                        t4Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                l5 l5Var2 = (l5) this.f14273b;
                tg.k1 k1Var = l5Var2.W0;
                if (gVar == l5Var2.f14892f1) {
                    l5Var2.f14892f1 = null;
                    if (!this.f14274c) {
                        k1Var.setVisibility(8);
                    }
                    k1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                v90 v90Var = (v90) this.f14273b;
                if (!z10) {
                    v90Var.L = null;
                    boolean z11 = this.f14274c;
                    if (z11) {
                        i7 = 8;
                    } else {
                        i7 = 0;
                    }
                    v90Var.setVisibility(i7);
                    if (v90Var.O && z11) {
                        v90Var.O = false;
                        v90Var.f40695b.setLayoutManager(v90Var.getNeededLayoutManager());
                        v90Var.J = true;
                        v90Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
