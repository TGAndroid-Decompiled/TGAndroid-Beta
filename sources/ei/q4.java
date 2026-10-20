package ei;

import android.widget.FrameLayout;
import org.telegram.ui.Components.ib0;
public final class q4 implements o1.f {
    public final int f9640a;
    public final FrameLayout f9641b;
    public final boolean f9642c;

    public q4(FrameLayout frameLayout, boolean z10, int i10) {
        this.f9640a = i10;
        this.f9641b = frameLayout;
        this.f9642c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        int i10;
        switch (this.f9640a) {
            case 0:
                f6 f6Var = (f6) this.f9641b;
                g5 g5Var = f6Var.f9041w1;
                if (hVar == f6Var.C1) {
                    f6Var.C1 = null;
                    if (!this.f9642c) {
                        g5Var.setVisibility(8);
                        qg.v0.e(f6Var.F1).g();
                        g5Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                f6 f6Var2 = (f6) this.f9641b;
                rg.t1 t1Var = f6Var2.f9021m1;
                if (hVar == f6Var2.f9039v1) {
                    f6Var2.f9039v1 = null;
                    if (!this.f9642c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                ib0 ib0Var = (ib0) this.f9641b;
                if (!z10) {
                    ib0Var.K = null;
                    boolean z11 = this.f9642c;
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    ib0Var.setVisibility(i10);
                    if (ib0Var.N && z11) {
                        ib0Var.N = false;
                        ib0Var.f27221b.setLayoutManager(ib0Var.getNeededLayoutManager());
                        ib0Var.I = true;
                        ib0Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
