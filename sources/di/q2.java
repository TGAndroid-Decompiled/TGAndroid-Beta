package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q2 extends AnimatorListenerAdapter {
    public final int f8957a;
    public final q4 f8958b;

    public q2(q4 q4Var, int i10) {
        this.f8957a = i10;
        this.f8958b = q4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        w2 w2Var;
        Runnable runnable;
        switch (this.f8957a) {
            case 0:
                q4 q4Var = this.f8958b;
                q4Var.f8990i3 = 0.0f;
                q4Var.f8984g3.setAlpha(1.0f);
                q4Var.f8984g3.setVisibility(8);
                q4Var.f8984g3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                q4 q4Var2 = this.f8958b;
                q4Var2.C2.unlock();
                q4Var2.f9041w2 = q4Var2.f8974d2;
                u2 u2Var = q4Var2.Q1;
                if (u2Var != null && (runnable = u2Var.f25971w) != null) {
                    runnable.run();
                    u2Var.f25971w = null;
                }
                if (q4Var2.f9051z1 && !q4Var2.f8995k2) {
                    y9 y9Var = ((p9) q4Var2.F1).d;
                    if (y9Var.f9468x) {
                        y9Var.f9468x = false;
                        y9Var.P();
                    }
                }
                if (!q4Var2.f8995k2 && (w2Var = q4Var2.S2) != null) {
                    w2Var.setVisibility(8);
                }
                q4Var2.K2 = true;
                q4Var2.invalidate();
                return;
        }
    }
}
