package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.v90;
public final class b4 implements r1.c {
    public final int f14289a;
    public final FrameLayout f14290b;
    public final boolean f14291c;

    public b4(FrameLayout frameLayout, boolean z10, int i7) {
        this.f14289a = i7;
        this.f14290b = frameLayout;
        this.f14291c = z10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        int i7;
        switch (this.f14289a) {
            case 0:
                k5 k5Var = (k5) this.f14290b;
                s4 s4Var = k5Var.f14879g1;
                if (gVar == k5Var.f14889m1) {
                    k5Var.f14889m1 = null;
                    if (!this.f14291c) {
                        s4Var.setVisibility(8);
                        sg.k0.e(k5Var.f14894p1).g();
                        s4Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                k5 k5Var2 = (k5) this.f14290b;
                tg.k1 k1Var = k5Var2.W0;
                if (gVar == k5Var2.f14877f1) {
                    k5Var2.f14877f1 = null;
                    if (!this.f14291c) {
                        k1Var.setVisibility(8);
                    }
                    k1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                v90 v90Var = (v90) this.f14290b;
                if (!z10) {
                    v90Var.L = null;
                    boolean z11 = this.f14291c;
                    if (z11) {
                        i7 = 8;
                    } else {
                        i7 = 0;
                    }
                    v90Var.setVisibility(i7);
                    if (v90Var.O && z11) {
                        v90Var.O = false;
                        v90Var.f40742b.setLayoutManager(v90Var.getNeededLayoutManager());
                        v90Var.J = true;
                        v90Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
