package fi;

import android.widget.FrameLayout;
import org.telegram.ui.y61;
public final class q7 implements r1.d {
    public final int f12500a;
    public final FrameLayout f12501b;

    public q7(int i7, FrameLayout frameLayout) {
        this.f12500a = i7;
        this.f12501b = frameLayout;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f12500a) {
            case 0:
                x7 x7Var = (x7) this.f12501b;
                x7Var.f12779e0 = f10;
                x7Var.f12781g0 = f11;
                return;
            case 1:
                hi.k5 k5Var = (hi.k5) this.f12501b;
                float f12 = f10 / 1000.0f;
                k5Var.f14874d1 = f12;
                tg.k1 k1Var = k5Var.W0;
                k1Var.setAlpha(f12);
                k1Var.invalidate();
                k5Var.E0.invalidate();
                k5Var.V0.getTypefaceCell().setAlpha(1.0f - k5Var.f14874d1);
                return;
            case 2:
                pg.i iVar = (pg.i) this.f12501b;
                float f13 = f10 / 1000.0f;
                y61 y61Var = iVar.f55657a;
                y61Var.setPivotX(org.telegram.messenger.g0.L(28.0f));
                y61Var.setPivotY(org.telegram.messenger.g0.L(28.0f));
                y61Var.setScaleX(f13);
                y61Var.setScaleY(f13);
                y61Var.setAlpha(c8.l9.a(f13, 0.0f, 1.0f));
                iVar.invalidate();
                return;
            default:
                tg.h0 h0Var = (tg.h0) this.f12501b;
                float f14 = f10 / 1000.0f;
                h0Var.n1 = f14;
                tg.k1 k1Var2 = h0Var.f57909f1;
                k1Var2.setAlpha(f14);
                k1Var2.invalidate();
                h0Var.N0.invalidate();
                h0Var.f57908e1.getTypefaceCell().setAlpha(1.0f - h0Var.n1);
                return;
        }
    }
}
