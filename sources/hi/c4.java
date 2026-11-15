package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.j90;
public final class c4 implements r1.c {
    public final int f13978a;
    public final FrameLayout f13979b;
    public final boolean f13980c;

    public c4(FrameLayout frameLayout, boolean z10, int i7) {
        this.f13978a = i7;
        this.f13979b = frameLayout;
        this.f13980c = z10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        int i7;
        switch (this.f13978a) {
            case 0:
                m5 m5Var = (m5) this.f13979b;
                u4 u4Var = m5Var.f14668g1;
                if (gVar == m5Var.f14678m1) {
                    m5Var.f14678m1 = null;
                    if (!this.f13980c) {
                        u4Var.setVisibility(8);
                        sg.k0.e(m5Var.f14683p1).g();
                        u4Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m5 m5Var2 = (m5) this.f13979b;
                tg.j1 j1Var = m5Var2.W0;
                if (gVar == m5Var2.f14666f1) {
                    m5Var2.f14666f1 = null;
                    if (!this.f13980c) {
                        j1Var.setVisibility(8);
                    }
                    j1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                j90 j90Var = (j90) this.f13979b;
                if (!z10) {
                    j90Var.L = null;
                    boolean z11 = this.f13980c;
                    if (z11) {
                        i7 = 8;
                    } else {
                        i7 = 0;
                    }
                    j90Var.setVisibility(i7);
                    if (j90Var.O && z11) {
                        j90Var.O = false;
                        j90Var.f35920b.setLayoutManager(j90Var.getNeededLayoutManager());
                        j90Var.J = true;
                        j90Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
