package gg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u1 extends AnimatorListenerAdapter {
    public final s1 f6751a;
    public final v1 f6752b;

    public u1(v1 v1Var, s1 s1Var) {
        this.f6752b = v1Var;
        this.f6751a = s1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        s1 s1Var = this.f6751a;
        s1Var.setLayerType(0, null);
        this.f6752b.d.removeView(s1Var);
    }
}
