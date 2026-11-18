package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.t90;
public final class c4 implements r1.c {
    public final int f14308a;
    public final FrameLayout f14309b;
    public final boolean f14310c;

    public c4(FrameLayout frameLayout, boolean z10, int i7) {
        this.f14308a = i7;
        this.f14309b = frameLayout;
        this.f14310c = z10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        int i7;
        switch (this.f14308a) {
            case 0:
                l5 l5Var = (l5) this.f14309b;
                s4 s4Var = l5Var.f14904g1;
                if (gVar == l5Var.f14914m1) {
                    l5Var.f14914m1 = null;
                    if (!this.f14310c) {
                        s4Var.setVisibility(8);
                        sg.k0.e(l5Var.f14919p1).g();
                        s4Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                l5 l5Var2 = (l5) this.f14309b;
                tg.j1 j1Var = l5Var2.W0;
                if (gVar == l5Var2.f14902f1) {
                    l5Var2.f14902f1 = null;
                    if (!this.f14310c) {
                        j1Var.setVisibility(8);
                    }
                    j1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                t90 t90Var = (t90) this.f14309b;
                if (!z10) {
                    t90Var.L = null;
                    boolean z11 = this.f14310c;
                    if (z11) {
                        i7 = 8;
                    } else {
                        i7 = 0;
                    }
                    t90Var.setVisibility(i7);
                    if (t90Var.O && z11) {
                        t90Var.O = false;
                        t90Var.f39946b.setLayoutManager(t90Var.getNeededLayoutManager());
                        t90Var.J = true;
                        t90Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
