package ci;

import android.widget.FrameLayout;
import org.telegram.ui.Components.cb0;
public final class y4 implements o1.f {
    public final int f5882a;
    public final FrameLayout f5883b;
    public final boolean f5884c;

    public y4(FrameLayout frameLayout, boolean z10, int i10) {
        this.f5882a = i10;
        this.f5883b = frameLayout;
        this.f5884c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        int i10;
        switch (this.f5882a) {
            case 0:
                q6 q6Var = (q6) this.f5883b;
                q5 q5Var = q6Var.f5382w1;
                if (hVar == q6Var.C1) {
                    q6Var.C1 = null;
                    if (!this.f5884c) {
                        q5Var.setVisibility(8);
                        pg.u0.e(q6Var.F1).g();
                        q5Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                q6 q6Var2 = (q6) this.f5883b;
                qg.u1 u1Var = q6Var2.f5362m1;
                if (hVar == q6Var2.f5380v1) {
                    q6Var2.f5380v1 = null;
                    if (!this.f5884c) {
                        u1Var.setVisibility(8);
                    }
                    u1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                cb0 cb0Var = (cb0) this.f5883b;
                if (!z10) {
                    cb0Var.K = null;
                    boolean z11 = this.f5884c;
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    cb0Var.setVisibility(i10);
                    if (cb0Var.N && z11) {
                        cb0Var.N = false;
                        cb0Var.f23248b.setLayoutManager(cb0Var.getNeededLayoutManager());
                        cb0Var.I = true;
                        cb0Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
