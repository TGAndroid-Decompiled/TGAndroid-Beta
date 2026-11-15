package fi;

import android.widget.FrameLayout;
import org.telegram.ui.w61;
public final class t7 implements r1.d {
    public final int f12370a;
    public final FrameLayout f12371b;

    public t7(int i7, FrameLayout frameLayout) {
        this.f12370a = i7;
        this.f12371b = frameLayout;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f12370a) {
            case 0:
                a8 a8Var = (a8) this.f12371b;
                a8Var.f11422e0 = f10;
                a8Var.f11424g0 = f11;
                return;
            case 1:
                hi.m5 m5Var = (hi.m5) this.f12371b;
                float f12 = f10 / 1000.0f;
                m5Var.f14663d1 = f12;
                tg.j1 j1Var = m5Var.W0;
                j1Var.setAlpha(f12);
                j1Var.invalidate();
                m5Var.E0.invalidate();
                m5Var.V0.getTypefaceCell().setAlpha(1.0f - m5Var.f14663d1);
                return;
            case 2:
                pg.i iVar = (pg.i) this.f12371b;
                float f13 = f10 / 1000.0f;
                w61 w61Var = iVar.f55040a;
                w61Var.setPivotX(org.telegram.messenger.g0.L(28.0f));
                w61Var.setPivotY(org.telegram.messenger.g0.L(28.0f));
                w61Var.setScaleX(f13);
                w61Var.setScaleY(f13);
                w61Var.setAlpha(c8.i9.a(f13, 0.0f, 1.0f));
                iVar.invalidate();
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f12371b;
                float f14 = f10 / 1000.0f;
                g0Var.n1 = f14;
                tg.j1 j1Var2 = g0Var.f57273f1;
                j1Var2.setAlpha(f14);
                j1Var2.invalidate();
                g0Var.N0.invalidate();
                g0Var.f57272e1.getTypefaceCell().setAlpha(1.0f - g0Var.n1);
                return;
        }
    }
}
