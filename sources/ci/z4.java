package ci;

import android.widget.FrameLayout;
import org.telegram.ui.Components.va0;
public final class z4 implements o1.f {
    public final int f5867a;
    public final FrameLayout f5868b;
    public final boolean f5869c;

    public z4(FrameLayout frameLayout, boolean z10, int i10) {
        this.f5867a = i10;
        this.f5868b = frameLayout;
        this.f5869c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        int i10;
        switch (this.f5867a) {
            case 0:
                r6 r6Var = (r6) this.f5868b;
                r5 r5Var = r6Var.f5452w1;
                if (hVar == r6Var.C1) {
                    r6Var.C1 = null;
                    if (!this.f5869c) {
                        r5Var.setVisibility(8);
                        pg.u0.e(r6Var.F1).g();
                        r5Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                r6 r6Var2 = (r6) this.f5868b;
                qg.u1 u1Var = r6Var2.f5432m1;
                if (hVar == r6Var2.f5450v1) {
                    r6Var2.f5450v1 = null;
                    if (!this.f5869c) {
                        u1Var.setVisibility(8);
                    }
                    u1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                va0 va0Var = (va0) this.f5868b;
                if (!z10) {
                    va0Var.K = null;
                    boolean z11 = this.f5869c;
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    va0Var.setVisibility(i10);
                    if (va0Var.N && z11) {
                        va0Var.N = false;
                        va0Var.f29046b.setLayoutManager(va0Var.getNeededLayoutManager());
                        va0Var.I = true;
                        va0Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
