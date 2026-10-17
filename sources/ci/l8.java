package ci;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l8 implements o1.g {
    public final int f5597a;
    public final FrameLayout f5598b;

    public l8(int i10, FrameLayout frameLayout) {
        this.f5597a = i10;
        this.f5598b = frameLayout;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f5597a) {
            case 0:
                s8 s8Var = (s8) this.f5598b;
                s8Var.f5981d0 = f7;
                s8Var.f5983f0 = f10;
                return;
            case 1:
                ei.f6 f6Var = (ei.f6) this.f5598b;
                float f11 = f7 / 1000.0f;
                f6Var.f9037t1 = f11;
                rg.t1 t1Var = f6Var.f9023m1;
                t1Var.setAlpha(f11);
                t1Var.invalidate();
                f6Var.U0.invalidate();
                f6Var.l1.getTypefaceCell().setAlpha(1.0f - f6Var.f9037t1);
                return;
            case 2:
                ng.i iVar = (ng.i) this.f5598b;
                float f12 = f7 / 1000.0f;
                ah.v vVar = iVar.f17460a;
                vVar.setPivotX(AndroidUtilities.dp(28.0f));
                vVar.setPivotY(AndroidUtilities.dp(28.0f));
                vVar.setScaleX(f12);
                vVar.setScaleY(f12);
                vVar.setAlpha(w7.r.a(f12, 0.0f, 1.0f));
                iVar.invalidate();
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.f5598b;
                float f13 = f7 / 1000.0f;
                m0Var.D1 = f13;
                rg.t1 t1Var2 = m0Var.f45525v1;
                t1Var2.setAlpha(f13);
                t1Var2.invalidate();
                m0Var.f45497d1.invalidate();
                m0Var.f45524u1.getTypefaceCell().setAlpha(1.0f - m0Var.D1);
                return;
        }
    }
}
