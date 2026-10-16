package bi;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class aa implements o1.g {
    public final int f2840a;
    public final FrameLayout f2841b;

    public aa(int i10, FrameLayout frameLayout) {
        this.f2840a = i10;
        this.f2841b = frameLayout;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f2840a) {
            case 0:
                ha haVar = (ha) this.f2841b;
                haVar.f3138d0 = f7;
                haVar.f3140f0 = f10;
                return;
            case 1:
                di.o6 o6Var = (di.o6) this.f2841b;
                float f11 = f7 / 1000.0f;
                o6Var.f7551t1 = f11;
                rg.v1 v1Var = o6Var.f7537m1;
                v1Var.setAlpha(f11);
                v1Var.invalidate();
                o6Var.U0.invalidate();
                o6Var.l1.getTypefaceCell().setAlpha(1.0f - o6Var.f7551t1);
                return;
            case 2:
                ng.i iVar = (ng.i) this.f2841b;
                float f12 = f7 / 1000.0f;
                ah.v vVar = iVar.f16084a;
                vVar.setPivotX(AndroidUtilities.dp(28.0f));
                vVar.setPivotY(AndroidUtilities.dp(28.0f));
                vVar.setScaleX(f12);
                vVar.setScaleY(f12);
                vVar.setAlpha(w7.r.a(f12, 0.0f, 1.0f));
                iVar.invalidate();
                return;
            default:
                rg.o0 o0Var = (rg.o0) this.f2841b;
                float f13 = f7 / 1000.0f;
                o0Var.D1 = f13;
                rg.v1 v1Var2 = o0Var.f44192v1;
                v1Var2.setAlpha(f13);
                v1Var2.invalidate();
                o0Var.f44164d1.invalidate();
                o0Var.f44191u1.getTypefaceCell().setAlpha(1.0f - o0Var.D1);
                return;
        }
    }
}
