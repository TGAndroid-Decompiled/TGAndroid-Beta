package di;

import android.widget.FrameLayout;
import org.telegram.ui.Components.oa0;
public final class z4 implements o1.f {
    public final int f8545a;
    public final FrameLayout f8546b;
    public final boolean f8547c;

    public z4(FrameLayout frameLayout, boolean z10, int i10) {
        this.f8545a = i10;
        this.f8546b = frameLayout;
        this.f8547c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        int i10;
        switch (this.f8545a) {
            case 0:
                q6 q6Var = (q6) this.f8546b;
                r5 r5Var = q6Var.f8023w1;
                if (hVar == q6Var.C1) {
                    q6Var.C1 = null;
                    if (!this.f8547c) {
                        r5Var.setVisibility(8);
                        qg.s0.e(q6Var.F1).g();
                        r5Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                q6 q6Var2 = (q6) this.f8546b;
                rg.v1 v1Var = q6Var2.f8003m1;
                if (hVar == q6Var2.f8021v1) {
                    q6Var2.f8021v1 = null;
                    if (!this.f8547c) {
                        v1Var.setVisibility(8);
                    }
                    v1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                oa0 oa0Var = (oa0) this.f8546b;
                if (!z10) {
                    oa0Var.K = null;
                    boolean z11 = this.f8547c;
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    oa0Var.setVisibility(i10);
                    if (oa0Var.N && z11) {
                        oa0Var.N = false;
                        oa0Var.f29045b.setLayoutManager(oa0Var.getNeededLayoutManager());
                        oa0Var.I = true;
                        oa0Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
