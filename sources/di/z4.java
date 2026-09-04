package di;

import android.widget.FrameLayout;
import org.telegram.ui.Components.oa0;
public final class z4 implements o1.f {
    public final int f8517a;
    public final FrameLayout f8518b;
    public final boolean f8519c;

    public z4(FrameLayout frameLayout, boolean z10, int i10) {
        this.f8517a = i10;
        this.f8518b = frameLayout;
        this.f8519c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        int i10;
        switch (this.f8517a) {
            case 0:
                q6 q6Var = (q6) this.f8518b;
                r5 r5Var = q6Var.f7995w1;
                if (hVar == q6Var.C1) {
                    q6Var.C1 = null;
                    if (!this.f8519c) {
                        r5Var.setVisibility(8);
                        qg.s0.e(q6Var.F1).g();
                        r5Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                q6 q6Var2 = (q6) this.f8518b;
                rg.v1 v1Var = q6Var2.f7975m1;
                if (hVar == q6Var2.f7993v1) {
                    q6Var2.f7993v1 = null;
                    if (!this.f8519c) {
                        v1Var.setVisibility(8);
                    }
                    v1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                oa0 oa0Var = (oa0) this.f8518b;
                if (!z10) {
                    oa0Var.K = null;
                    boolean z11 = this.f8519c;
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    oa0Var.setVisibility(i10);
                    if (oa0Var.N && z11) {
                        oa0Var.N = false;
                        oa0Var.f29018b.setLayoutManager(oa0Var.getNeededLayoutManager());
                        oa0Var.I = true;
                        oa0Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
