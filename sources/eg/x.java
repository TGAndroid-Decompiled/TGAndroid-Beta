package eg;

import android.widget.FrameLayout;
import org.telegram.ui.Components.ra0;
public final class x implements o1.f {
    public final int f5540a;
    public final FrameLayout f5541b;
    public final boolean f5542c;

    public x(FrameLayout frameLayout, boolean z4, int i10) {
        this.f5540a = i10;
        this.f5541b = frameLayout;
        this.f5542c = z4;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        int i10;
        switch (this.f5540a) {
            case 0:
                c1 c1Var = (c1) this.f5541b;
                o2 o2Var = c1Var.f5128s1;
                if (hVar == c1Var.C1) {
                    c1Var.C1 = null;
                    if (!this.f5542c) {
                        o2Var.setVisibility(8);
                    }
                    o2Var.setMaskProvider(null);
                    return;
                }
                return;
            case 1:
                c1 c1Var2 = (c1) this.f5541b;
                x0 x0Var = c1Var2.D1;
                if (hVar == c1Var2.J1) {
                    c1Var2.J1 = null;
                    if (!this.f5542c) {
                        x0Var.setVisibility(8);
                        dg.e1.e(c1Var2.M1).g();
                        x0Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            default:
                ra0 ra0Var = (ra0) this.f5541b;
                if (!z4) {
                    ra0Var.H = null;
                    boolean z10 = this.f5542c;
                    if (z10) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    ra0Var.setVisibility(i10);
                    if (ra0Var.K && z10) {
                        ra0Var.K = false;
                        ra0Var.f30660b.setLayoutManager(ra0Var.getNeededLayoutManager());
                        ra0Var.F = true;
                        ra0Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
