package ci;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l8 implements o1.g {
    public final int f5595a;
    public final FrameLayout f5596b;

    public l8(int i10, FrameLayout frameLayout) {
        this.f5595a = i10;
        this.f5596b = frameLayout;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f5595a) {
            case 0:
                s8 s8Var = (s8) this.f5596b;
                s8Var.f5979d0 = f7;
                s8Var.f5981f0 = f10;
                return;
            case 1:
                ei.f6 f6Var = (ei.f6) this.f5596b;
                float f11 = f7 / 1000.0f;
                f6Var.f9035t1 = f11;
                rg.t1 t1Var = f6Var.f9021m1;
                t1Var.setAlpha(f11);
                t1Var.invalidate();
                f6Var.U0.invalidate();
                f6Var.l1.getTypefaceCell().setAlpha(1.0f - f6Var.f9035t1);
                return;
            case 2:
                ng.i iVar = (ng.i) this.f5596b;
                float f12 = f7 / 1000.0f;
                ah.v vVar = iVar.f17464a;
                vVar.setPivotX(AndroidUtilities.dp(28.0f));
                vVar.setPivotY(AndroidUtilities.dp(28.0f));
                vVar.setScaleX(f12);
                vVar.setScaleY(f12);
                vVar.setAlpha(w7.r.a(f12, 0.0f, 1.0f));
                iVar.invalidate();
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.f5596b;
                float f13 = f7 / 1000.0f;
                m0Var.D1 = f13;
                rg.t1 t1Var2 = m0Var.f45509v1;
                t1Var2.setAlpha(f13);
                t1Var2.invalidate();
                m0Var.f45481d1.invalidate();
                m0Var.f45508u1.getTypefaceCell().setAlpha(1.0f - m0Var.D1);
                return;
        }
    }
}
