package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q2 extends AnimatorListenerAdapter {
    public final int f5775a;
    public final p4 f5776b;

    public q2(p4 p4Var, int i10) {
        this.f5775a = i10;
        this.f5776b = p4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        w2 w2Var;
        Runnable runnable;
        switch (this.f5775a) {
            case 0:
                p4 p4Var = this.f5776b;
                p4Var.f5710t3 = 0.0f;
                p4Var.f5704r3.setAlpha(1.0f);
                p4Var.f5704r3.setVisibility(8);
                p4Var.f5704r3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                p4 p4Var2 = this.f5776b;
                p4Var2.N2.unlock();
                p4Var2.H2 = p4Var2.f5694o2;
                u2 u2Var = p4Var2.f5653b2;
                if (u2Var != null && (runnable = u2Var.f24180w) != null) {
                    runnable.run();
                    u2Var.f24180w = null;
                }
                if (p4Var2.K1 && !p4Var2.f5715v2) {
                    z9 z9Var = ((q9) p4Var2.Q1).d;
                    if (z9Var.f6272x) {
                        z9Var.f6272x = false;
                        z9Var.P();
                    }
                }
                if (!p4Var2.f5715v2 && (w2Var = p4Var2.f5662d3) != null) {
                    w2Var.setVisibility(8);
                }
                p4Var2.V2 = true;
                p4Var2.invalidate();
                return;
        }
    }
}
