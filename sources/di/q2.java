package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q2 extends AnimatorListenerAdapter {
    public final int f8956a;
    public final q4 f8957b;

    public q2(q4 q4Var, int i10) {
        this.f8956a = i10;
        this.f8957b = q4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        w2 w2Var;
        Runnable runnable;
        switch (this.f8956a) {
            case 0:
                q4 q4Var = this.f8957b;
                q4Var.f8989i3 = 0.0f;
                q4Var.f8983g3.setAlpha(1.0f);
                q4Var.f8983g3.setVisibility(8);
                q4Var.f8983g3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                q4 q4Var2 = this.f8957b;
                q4Var2.C2.unlock();
                q4Var2.f9040w2 = q4Var2.f8973d2;
                u2 u2Var = q4Var2.Q1;
                if (u2Var != null && (runnable = u2Var.f25975w) != null) {
                    runnable.run();
                    u2Var.f25975w = null;
                }
                if (q4Var2.f9050z1 && !q4Var2.f8994k2) {
                    y9 y9Var = ((p9) q4Var2.F1).d;
                    if (y9Var.f9467x) {
                        y9Var.f9467x = false;
                        y9Var.Q();
                    }
                }
                if (!q4Var2.f8994k2 && (w2Var = q4Var2.S2) != null) {
                    w2Var.setVisibility(8);
                }
                q4Var2.K2 = true;
                q4Var2.invalidate();
                return;
        }
    }
}
