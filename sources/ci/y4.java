package ci;

import android.widget.FrameLayout;
import org.telegram.ui.Components.oa0;
public final class y4 implements o1.f {
    public final int f5870a;
    public final FrameLayout f5871b;
    public final boolean f5872c;

    public y4(FrameLayout frameLayout, boolean z10, int i10) {
        this.f5870a = i10;
        this.f5871b = frameLayout;
        this.f5872c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        int i10;
        switch (this.f5870a) {
            case 0:
                q6 q6Var = (q6) this.f5871b;
                q5 q5Var = q6Var.f5373w1;
                if (hVar == q6Var.C1) {
                    q6Var.C1 = null;
                    if (!this.f5872c) {
                        q5Var.setVisibility(8);
                        pg.t0.e(q6Var.F1).g();
                        q5Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                q6 q6Var2 = (q6) this.f5871b;
                qg.w1 w1Var = q6Var2.f5353m1;
                if (hVar == q6Var2.f5371v1) {
                    q6Var2.f5371v1 = null;
                    if (!this.f5872c) {
                        w1Var.setVisibility(8);
                    }
                    w1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                oa0 oa0Var = (oa0) this.f5871b;
                if (!z10) {
                    oa0Var.K = null;
                    boolean z11 = this.f5872c;
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    oa0Var.setVisibility(i10);
                    if (oa0Var.N && z11) {
                        oa0Var.N = false;
                        oa0Var.f26694b.setLayoutManager(oa0Var.getNeededLayoutManager());
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
