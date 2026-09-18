package ci;

import android.widget.FrameLayout;
import org.telegram.ui.Components.na0;
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
                        pg.s0.e(r6Var.F1).g();
                        r5Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                r6 r6Var2 = (r6) this.f5867b;
                qg.w1 w1Var = r6Var2.f5431m1;
                if (hVar == r6Var2.f5449v1) {
                    r6Var2.f5449v1 = null;
                    if (!this.f5868c) {
                        w1Var.setVisibility(8);
                    }
                    w1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                na0 na0Var = (na0) this.f5867b;
                if (!z10) {
                    na0Var.K = null;
                    boolean z11 = this.f5868c;
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    na0Var.setVisibility(i10);
                    if (na0Var.N && z11) {
                        na0Var.N = false;
                        na0Var.f26428b.setLayoutManager(na0Var.getNeededLayoutManager());
                        na0Var.I = true;
                        na0Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
