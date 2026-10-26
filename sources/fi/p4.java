package fi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.gb0;
public final class p4 implements o1.f {
    public final int f11436a;
    public final FrameLayout f11437b;
    public final boolean f11438c;

    public p4(FrameLayout frameLayout, boolean z10, int i10) {
        this.f11436a = i10;
        this.f11437b = frameLayout;
        this.f11438c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        int i10;
        switch (this.f11436a) {
            case 0:
                e6 e6Var = (e6) this.f11437b;
                f5 f5Var = e6Var.l1;
                if (hVar == e6Var.f10811r1) {
                    e6Var.f10811r1 = null;
                    if (!this.f11438c) {
                        f5Var.setVisibility(8);
                        rg.s0.e(e6Var.f10817u1).g();
                        f5Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                e6 e6Var2 = (e6) this.f11437b;
                sg.v1 v1Var = e6Var2.f10780b1;
                if (hVar == e6Var2.f10798k1) {
                    e6Var2.f10798k1 = null;
                    if (!this.f11438c) {
                        v1Var.setVisibility(8);
                    }
                    v1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                gb0 gb0Var = (gb0) this.f11437b;
                if (!z10) {
                    gb0Var.K = null;
                    boolean z11 = this.f11438c;
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    gb0Var.setVisibility(i10);
                    if (gb0Var.N && z11) {
                        gb0Var.N = false;
                        gb0Var.f28520b.setLayoutManager(gb0Var.getNeededLayoutManager());
                        gb0Var.I = true;
                        gb0Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
