package fi;

import android.widget.FrameLayout;
import org.telegram.ui.y61;
public final class q7 implements r1.d {
    public final int f12464a;
    public final FrameLayout f12465b;

    public q7(int i7, FrameLayout frameLayout) {
        this.f12464a = i7;
        this.f12465b = frameLayout;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f12464a) {
            case 0:
                x7 x7Var = (x7) this.f12465b;
                x7Var.f12734e0 = f10;
                x7Var.f12736g0 = f11;
                return;
            case 1:
                hi.l5 l5Var = (hi.l5) this.f12465b;
                float f12 = f10 / 1000.0f;
                l5Var.f14889d1 = f12;
                tg.k1 k1Var = l5Var.W0;
                k1Var.setAlpha(f12);
                k1Var.invalidate();
                l5Var.E0.invalidate();
                l5Var.V0.getTypefaceCell().setAlpha(1.0f - l5Var.f14889d1);
                return;
            case 2:
                pg.i iVar = (pg.i) this.f12465b;
                float f13 = f10 / 1000.0f;
                y61 y61Var = iVar.f55626a;
                y61Var.setPivotX(org.telegram.messenger.g0.L(28.0f));
                y61Var.setPivotY(org.telegram.messenger.g0.L(28.0f));
                y61Var.setScaleX(f13);
                y61Var.setScaleY(f13);
                y61Var.setAlpha(c8.m9.a(f13, 0.0f, 1.0f));
                iVar.invalidate();
                return;
            default:
                tg.h0 h0Var = (tg.h0) this.f12465b;
                float f14 = f10 / 1000.0f;
                h0Var.n1 = f14;
                tg.k1 k1Var2 = h0Var.f57878f1;
                k1Var2.setAlpha(f14);
                k1Var2.invalidate();
                h0Var.N0.invalidate();
                h0Var.f57877e1.getTypefaceCell().setAlpha(1.0f - h0Var.n1);
                return;
        }
    }
}
