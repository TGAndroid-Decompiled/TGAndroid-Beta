package gi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.c90;
public final class d4 implements q1.c {
    public final int f12580a;
    public final FrameLayout f12581b;
    public final boolean f12582c;

    public d4(FrameLayout frameLayout, boolean z10, int i3) {
        this.f12580a = i3;
        this.f12581b = frameLayout;
        this.f12582c = z10;
    }

    @Override
    public final void a(q1.g gVar, boolean z10, float f10, float f11) {
        int i3;
        switch (this.f12580a) {
            case 0:
                m5 m5Var = (m5) this.f12581b;
                u4 u4Var = m5Var.f13207g1;
                if (gVar == m5Var.m1) {
                    m5Var.m1 = null;
                    if (!this.f12582c) {
                        u4Var.setVisibility(8);
                        tg.k0.e(m5Var.f13222p1).g();
                        u4Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m5 m5Var2 = (m5) this.f12581b;
                ug.i1 i1Var = m5Var2.W0;
                if (gVar == m5Var2.f13205f1) {
                    m5Var2.f13205f1 = null;
                    if (!this.f12582c) {
                        i1Var.setVisibility(8);
                    }
                    i1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                c90 c90Var = (c90) this.f12581b;
                if (!z10) {
                    c90Var.L = null;
                    boolean z11 = this.f12582c;
                    if (z11) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                    c90Var.setVisibility(i3);
                    if (c90Var.O && z11) {
                        c90Var.O = false;
                        c90Var.f32611b.setLayoutManager(c90Var.getNeededLayoutManager());
                        c90Var.J = true;
                        c90Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
