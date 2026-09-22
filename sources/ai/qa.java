package ai;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class qa implements o1.g {
    public final int f1439a;
    public final FrameLayout f1440b;

    public qa(int i10, FrameLayout frameLayout) {
        this.f1439a = i10;
        this.f1440b = frameLayout;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f1439a) {
            case 0:
                xa xaVar = (xa) this.f1440b;
                xaVar.f1716d0 = f7;
                xaVar.f1718f0 = f10;
                return;
            case 1:
                ci.r6 r6Var = (ci.r6) this.f1440b;
                float f11 = f7 / 1000.0f;
                r6Var.f5444t1 = f11;
                qg.u1 u1Var = r6Var.f5430m1;
                u1Var.setAlpha(f11);
                u1Var.invalidate();
                r6Var.U0.invalidate();
                r6Var.l1.getTypefaceCell().setAlpha(1.0f - r6Var.f5444t1);
                return;
            case 2:
                mg.i iVar = (mg.i) this.f1440b;
                float f12 = f7 / 1000.0f;
                ci.n6 n6Var = iVar.f15060a;
                n6Var.setPivotX(AndroidUtilities.dp(28.0f));
                n6Var.setPivotY(AndroidUtilities.dp(28.0f));
                n6Var.setScaleX(f12);
                n6Var.setScaleY(f12);
                n6Var.setAlpha(w7.q.a(f12, 0.0f, 1.0f));
                iVar.invalidate();
                return;
            default:
                qg.n0 n0Var = (qg.n0) this.f1440b;
                float f13 = f7 / 1000.0f;
                n0Var.D1 = f13;
                qg.u1 u1Var2 = n0Var.f41838v1;
                u1Var2.setAlpha(f13);
                u1Var2.invalidate();
                n0Var.f41810d1.invalidate();
                n0Var.f41837u1.getTypefaceCell().setAlpha(1.0f - n0Var.D1);
                return;
        }
    }
}
