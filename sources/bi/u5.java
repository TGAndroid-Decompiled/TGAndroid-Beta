package bi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.xa0;
public final class u5 implements o1.f {
    public final int f3716a;
    public final FrameLayout f3717b;
    public final boolean f3718c;

    public u5(FrameLayout frameLayout, boolean z10, int i10) {
        this.f3716a = i10;
        this.f3717b = frameLayout;
        this.f3718c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        int i10;
        switch (this.f3716a) {
            case 0:
                r7 r7Var = (r7) this.f3717b;
                p6 p6Var = r7Var.f3542w1;
                if (hVar == r7Var.C1) {
                    r7Var.C1 = null;
                    if (!this.f3718c) {
                        p6Var.setVisibility(8);
                        og.x0.e(r7Var.F1).g();
                        p6Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                r7 r7Var2 = (r7) this.f3717b;
                pg.t1 t1Var = r7Var2.f3522m1;
                if (hVar == r7Var2.f3540v1) {
                    r7Var2.f3540v1 = null;
                    if (!this.f3718c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                xa0 xa0Var = (xa0) this.f3717b;
                if (!z10) {
                    xa0Var.K = null;
                    boolean z11 = this.f3718c;
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    xa0Var.setVisibility(i10);
                    if (xa0Var.N && z11) {
                        xa0Var.N = false;
                        xa0Var.f28990b.setLayoutManager(xa0Var.getNeededLayoutManager());
                        xa0Var.I = true;
                        xa0Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
