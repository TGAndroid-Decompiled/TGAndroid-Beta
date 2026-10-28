package fi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.hb0;
public final class p4 implements o1.f {
    public final int f11435a;
    public final FrameLayout f11436b;
    public final boolean f11437c;

    public p4(FrameLayout frameLayout, boolean z10, int i10) {
        this.f11435a = i10;
        this.f11436b = frameLayout;
        this.f11437c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        int i10;
        switch (this.f11435a) {
            case 0:
                e6 e6Var = (e6) this.f11436b;
                f5 f5Var = e6Var.l1;
                if (hVar == e6Var.f10810r1) {
                    e6Var.f10810r1 = null;
                    if (!this.f11437c) {
                        f5Var.setVisibility(8);
                        rg.s0.e(e6Var.f10816u1).g();
                        f5Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                e6 e6Var2 = (e6) this.f11436b;
                sg.u1 u1Var = e6Var2.f10779b1;
                if (hVar == e6Var2.f10797k1) {
                    e6Var2.f10797k1 = null;
                    if (!this.f11437c) {
                        u1Var.setVisibility(8);
                    }
                    u1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                hb0 hb0Var = (hb0) this.f11436b;
                if (!z10) {
                    hb0Var.K = null;
                    boolean z11 = this.f11437c;
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    hb0Var.setVisibility(i10);
                    if (hb0Var.N && z11) {
                        hb0Var.N = false;
                        hb0Var.f28941b.setLayoutManager(hb0Var.getNeededLayoutManager());
                        hb0Var.I = true;
                        hb0Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
