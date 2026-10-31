package jg;

import android.widget.FrameLayout;
import org.telegram.ui.Components.y90;
public final class u implements o1.f {
    public final int f10287a;
    public final FrameLayout f10288b;
    public final boolean f10289c;

    public u(FrameLayout frameLayout, boolean z10, int i10) {
        this.f10287a = i10;
        this.f10288b = frameLayout;
        this.f10289c = z10;
    }

    @Override
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        int i10;
        switch (this.f10287a) {
            case 0:
                r0 r0Var = (r0) this.f10288b;
                a2 a2Var = r0Var.f10167e1;
                if (jVar == r0Var.f10181o1) {
                    r0Var.f10181o1 = null;
                    if (!this.f10289c) {
                        a2Var.setVisibility(8);
                    }
                    a2Var.setMaskProvider(null);
                    return;
                }
                return;
            case 1:
                r0 r0Var2 = (r0) this.f10288b;
                m0 m0Var = r0Var2.f10183p1;
                if (jVar == r0Var2.f10195v1) {
                    r0Var2.f10195v1 = null;
                    if (!this.f10289c) {
                        m0Var.setVisibility(8);
                        ig.s0.e(r0Var2.f10201y1).g();
                        m0Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
            default:
                y90 y90Var = (y90) this.f10288b;
                if (!z10) {
                    y90Var.K = null;
                    boolean z11 = this.f10289c;
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    y90Var.setVisibility(i10);
                    if (y90Var.N && z11) {
                        y90Var.N = false;
                        y90Var.f32665b.setLayoutManager(y90Var.getNeededLayoutManager());
                        y90Var.I = true;
                        y90Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
