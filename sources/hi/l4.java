package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.s90;
public final class l4 implements r1.c {
    public final int f14840a;
    public final FrameLayout f14841b;
    public final boolean f14842c;

    public l4(FrameLayout frameLayout, boolean z10, int i7) {
        this.f14840a = i7;
        this.f14841b = frameLayout;
        this.f14842c = z10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        int i7;
        switch (this.f14840a) {
            case 0:
                v5 v5Var = (v5) this.f14841b;
                d5 d5Var = v5Var.f15564g1;
                if (gVar == v5Var.f15577m1) {
                    v5Var.f15577m1 = null;
                    if (!this.f14842c) {
                        d5Var.setVisibility(8);
                        sg.j0.e(v5Var.f15583p1).g();
                        d5Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                v5 v5Var2 = (v5) this.f14841b;
                tg.o1 o1Var = v5Var2.W0;
                if (gVar == v5Var2.f15562f1) {
                    v5Var2.f15562f1 = null;
                    if (!this.f14842c) {
                        o1Var.setVisibility(8);
                    }
                    o1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                s90 s90Var = (s90) this.f14841b;
                if (!z10) {
                    s90Var.L = null;
                    boolean z11 = this.f14842c;
                    if (z11) {
                        i7 = 8;
                    } else {
                        i7 = 0;
                    }
                    s90Var.setVisibility(i7);
                    if (s90Var.O && z11) {
                        s90Var.O = false;
                        s90Var.f39535b.setLayoutManager(s90Var.getNeededLayoutManager());
                        s90Var.J = true;
                        s90Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
