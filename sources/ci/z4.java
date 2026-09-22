package ci;

import android.widget.FrameLayout;
import org.telegram.ui.Components.ya0;
public final class z4 implements o1.f {
    public final int f5865a;
    public final FrameLayout f5866b;
    public final boolean f5867c;

    public z4(FrameLayout frameLayout, boolean z10, int i10) {
        this.f5865a = i10;
        this.f5866b = frameLayout;
        this.f5867c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        int i10;
        switch (this.f5865a) {
            case 0:
                r6 r6Var = (r6) this.f5866b;
                r5 r5Var = r6Var.f5450w1;
                if (hVar == r6Var.C1) {
                    r6Var.C1 = null;
                    if (!this.f5867c) {
                        r5Var.setVisibility(8);
                        pg.u0.e(r6Var.F1).g();
                        r5Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                r6 r6Var2 = (r6) this.f5866b;
                qg.u1 u1Var = r6Var2.f5430m1;
                if (hVar == r6Var2.f5448v1) {
                    r6Var2.f5448v1 = null;
                    if (!this.f5867c) {
                        u1Var.setVisibility(8);
                    }
                    u1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                ya0 ya0Var = (ya0) this.f5866b;
                if (!z10) {
                    ya0Var.K = null;
                    boolean z11 = this.f5867c;
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    ya0Var.setVisibility(i10);
                    if (ya0Var.N && z11) {
                        ya0Var.N = false;
                        ya0Var.f30616b.setLayoutManager(ya0Var.getNeededLayoutManager());
                        ya0Var.I = true;
                        ya0Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
