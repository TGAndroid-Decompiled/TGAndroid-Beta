package og;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t0 extends AnimatorListenerAdapter {
    public final int f14485a;
    public final v0 f14486b;

    public t0(v0 v0Var, int i10) {
        this.f14485a = i10;
        this.f14486b = v0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14485a) {
            case 0:
                v0 v0Var = this.f14486b;
                v0Var.K = null;
                v0Var.f14515f.f(new gg.v1(this, 24));
                return;
            default:
                this.f14486b.f14515f.f(new gg.v1(this, 25));
                return;
        }
    }
}
