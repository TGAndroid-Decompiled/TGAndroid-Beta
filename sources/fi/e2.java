package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e2 extends AnimatorListenerAdapter {
    public final int f11872a;
    public final z3 f11873b;

    public e2(z3 z3Var, int i7) {
        this.f11872a = i7;
        this.f11873b = z3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k2 k2Var;
        Runnable runnable;
        switch (this.f11872a) {
            case 0:
                z3 z3Var = this.f11873b;
                z3Var.f12812d3 = 0.0f;
                z3Var.f12807b3.setAlpha(1.0f);
                z3Var.f12807b3.setVisibility(8);
                z3Var.f12807b3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                z3 z3Var2 = this.f11873b;
                z3Var2.f12885x2.e();
                z3Var2.f12861r2 = z3Var2.Y1;
                i2 i2Var = z3Var2.L1;
                if (i2Var != null && (runnable = i2Var.f32714x) != null) {
                    runnable.run();
                    i2Var.f32714x = null;
                }
                if (z3Var2.f12872u1 && !z3Var2.f12817f2) {
                    f9 f9Var = ((w8) z3Var2.A1).d;
                    if (f9Var.f12001y) {
                        f9Var.f12001y = false;
                        f9Var.V();
                    }
                }
                if (!z3Var2.f12817f2 && (k2Var = z3Var2.N2) != null) {
                    k2Var.setVisibility(8);
                }
                z3Var2.F2 = true;
                z3Var2.invalidate();
                return;
        }
    }
}
