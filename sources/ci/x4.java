package ci;

import android.widget.FrameLayout;
import org.telegram.ui.Components.qb0;
public final class x4 implements o1.f {
    public final int f6296a;
    public final FrameLayout f6297b;
    public final boolean f6298c;

    public x4(FrameLayout frameLayout, boolean z10, int i10) {
        this.f6296a = i10;
        this.f6297b = frameLayout;
        this.f6298c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        int i10;
        switch (this.f6296a) {
            case 0:
                q6 q6Var = (q6) this.f6297b;
                p5 p5Var = q6Var.f5831w1;
                if (hVar == q6Var.C1) {
                    q6Var.C1 = null;
                    if (!this.f6298c) {
                        p5Var.setVisibility(8);
                        pg.u0.e(q6Var.F1).g();
                        p5Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                q6 q6Var2 = (q6) this.f6297b;
                qg.t1 t1Var = q6Var2.f5811m1;
                if (hVar == q6Var2.f5829v1) {
                    q6Var2.f5829v1 = null;
                    if (!this.f6298c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                qb0 qb0Var = (qb0) this.f6297b;
                if (!z10) {
                    qb0Var.K = null;
                    boolean z11 = this.f6298c;
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    qb0Var.setVisibility(i10);
                    if (qb0Var.N && z11) {
                        qb0Var.N = false;
                        qb0Var.f30113b.setLayoutManager(qb0Var.getNeededLayoutManager());
                        qb0Var.I = true;
                        qb0Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
