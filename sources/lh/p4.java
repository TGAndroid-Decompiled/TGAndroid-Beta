package lh;

import android.widget.FrameLayout;
import org.telegram.ui.Components.aa0;

public final class p4 implements o1.f {

    public final int f16523a;

    public final FrameLayout f16524b;

    public final boolean f16525c;

    public p4(FrameLayout frameLayout, boolean z10, int i10) {
        this.f16523a = i10;
        this.f16524b = frameLayout;
        this.f16525c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.f16523a) {
            case 0:
                f6 f6Var = (f6) this.f16524b;
                g5 g5Var = f6Var.f15992s1;
                if (hVar == f6Var.f16004y1) {
                    f6Var.f16004y1 = null;
                    if (!this.f16525c) {
                        g5Var.setVisibility(8);
                        yf.r0.e(f6Var.B1).g();
                        g5Var.getAdapter().l();
                    }
                }
                break;
            case 1:
                f6 f6Var2 = (f6) this.f16524b;
                zf.t1 t1Var = f6Var2.f15973i1;
                if (hVar == f6Var2.f15990r1) {
                    f6Var2.f15990r1 = null;
                    if (!this.f16525c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                }
                break;
            default:
                aa0 aa0Var = (aa0) this.f16524b;
                if (!z10) {
                    aa0Var.G = null;
                    boolean z11 = this.f16525c;
                    aa0Var.setVisibility(z11 ? 8 : 0);
                    if (aa0Var.J && z11) {
                        aa0Var.J = false;
                        aa0Var.f26700b.setLayoutManager(aa0Var.getNeededLayoutManager());
                        aa0Var.E = true;
                        aa0Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
