package cg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c1 extends AnimatorListenerAdapter {
    public final int f2308a;
    public final d1 f2309b;

    public c1(d1 d1Var, int i10) {
        this.f2308a = i10;
        this.f2309b = d1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2308a) {
            case 0:
                d1 d1Var = this.f2309b;
                d1Var.K = null;
                d1Var.f2320f.f(new ag.d(this, 12));
                return;
            default:
                this.f2309b.f2320f.f(new ag.d(this, 13));
                return;
        }
    }
}
