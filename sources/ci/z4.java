package ci;

import android.widget.FrameLayout;
import org.telegram.ui.Components.wa0;
public final class z4 implements o1.f {
    public final int f5866a;
    public final FrameLayout f5867b;
    public final boolean f5868c;

    public z4(FrameLayout frameLayout, boolean z10, int i10) {
        this.f5866a = i10;
        this.f5867b = frameLayout;
        this.f5868c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        int i10;
        switch (this.f5866a) {
            case 0:
                r6 r6Var = (r6) this.f5867b;
                r5 r5Var = r6Var.f5451w1;
                if (hVar == r6Var.C1) {
                    r6Var.C1 = null;
                    if (!this.f5868c) {
                        r5Var.setVisibility(8);
                        pg.u0.e(r6Var.F1).g();
                        r5Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                r6 r6Var2 = (r6) this.f5867b;
                qg.t1 t1Var = r6Var2.f5431m1;
                if (hVar == r6Var2.f5449v1) {
                    r6Var2.f5449v1 = null;
                    if (!this.f5868c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                wa0 wa0Var = (wa0) this.f5867b;
                if (!z10) {
                    wa0Var.K = null;
                    boolean z11 = this.f5868c;
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    wa0Var.setVisibility(i10);
                    if (wa0Var.N && z11) {
                        wa0Var.N = false;
                        wa0Var.f30004b.setLayoutManager(wa0Var.getNeededLayoutManager());
                        wa0Var.I = true;
                        wa0Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
