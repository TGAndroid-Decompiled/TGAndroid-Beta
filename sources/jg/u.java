package jg;

import android.widget.FrameLayout;
import org.telegram.ui.Components.y90;
public final class u implements o1.f {
    public final int f10288a;
    public final FrameLayout f10289b;
    public final boolean f10290c;

    public u(FrameLayout frameLayout, boolean z10, int i10) {
        this.f10288a = i10;
        this.f10289b = frameLayout;
        this.f10290c = z10;
    }

    @Override
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        int i10;
        switch (this.f10288a) {
            case 0:
                r0 r0Var = (r0) this.f10289b;
                a2 a2Var = r0Var.f10168e1;
                if (jVar == r0Var.f10182o1) {
                    r0Var.f10182o1 = null;
                    if (!this.f10290c) {
                        a2Var.setVisibility(8);
                    }
                    a2Var.setMaskProvider(null);
                    return;
                }
                return;
            case 1:
                r0 r0Var2 = (r0) this.f10289b;
                m0 m0Var = r0Var2.f10184p1;
                if (jVar == r0Var2.f10196v1) {
                    r0Var2.f10196v1 = null;
                    if (!this.f10290c) {
                        m0Var.setVisibility(8);
                        ig.s0.e(r0Var2.f10202y1).g();
                        m0Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
            default:
                y90 y90Var = (y90) this.f10289b;
                if (!z10) {
                    y90Var.K = null;
                    boolean z11 = this.f10290c;
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    y90Var.setVisibility(i10);
                    if (y90Var.N && z11) {
                        y90Var.N = false;
                        y90Var.f32781b.setLayoutManager(y90Var.getNeededLayoutManager());
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
