package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.v90;
public final class b4 implements r1.c {
    public final int f14292a;
    public final FrameLayout f14293b;
    public final boolean f14294c;

    public b4(FrameLayout frameLayout, boolean z10, int i7) {
        this.f14292a = i7;
        this.f14293b = frameLayout;
        this.f14294c = z10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        int i7;
        switch (this.f14292a) {
            case 0:
                k5 k5Var = (k5) this.f14293b;
                s4 s4Var = k5Var.f14882g1;
                if (gVar == k5Var.f14892m1) {
                    k5Var.f14892m1 = null;
                    if (!this.f14294c) {
                        s4Var.setVisibility(8);
                        sg.k0.e(k5Var.f14897p1).g();
                        s4Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                k5 k5Var2 = (k5) this.f14293b;
                tg.k1 k1Var = k5Var2.W0;
                if (gVar == k5Var2.f14880f1) {
                    k5Var2.f14880f1 = null;
                    if (!this.f14294c) {
                        k1Var.setVisibility(8);
                    }
                    k1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                v90 v90Var = (v90) this.f14293b;
                if (!z10) {
                    v90Var.L = null;
                    boolean z11 = this.f14294c;
                    if (z11) {
                        i7 = 8;
                    } else {
                        i7 = 0;
                    }
                    v90Var.setVisibility(i7);
                    if (v90Var.O && z11) {
                        v90Var.O = false;
                        v90Var.f40743b.setLayoutManager(v90Var.getNeededLayoutManager());
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
