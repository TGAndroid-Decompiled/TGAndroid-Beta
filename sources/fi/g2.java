package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g2 extends AnimatorListenerAdapter {
    public final int f11732a;
    public final b4 f11733b;

    public g2(b4 b4Var, int i7) {
        this.f11732a = i7;
        this.f11733b = b4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m2 m2Var;
        Runnable runnable;
        switch (this.f11732a) {
            case 0:
                b4 b4Var = this.f11733b;
                b4Var.f11467d3 = 0.0f;
                b4Var.f11462b3.setAlpha(1.0f);
                b4Var.f11462b3.setVisibility(8);
                b4Var.f11462b3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                b4 b4Var2 = this.f11733b;
                b4Var2.f11540x2.e();
                b4Var2.f11516r2 = b4Var2.Y1;
                k2 k2Var = b4Var2.L1;
                if (k2Var != null && (runnable = k2Var.f32315x) != null) {
                    runnable.run();
                    k2Var.f32315x = null;
                }
                if (b4Var2.f11527u1 && !b4Var2.f11472f2) {
                    i9 i9Var = ((z8) b4Var2.A1).d;
                    if (i9Var.f11884y) {
                        i9Var.f11884y = false;
                        i9Var.V();
                    }
                }
                if (!b4Var2.f11472f2 && (m2Var = b4Var2.N2) != null) {
                    m2Var.setVisibility(8);
                }
                b4Var2.F2 = true;
                b4Var2.invalidate();
                return;
        }
    }
}
