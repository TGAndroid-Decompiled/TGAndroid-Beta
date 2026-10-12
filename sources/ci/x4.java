package ci;

import android.widget.FrameLayout;
import org.telegram.ui.Components.tb0;
public final class x4 implements o1.f {
    public final int f6295a;
    public final FrameLayout f6296b;
    public final boolean f6297c;

    public x4(FrameLayout frameLayout, boolean z10, int i10) {
        this.f6295a = i10;
        this.f6296b = frameLayout;
        this.f6297c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        int i10;
        switch (this.f6295a) {
            case 0:
                q6 q6Var = (q6) this.f6296b;
                p5 p5Var = q6Var.f5830w1;
                if (hVar == q6Var.C1) {
                    q6Var.C1 = null;
                    if (!this.f6297c) {
                        p5Var.setVisibility(8);
                        pg.t0.e(q6Var.F1).g();
                        p5Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                q6 q6Var2 = (q6) this.f6296b;
                qg.t1 t1Var = q6Var2.f5810m1;
                if (hVar == q6Var2.f5828v1) {
                    q6Var2.f5828v1 = null;
                    if (!this.f6297c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                tb0 tb0Var = (tb0) this.f6296b;
                if (!z10) {
                    tb0Var.K = null;
                    boolean z11 = this.f6297c;
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    tb0Var.setVisibility(i10);
                    if (tb0Var.N && z11) {
                        tb0Var.N = false;
                        tb0Var.f30839b.setLayoutManager(tb0Var.getNeededLayoutManager());
                        tb0Var.I = true;
                        tb0Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
