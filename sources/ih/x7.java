package ih;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class x7 implements o1.g {
    public final int f12328a;
    public final FrameLayout f12329b;

    public x7(int i9, FrameLayout frameLayout) {
        this.f12328a = i9;
        this.f12329b = frameLayout;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f12328a) {
            case 0:
                e8 e8Var = (e8) this.f12329b;
                e8Var.W = f10;
                e8Var.f11376b0 = f11;
                return;
            case 1:
                kh.g6 g6Var = (kh.g6) this.f12329b;
                float f12 = f10 / 1000.0f;
                g6Var.f15296p1 = f12;
                yf.t1 t1Var = g6Var.f15283i1;
                t1Var.setAlpha(f12);
                t1Var.invalidate();
                g6Var.Q0.invalidate();
                g6Var.f15281h1.getTypefaceCell().setAlpha(1.0f - g6Var.f15296p1);
                return;
            case 2:
                uf.h hVar2 = (uf.h) this.f12329b;
                float f13 = f10 / 1000.0f;
                fh.v vVar = hVar2.f48218a;
                vVar.setPivotX(AndroidUtilities.dp(28.0f));
                vVar.setPivotY(AndroidUtilities.dp(28.0f));
                vVar.setScaleX(f13);
                vVar.setScaleY(f13);
                vVar.setAlpha(g7.n.a(f13, 0.0f, 1.0f));
                hVar2.invalidate();
                return;
            default:
                yf.l0 l0Var = (yf.l0) this.f12329b;
                float f14 = f10 / 1000.0f;
                l0Var.f49964z1 = f14;
                yf.t1 t1Var2 = l0Var.f49952r1;
                t1Var2.setAlpha(f14);
                t1Var2.invalidate();
                l0Var.Z0.invalidate();
                l0Var.f49951q1.getTypefaceCell().setAlpha(1.0f - l0Var.f49964z1);
                return;
        }
    }
}
