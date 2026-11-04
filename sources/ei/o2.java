package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o2 extends AnimatorListenerAdapter {
    public final int f10684a;
    public final j4 f10685b;

    public o2(j4 j4Var, int i3) {
        this.f10684a = i3;
        this.f10685b = j4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u2 u2Var;
        Runnable runnable;
        switch (this.f10684a) {
            case 0:
                j4 j4Var = this.f10685b;
                j4Var.f10451d3 = 0.0f;
                j4Var.f10446b3.setAlpha(1.0f);
                j4Var.f10446b3.setVisibility(8);
                j4Var.f10446b3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                j4 j4Var2 = this.f10685b;
                j4Var2.f10524x2.e();
                j4Var2.f10500r2 = j4Var2.Y1;
                s2 s2Var = j4Var2.L1;
                if (s2Var != null && (runnable = s2Var.f31219x) != null) {
                    runnable.run();
                    s2Var.f31219x = null;
                }
                if (j4Var2.f10511u1 && !j4Var2.f10456f2) {
                    r9 r9Var = ((i9) j4Var2.A1).d;
                    if (r9Var.f10963y) {
                        r9Var.f10963y = false;
                        r9Var.d0();
                    }
                }
                if (!j4Var2.f10456f2 && (u2Var = j4Var2.N2) != null) {
                    u2Var.setVisibility(8);
                }
                j4Var2.F2 = true;
                j4Var2.invalidate();
                return;
        }
    }
}
