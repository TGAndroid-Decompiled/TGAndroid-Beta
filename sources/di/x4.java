package di;

import android.widget.FrameLayout;
import org.telegram.ui.Components.ob0;
public final class x4 implements o1.f {
    public final int f8088a;
    public final FrameLayout f8089b;
    public final boolean f8090c;

    public x4(FrameLayout frameLayout, boolean z10, int i10) {
        this.f8088a = i10;
        this.f8089b = frameLayout;
        this.f8090c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        int i10;
        switch (this.f8088a) {
            case 0:
                o6 o6Var = (o6) this.f8089b;
                p5 p5Var = o6Var.f7557w1;
                if (hVar == o6Var.C1) {
                    o6Var.C1 = null;
                    if (!this.f8090c) {
                        p5Var.setVisibility(8);
                        qg.s0.e(o6Var.F1).g();
                        p5Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                o6 o6Var2 = (o6) this.f8089b;
                rg.v1 v1Var = o6Var2.f7537m1;
                if (hVar == o6Var2.f7555v1) {
                    o6Var2.f7555v1 = null;
                    if (!this.f8090c) {
                        v1Var.setVisibility(8);
                    }
                    v1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                ob0 ob0Var = (ob0) this.f8089b;
                if (!z10) {
                    ob0Var.K = null;
                    boolean z11 = this.f8090c;
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    ob0Var.setVisibility(i10);
                    if (ob0Var.N && z11) {
                        ob0Var.N = false;
                        ob0Var.f27625b.setLayoutManager(ob0Var.getNeededLayoutManager());
                        ob0Var.I = true;
                        ob0Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
