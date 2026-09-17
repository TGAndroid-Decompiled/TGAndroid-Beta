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
                xaVar.f1719d0 = f7;
                xaVar.f1721f0 = f10;
                return;
            case 1:
                ci.r6 r6Var = (ci.r6) this.f1443b;
                float f11 = f7 / 1000.0f;
                r6Var.f5445t1 = f11;
                qg.w1 w1Var = r6Var.f5431m1;
                w1Var.setAlpha(f11);
                w1Var.invalidate();
                r6Var.U0.invalidate();
                r6Var.l1.getTypefaceCell().setAlpha(1.0f - r6Var.f5445t1);
                return;
            case 2:
                mg.i iVar = (mg.i) this.f1443b;
                float f12 = f7 / 1000.0f;
                ci.n6 n6Var = iVar.f14834a;
                n6Var.setPivotX(AndroidUtilities.dp(28.0f));
                n6Var.setPivotY(AndroidUtilities.dp(28.0f));
                n6Var.setScaleX(f12);
                n6Var.setScaleY(f12);
                n6Var.setAlpha(w7.p.a(f12, 0.0f, 1.0f));
                iVar.invalidate();
                return;
            default:
                qg.p0 p0Var = (qg.p0) this.f1443b;
                float f13 = f7 / 1000.0f;
                p0Var.D1 = f13;
                qg.w1 w1Var2 = p0Var.f41570v1;
                w1Var2.setAlpha(f13);
                w1Var2.invalidate();
                p0Var.f41542d1.invalidate();
                p0Var.f41569u1.getTypefaceCell().setAlpha(1.0f - p0Var.D1);
                return;
        }
    }
}
