package fi;

import android.widget.FrameLayout;
import org.telegram.ui.y61;
public final class q7 implements r1.d {
    public final int f12469a;
    public final FrameLayout f12470b;

    public q7(int i7, FrameLayout frameLayout) {
        this.f12469a = i7;
        this.f12470b = frameLayout;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f12469a) {
            case 0:
                x7 x7Var = (x7) this.f12470b;
                x7Var.f12739e0 = f10;
                x7Var.f12741g0 = f11;
                return;
            case 1:
                hi.l5 l5Var = (hi.l5) this.f12470b;
                float f12 = f10 / 1000.0f;
                l5Var.f14899d1 = f12;
                tg.j1 j1Var = l5Var.W0;
                j1Var.setAlpha(f12);
                j1Var.invalidate();
                l5Var.E0.invalidate();
                l5Var.V0.getTypefaceCell().setAlpha(1.0f - l5Var.f14899d1);
                return;
            case 2:
                pg.i iVar = (pg.i) this.f12470b;
                float f13 = f10 / 1000.0f;
                y61 y61Var = iVar.f55616a;
                y61Var.setPivotX(org.telegram.messenger.g0.L(28.0f));
                y61Var.setPivotY(org.telegram.messenger.g0.L(28.0f));
                y61Var.setScaleX(f13);
                y61Var.setScaleY(f13);
                y61Var.setAlpha(c8.l9.a(f13, 0.0f, 1.0f));
                iVar.invalidate();
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f12470b;
                float f14 = f10 / 1000.0f;
                g0Var.n1 = f14;
                tg.j1 j1Var2 = g0Var.f57855f1;
                j1Var2.setAlpha(f14);
                j1Var2.invalidate();
                g0Var.N0.invalidate();
                g0Var.f57854e1.getTypefaceCell().setAlpha(1.0f - g0Var.n1);
                return;
        }
    }
}
