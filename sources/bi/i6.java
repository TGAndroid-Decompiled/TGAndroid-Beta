package bi;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class i6 implements o1.g {
    public final int f2854a;
    public final FrameLayout f2855b;

    public i6(int i10, FrameLayout frameLayout) {
        this.f2854a = i10;
        this.f2855b = frameLayout;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f2854a) {
            case 0:
                r7 r7Var = (r7) this.f2855b;
                float f11 = f7 / 1000.0f;
                r7Var.f3536t1 = f11;
                pg.t1 t1Var = r7Var.f3522m1;
                t1Var.setAlpha(f11);
                t1Var.invalidate();
                r7Var.U0.invalidate();
                r7Var.l1.getTypefaceCell().setAlpha(1.0f - r7Var.f3536t1);
                return;
            case 1:
                lg.i iVar = (lg.i) this.f2855b;
                float f12 = f7 / 1000.0f;
                n7 n7Var = iVar.f12953a;
                n7Var.setPivotX(AndroidUtilities.dp(28.0f));
                n7Var.setPivotY(AndroidUtilities.dp(28.0f));
                n7Var.setScaleX(f12);
                n7Var.setScaleY(f12);
                n7Var.setAlpha(w7.q.a(f12, 0.0f, 1.0f));
                iVar.invalidate();
                return;
            case 2:
                pg.m0 m0Var = (pg.m0) this.f2855b;
                float f13 = f7 / 1000.0f;
                m0Var.D1 = f13;
                pg.t1 t1Var2 = m0Var.f40156v1;
                t1Var2.setAlpha(f13);
                t1Var2.invalidate();
                m0Var.f40128d1.invalidate();
                m0Var.f40155u1.getTypefaceCell().setAlpha(1.0f - m0Var.D1);
                return;
            default:
                zh.p6 p6Var = (zh.p6) this.f2855b;
                p6Var.f48780d0 = f7;
                p6Var.f48782f0 = f10;
                return;
        }
    }
}
