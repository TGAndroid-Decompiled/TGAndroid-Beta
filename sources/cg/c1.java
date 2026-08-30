package cg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c1 extends AnimatorListenerAdapter {
    public final int f2325a;
    public final d1 f2326b;

    public c1(d1 d1Var, int i10) {
        this.f2325a = i10;
        this.f2326b = d1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2325a) {
            case 0:
                d1 d1Var = this.f2326b;
                d1Var.K = null;
                d1Var.f2337f.f(new ag.d(this, 12));
                return;
            default:
                this.f2326b.f2337f.f(new ag.d(this, 13));
                return;
        }
    }
}
