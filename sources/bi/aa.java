package bi;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class aa implements o1.g {
    public final int f2836a;
    public final FrameLayout f2837b;

    public aa(int i10, FrameLayout frameLayout) {
        this.f2836a = i10;
        this.f2837b = frameLayout;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f2836a) {
            case 0:
                ha haVar = (ha) this.f2837b;
                haVar.f3134d0 = f7;
                haVar.f3136f0 = f10;
                return;
            case 1:
                di.o6 o6Var = (di.o6) this.f2837b;
                float f11 = f7 / 1000.0f;
                o6Var.f7548t1 = f11;
                rg.v1 v1Var = o6Var.f7534m1;
                v1Var.setAlpha(f11);
                v1Var.invalidate();
                o6Var.U0.invalidate();
                o6Var.l1.getTypefaceCell().setAlpha(1.0f - o6Var.f7548t1);
                return;
            case 2:
                ng.i iVar = (ng.i) this.f2837b;
                float f12 = f7 / 1000.0f;
                ah.v vVar = iVar.f16373a;
                vVar.setPivotX(AndroidUtilities.dp(28.0f));
                vVar.setPivotY(AndroidUtilities.dp(28.0f));
                vVar.setScaleX(f12);
                vVar.setScaleY(f12);
                vVar.setAlpha(w7.s.a(f12, 0.0f, 1.0f));
                iVar.invalidate();
                return;
            default:
                rg.o0 o0Var = (rg.o0) this.f2837b;
                float f13 = f7 / 1000.0f;
                o0Var.D1 = f13;
                rg.v1 v1Var2 = o0Var.f44433v1;
                v1Var2.setAlpha(f13);
                v1Var2.invalidate();
                o0Var.f44405d1.invalidate();
                o0Var.f44432u1.getTypefaceCell().setAlpha(1.0f - o0Var.D1);
                return;
        }
    }
}
