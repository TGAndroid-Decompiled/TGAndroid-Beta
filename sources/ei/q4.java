package ei;

import android.widget.FrameLayout;
import org.telegram.ui.Components.hb0;
public final class q4 implements o1.f {
    public final int f9656a;
    public final FrameLayout f9657b;
    public final boolean f9658c;

    public q4(FrameLayout frameLayout, boolean z10, int i10) {
        this.f9656a = i10;
        this.f9657b = frameLayout;
        this.f9658c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        int i10;
        switch (this.f9656a) {
            case 0:
                f6 f6Var = (f6) this.f9657b;
                g5 g5Var = f6Var.f9052w1;
                if (hVar == f6Var.C1) {
                    f6Var.C1 = null;
                    if (!this.f9658c) {
                        g5Var.setVisibility(8);
                        qg.u0.e(f6Var.F1).g();
                        g5Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                f6 f6Var2 = (f6) this.f9657b;
                rg.u1 u1Var = f6Var2.f9032m1;
                if (hVar == f6Var2.f9050v1) {
                    f6Var2.f9050v1 = null;
                    if (!this.f9658c) {
                        u1Var.setVisibility(8);
                    }
                    u1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                hb0 hb0Var = (hb0) this.f9657b;
                if (!z10) {
                    hb0Var.K = null;
                    boolean z11 = this.f9658c;
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    hb0Var.setVisibility(i10);
                    if (hb0Var.N && z11) {
                        hb0Var.N = false;
                        hb0Var.f26993b.setLayoutManager(hb0Var.getNeededLayoutManager());
                        hb0Var.I = true;
                        hb0Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
