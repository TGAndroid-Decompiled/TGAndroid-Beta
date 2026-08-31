package dg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b1 extends AnimatorListenerAdapter {
    public final int f4441a;
    public final c1 f4442b;

    public b1(c1 c1Var, int i10) {
        this.f4441a = i10;
        this.f4442b = c1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4441a) {
            case 0:
                c1 c1Var = this.f4442b;
                c1Var.K = null;
                c1Var.f4455f.f(new ag.e(this, 17));
                return;
            default:
                this.f4442b.f4455f.f(new ag.e(this, 18));
                return;
        }
    }
}
