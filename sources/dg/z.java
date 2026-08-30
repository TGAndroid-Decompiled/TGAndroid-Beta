package dg;

import android.widget.FrameLayout;
import org.telegram.ui.Components.pa0;
public final class z implements o1.f {
    public final int f4872a;
    public final FrameLayout f4873b;
    public final boolean f4874c;

    public z(FrameLayout frameLayout, boolean z4, int i10) {
        this.f4872a = i10;
        this.f4873b = frameLayout;
        this.f4874c = z4;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        int i10;
        switch (this.f4872a) {
            case 0:
                e1 e1Var = (e1) this.f4873b;
                q2 q2Var = e1Var.f4485s1;
                if (hVar == e1Var.C1) {
                    e1Var.C1 = null;
                    if (!this.f4874c) {
                        q2Var.setVisibility(8);
                    }
                    q2Var.setMaskProvider(null);
                    return;
                }
                return;
            case 1:
                e1 e1Var2 = (e1) this.f4873b;
                z0 z0Var = e1Var2.D1;
                if (hVar == e1Var2.J1) {
                    e1Var2.J1 = null;
                    if (!this.f4874c) {
                        z0Var.setVisibility(8);
                        cg.f1.e(e1Var2.M1).g();
                        z0Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            default:
                pa0 pa0Var = (pa0) this.f4873b;
                if (!z4) {
                    pa0Var.H = null;
                    boolean z10 = this.f4874c;
                    if (z10) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    pa0Var.setVisibility(i10);
                    if (pa0Var.K && z10) {
                        pa0Var.K = false;
                        pa0Var.f27801b.setLayoutManager(pa0Var.getNeededLayoutManager());
                        pa0Var.F = true;
                        pa0Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
