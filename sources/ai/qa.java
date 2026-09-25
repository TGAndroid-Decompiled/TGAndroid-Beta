package ai;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class qa implements o1.g {
    public final int f1440a;
    public final FrameLayout f1441b;

    public qa(int i10, FrameLayout frameLayout) {
        this.f1440a = i10;
        this.f1441b = frameLayout;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f1440a) {
            case 0:
                xa xaVar = (xa) this.f1441b;
                xaVar.f1714d0 = f7;
                xaVar.f1716f0 = f10;
                return;
            case 1:
                ci.q6 q6Var = (ci.q6) this.f1441b;
                float f11 = f7 / 1000.0f;
                q6Var.f5367t1 = f11;
                qg.u1 u1Var = q6Var.f5353m1;
                u1Var.setAlpha(f11);
                u1Var.invalidate();
                q6Var.U0.invalidate();
                q6Var.l1.getTypefaceCell().setAlpha(1.0f - q6Var.f5367t1);
                return;
            case 2:
                mg.i iVar = (mg.i) this.f1441b;
                float f12 = f7 / 1000.0f;
                ci.m6 m6Var = iVar.f15049a;
                m6Var.setPivotX(AndroidUtilities.dp(28.0f));
                m6Var.setPivotY(AndroidUtilities.dp(28.0f));
                m6Var.setScaleX(f12);
                m6Var.setScaleY(f12);
                m6Var.setAlpha(w7.q.a(f12, 0.0f, 1.0f));
                iVar.invalidate();
                return;
            default:
                qg.n0 n0Var = (qg.n0) this.f1441b;
                float f13 = f7 / 1000.0f;
                n0Var.D1 = f13;
                qg.u1 u1Var2 = n0Var.f41804v1;
                u1Var2.setAlpha(f13);
                u1Var2.invalidate();
                n0Var.f41776d1.invalidate();
                n0Var.f41803u1.getTypefaceCell().setAlpha(1.0f - n0Var.D1);
                return;
        }
    }
}
