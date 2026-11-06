package di;

import android.widget.FrameLayout;
public final class a8 implements r1.d {
    public final int f8822a;
    public final FrameLayout f8823b;

    public a8(int i7, FrameLayout frameLayout) {
        this.f8822a = i7;
        this.f8823b = frameLayout;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f8822a) {
            case 0:
                h8 h8Var = (h8) this.f8823b;
                h8Var.f9097d0 = f10;
                h8Var.f9099f0 = f11;
                return;
            case 1:
                fi.o5 o5Var = (fi.o5) this.f8823b;
                float f12 = f10 / 1000.0f;
                o5Var.f12518c1 = f12;
                tg.j1 j1Var = o5Var.V0;
                j1Var.setAlpha(f12);
                j1Var.invalidate();
                o5Var.D0.invalidate();
                o5Var.U0.getTypefaceCell().setAlpha(1.0f - o5Var.f12518c1);
                return;
            case 2:
                pg.i iVar = (pg.i) this.f8823b;
                float f13 = f10 / 1000.0f;
                pg.g gVar2 = iVar.f53531a;
                gVar2.setPivotX(org.telegram.messenger.g0.L(28.0f));
                gVar2.setPivotY(org.telegram.messenger.g0.L(28.0f));
                gVar2.setScaleX(f13);
                gVar2.setScaleY(f13);
                gVar2.setAlpha(c8.j9.a(f13, 0.0f, 1.0f));
                iVar.invalidate();
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f8823b;
                float f14 = f10 / 1000.0f;
                g0Var.f55588m1 = f14;
                tg.j1 j1Var2 = g0Var.f55578e1;
                j1Var2.setAlpha(f14);
                j1Var2.invalidate();
                g0Var.M0.invalidate();
                g0Var.f55577d1.getTypefaceCell().setAlpha(1.0f - g0Var.f55588m1);
                return;
        }
    }
}
