package dg;

import android.widget.FrameLayout;
import org.telegram.ui.Components.qa0;
public final class z implements o1.f {
    public final int f4878a;
    public final FrameLayout f4879b;
    public final boolean f4880c;

    public z(FrameLayout frameLayout, boolean z4, int i10) {
        this.f4878a = i10;
        this.f4879b = frameLayout;
        this.f4880c = z4;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        int i10;
        switch (this.f4878a) {
            case 0:
                e1 e1Var = (e1) this.f4879b;
                q2 q2Var = e1Var.f4491s1;
                if (hVar == e1Var.C1) {
                    e1Var.C1 = null;
                    if (!this.f4880c) {
                        q2Var.setVisibility(8);
                    }
                    q2Var.setMaskProvider(null);
                    return;
                }
                return;
            case 1:
                e1 e1Var2 = (e1) this.f4879b;
                z0 z0Var = e1Var2.D1;
                if (hVar == e1Var2.J1) {
                    e1Var2.J1 = null;
                    if (!this.f4880c) {
                        z0Var.setVisibility(8);
                        cg.f1.e(e1Var2.M1).g();
                        z0Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            default:
                qa0 qa0Var = (qa0) this.f4879b;
                if (!z4) {
                    qa0Var.H = null;
                    boolean z10 = this.f4880c;
                    if (z10) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    qa0Var.setVisibility(i10);
                    if (qa0Var.K && z10) {
                        qa0Var.K = false;
                        qa0Var.f28127b.setLayoutManager(qa0Var.getNeededLayoutManager());
                        qa0Var.F = true;
                        qa0Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
