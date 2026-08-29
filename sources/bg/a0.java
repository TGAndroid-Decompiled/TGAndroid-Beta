package bg;

import android.widget.FrameLayout;
import org.telegram.ui.Components.ka0;
public final class a0 implements o1.g {
    public final int f2077a;
    public final FrameLayout f2078b;
    public final boolean f2079c;

    public a0(FrameLayout frameLayout, boolean z10, int i10) {
        this.f2077a = i10;
        this.f2078b = frameLayout;
        this.f2079c = z10;
    }

    @Override
    public final void a(o1.i iVar, boolean z10, float f9, float f10) {
        int i10;
        switch (this.f2077a) {
            case 0:
                g1 g1Var = (g1) this.f2078b;
                t2 t2Var = g1Var.f2249r1;
                if (iVar == g1Var.B1) {
                    g1Var.B1 = null;
                    if (!this.f2079c) {
                        t2Var.setVisibility(8);
                    }
                    t2Var.setMaskProvider(null);
                    return;
                }
                return;
            case 1:
                g1 g1Var2 = (g1) this.f2078b;
                a1 a1Var = g1Var2.C1;
                if (iVar == g1Var2.I1) {
                    g1Var2.I1 = null;
                    if (!this.f2079c) {
                        a1Var.setVisibility(8);
                        ag.h1.e(g1Var2.L1).g();
                        a1Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            default:
                ka0 ka0Var = (ka0) this.f2078b;
                if (!z10) {
                    ka0Var.G = null;
                    boolean z11 = this.f2079c;
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    ka0Var.setVisibility(i10);
                    if (ka0Var.J && z11) {
                        ka0Var.J = false;
                        ka0Var.f29996b.setLayoutManager(ka0Var.getNeededLayoutManager());
                        ka0Var.E = true;
                        ka0Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
