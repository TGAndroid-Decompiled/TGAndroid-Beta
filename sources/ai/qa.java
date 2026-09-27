package ai;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class qa implements o1.g {
    public final int f1442a;
    public final FrameLayout f1443b;

    public qa(int i10, FrameLayout frameLayout) {
        this.f1442a = i10;
        this.f1443b = frameLayout;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f1442a) {
            case 0:
                xa xaVar = (xa) this.f1443b;
                xaVar.f1716d0 = f7;
                xaVar.f1718f0 = f10;
                return;
            case 1:
                ci.q6 q6Var = (ci.q6) this.f1443b;
                float f11 = f7 / 1000.0f;
                q6Var.f5371t1 = f11;
                qg.t1 t1Var = q6Var.f5357m1;
                t1Var.setAlpha(f11);
                t1Var.invalidate();
                q6Var.U0.invalidate();
                q6Var.l1.getTypefaceCell().setAlpha(1.0f - q6Var.f5371t1);
                return;
            case 2:
                mg.i iVar = (mg.i) this.f1443b;
                float f12 = f7 / 1000.0f;
                ci.m6 m6Var = iVar.f15076a;
                m6Var.setPivotX(AndroidUtilities.dp(28.0f));
                m6Var.setPivotY(AndroidUtilities.dp(28.0f));
                m6Var.setScaleX(f12);
                m6Var.setScaleY(f12);
                m6Var.setAlpha(w7.q.a(f12, 0.0f, 1.0f));
                iVar.invalidate();
                return;
            default:
                qg.m0 m0Var = (qg.m0) this.f1443b;
                float f13 = f7 / 1000.0f;
                m0Var.D1 = f13;
                qg.t1 t1Var2 = m0Var.f41828v1;
                t1Var2.setAlpha(f13);
                t1Var2.invalidate();
                m0Var.f41800d1.invalidate();
                m0Var.f41827u1.getTypefaceCell().setAlpha(1.0f - m0Var.D1);
                return;
        }
    }
}
