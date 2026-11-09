package di;

import android.widget.FrameLayout;
public final class a8 implements r1.d {
    public final int f8817a;
    public final FrameLayout f8818b;

    public a8(int i7, FrameLayout frameLayout) {
        this.f8817a = i7;
        this.f8818b = frameLayout;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f8817a) {
            case 0:
                i8 i8Var = (i8) this.f8818b;
                i8Var.f9127d0 = f10;
                i8Var.f9129f0 = f11;
                return;
            case 1:
                fi.o5 o5Var = (fi.o5) this.f8818b;
                float f12 = f10 / 1000.0f;
                o5Var.f12516c1 = f12;
                tg.j1 j1Var = o5Var.V0;
                j1Var.setAlpha(f12);
                j1Var.invalidate();
                o5Var.D0.invalidate();
                o5Var.U0.getTypefaceCell().setAlpha(1.0f - o5Var.f12516c1);
                return;
            case 2:
                pg.j jVar = (pg.j) this.f8818b;
                float f13 = f10 / 1000.0f;
                pg.h hVar = jVar.f53636a;
                hVar.setPivotX(org.telegram.messenger.g0.L(28.0f));
                hVar.setPivotY(org.telegram.messenger.g0.L(28.0f));
                hVar.setScaleX(f13);
                hVar.setScaleY(f13);
                hVar.setAlpha(c8.j9.a(f13, 0.0f, 1.0f));
                jVar.invalidate();
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f8818b;
                float f14 = f10 / 1000.0f;
                g0Var.f55692m1 = f14;
                tg.j1 j1Var2 = g0Var.f55682e1;
                j1Var2.setAlpha(f14);
                j1Var2.invalidate();
                g0Var.M0.invalidate();
                g0Var.f55681d1.getTypefaceCell().setAlpha(1.0f - g0Var.f55692m1);
                return;
        }
    }
}
