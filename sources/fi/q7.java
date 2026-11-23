package fi;

import android.widget.FrameLayout;
import org.telegram.ui.w61;
public final class q7 implements r1.d {
    public final int f12465a;
    public final FrameLayout f12466b;

    public q7(int i7, FrameLayout frameLayout) {
        this.f12465a = i7;
        this.f12466b = frameLayout;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f12465a) {
            case 0:
                x7 x7Var = (x7) this.f12466b;
                x7Var.f12744e0 = f10;
                x7Var.f12746g0 = f11;
                return;
            case 1:
                hi.v5 v5Var = (hi.v5) this.f12466b;
                float f12 = f10 / 1000.0f;
                v5Var.f15559d1 = f12;
                tg.o1 o1Var = v5Var.W0;
                o1Var.setAlpha(f12);
                o1Var.invalidate();
                v5Var.E0.invalidate();
                v5Var.V0.getTypefaceCell().setAlpha(1.0f - v5Var.f15559d1);
                return;
            case 2:
                pg.i iVar = (pg.i) this.f12466b;
                float f13 = f10 / 1000.0f;
                w61 w61Var = iVar.f55739a;
                w61Var.setPivotX(org.telegram.messenger.g0.L(28.0f));
                w61Var.setPivotY(org.telegram.messenger.g0.L(28.0f));
                w61Var.setScaleX(f13);
                w61Var.setScaleY(f13);
                w61Var.setAlpha(c8.m9.a(f13, 0.0f, 1.0f));
                iVar.invalidate();
                return;
            default:
                tg.l0 l0Var = (tg.l0) this.f12466b;
                float f14 = f10 / 1000.0f;
                l0Var.n1 = f14;
                tg.o1 o1Var2 = l0Var.f58029f1;
                o1Var2.setAlpha(f14);
                o1Var2.invalidate();
                l0Var.N0.invalidate();
                l0Var.f58028e1.getTypefaceCell().setAlpha(1.0f - l0Var.n1);
                return;
        }
    }
}
