package ei;

import android.widget.FrameLayout;
import b8.be;
import org.telegram.ui.n61;
public final class a8 implements q1.d {
    public final int f10097a;
    public final FrameLayout f10098b;

    public a8(int i3, FrameLayout frameLayout) {
        this.f10097a = i3;
        this.f10098b = frameLayout;
    }

    @Override
    public final void a(q1.g gVar, float f10, float f11) {
        switch (this.f10097a) {
            case 0:
                h8 h8Var = (h8) this.f10098b;
                h8Var.f10377e0 = f10;
                h8Var.f10379g0 = f11;
                return;
            case 1:
                gi.m5 m5Var = (gi.m5) this.f10098b;
                float f12 = f10 / 1000.0f;
                m5Var.f13201d1 = f12;
                ug.i1 i1Var = m5Var.W0;
                i1Var.setAlpha(f12);
                i1Var.invalidate();
                m5Var.E0.invalidate();
                m5Var.V0.getTypefaceCell().setAlpha(1.0f - m5Var.f13201d1);
                return;
            case 2:
                qg.h hVar = (qg.h) this.f10098b;
                float f13 = f10 / 1000.0f;
                n61 n61Var = hVar.f53930a;
                n61Var.setPivotX(org.telegram.messenger.g0.L(28.0f));
                n61Var.setPivotY(org.telegram.messenger.g0.L(28.0f));
                n61Var.setScaleX(f13);
                n61Var.setScaleY(f13);
                n61Var.setAlpha(be.a(f13, 0.0f, 1.0f));
                hVar.invalidate();
                return;
            default:
                ug.f0 f0Var = (ug.f0) this.f10098b;
                float f14 = f10 / 1000.0f;
                f0Var.f55978n1 = f14;
                ug.i1 i1Var2 = f0Var.f55969f1;
                i1Var2.setAlpha(f14);
                i1Var2.invalidate();
                f0Var.N0.invalidate();
                f0Var.f55968e1.getTypefaceCell().setAlpha(1.0f - f0Var.f55978n1);
                return;
        }
    }
}
