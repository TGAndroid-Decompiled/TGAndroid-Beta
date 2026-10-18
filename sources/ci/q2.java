package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q2 extends AnimatorListenerAdapter {
    public final int f5771a;
    public final p4 f5772b;

    public q2(p4 p4Var, int i10) {
        this.f5771a = i10;
        this.f5772b = p4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        w2 w2Var;
        Runnable runnable;
        switch (this.f5771a) {
            case 0:
                p4 p4Var = this.f5772b;
                p4Var.f5706t3 = 0.0f;
                p4Var.f5700r3.setAlpha(1.0f);
                p4Var.f5700r3.setVisibility(8);
                p4Var.f5700r3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                p4 p4Var2 = this.f5772b;
                p4Var2.N2.unlock();
                p4Var2.H2 = p4Var2.f5690o2;
                u2 u2Var = p4Var2.f5649b2;
                if (u2Var != null && (runnable = u2Var.f24031w) != null) {
                    runnable.run();
                    u2Var.f24031w = null;
                }
                if (p4Var2.K1 && !p4Var2.f5711v2) {
                    z9 z9Var = ((q9) p4Var2.Q1).d;
                    if (z9Var.f6261x) {
                        z9Var.f6261x = false;
                        z9Var.P();
                    }
                }
                if (!p4Var2.f5711v2 && (w2Var = p4Var2.f5658d3) != null) {
                    w2Var.setVisibility(8);
                }
                p4Var2.V2 = true;
                p4Var2.invalidate();
                return;
        }
    }
}
