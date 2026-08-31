package hg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u1 extends AnimatorListenerAdapter {
    public final s1 f7619a;
    public final v1 f7620b;

    public u1(v1 v1Var, s1 s1Var) {
        this.f7620b = v1Var;
        this.f7619a = s1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        s1 s1Var = this.f7619a;
        s1Var.setLayerType(0, null);
        this.f7620b.d.removeView(s1Var);
    }
}
