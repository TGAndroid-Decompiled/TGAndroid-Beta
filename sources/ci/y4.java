package ci;

import android.widget.FrameLayout;
import org.telegram.ui.Components.bb0;
public final class y4 implements o1.f {
    public final int f6337a;
    public final FrameLayout f6338b;
    public final boolean f6339c;

    public y4(FrameLayout frameLayout, boolean z10, int i10) {
        this.f6337a = i10;
        this.f6338b = frameLayout;
        this.f6339c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        int i10;
        switch (this.f6337a) {
            case 0:
                q6 q6Var = (q6) this.f6338b;
                q5 q5Var = q6Var.f5788w1;
                if (hVar == q6Var.C1) {
                    q6Var.C1 = null;
                    if (!this.f6339c) {
                        q5Var.setVisibility(8);
                        pg.u0.e(q6Var.F1).g();
                        q5Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                q6 q6Var2 = (q6) this.f6338b;
                qg.t1 t1Var = q6Var2.f5768m1;
                if (hVar == q6Var2.f5786v1) {
                    q6Var2.f5786v1 = null;
                    if (!this.f6339c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                bb0 bb0Var = (bb0) this.f6338b;
                if (!z10) {
                    bb0Var.K = null;
                    boolean z11 = this.f6339c;
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    bb0Var.setVisibility(i10);
                    if (bb0Var.N && z11) {
                        bb0Var.N = false;
                        bb0Var.f24927b.setLayoutManager(bb0Var.getNeededLayoutManager());
                        bb0Var.I = true;
                        bb0Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
