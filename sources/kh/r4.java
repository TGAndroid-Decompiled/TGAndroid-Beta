package kh;

import android.widget.FrameLayout;
import org.telegram.ui.Components.w90;
public final class r4 implements o1.f {
    public final int f15925a;
    public final FrameLayout f15926b;
    public final boolean f15927c;

    public r4(FrameLayout frameLayout, boolean z10, int i9) {
        this.f15925a = i9;
        this.f15926b = frameLayout;
        this.f15927c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        int i9;
        switch (this.f15925a) {
            case 0:
                g6 g6Var = (g6) this.f15926b;
                h5 h5Var = g6Var.f15302s1;
                if (hVar == g6Var.f15314y1) {
                    g6Var.f15314y1 = null;
                    if (!this.f15927c) {
                        h5Var.setVisibility(8);
                        xf.s0.e(g6Var.B1).g();
                        h5Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                g6 g6Var2 = (g6) this.f15926b;
                yf.t1 t1Var = g6Var2.f15283i1;
                if (hVar == g6Var2.f15300r1) {
                    g6Var2.f15300r1 = null;
                    if (!this.f15927c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                w90 w90Var = (w90) this.f15926b;
                if (!z10) {
                    w90Var.G = null;
                    boolean z11 = this.f15927c;
                    if (z11) {
                        i9 = 8;
                    } else {
                        i9 = 0;
                    }
                    w90Var.setVisibility(i9);
                    if (w90Var.J && z11) {
                        w90Var.J = false;
                        w90Var.f34156b.setLayoutManager(w90Var.getNeededLayoutManager());
                        w90Var.E = true;
                        w90Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
