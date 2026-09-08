package bi;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class x9 implements o1.g {
    public final int f4024a;
    public final FrameLayout f4025b;

    public x9(int i10, FrameLayout frameLayout) {
        this.f4024a = i10;
        this.f4025b = frameLayout;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f4024a) {
            case 0:
                ea eaVar = (ea) this.f4025b;
                eaVar.f2951d0 = f7;
                eaVar.f2953f0 = f10;
                return;
            case 1:
                di.q6 q6Var = (di.q6) this.f4025b;
                float f11 = f7 / 1000.0f;
                q6Var.f8017t1 = f11;
                rg.v1 v1Var = q6Var.f8003m1;
                v1Var.setAlpha(f11);
                v1Var.invalidate();
                q6Var.U0.invalidate();
                q6Var.l1.getTypefaceCell().setAlpha(1.0f - q6Var.f8017t1);
                return;
            case 2:
                ng.i iVar = (ng.i) this.f4025b;
                float f12 = f7 / 1000.0f;
                ah.w wVar = iVar.f16770a;
                wVar.setPivotX(AndroidUtilities.dp(28.0f));
                wVar.setPivotY(AndroidUtilities.dp(28.0f));
                wVar.setScaleX(f12);
                wVar.setScaleY(f12);
                wVar.setAlpha(w7.p.a(f12, 0.0f, 1.0f));
                iVar.invalidate();
                return;
            default:
                rg.o0 o0Var = (rg.o0) this.f4025b;
                float f13 = f7 / 1000.0f;
                o0Var.D1 = f13;
                rg.v1 v1Var2 = o0Var.f45399v1;
                v1Var2.setAlpha(f13);
                v1Var2.invalidate();
                o0Var.f45371d1.invalidate();
                o0Var.f45398u1.getTypefaceCell().setAlpha(1.0f - o0Var.D1);
                return;
        }
    }
}
