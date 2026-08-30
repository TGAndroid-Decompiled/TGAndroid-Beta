package gg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u1 extends AnimatorListenerAdapter {
    public final s1 f6764a;
    public final v1 f6765b;

    public u1(v1 v1Var, s1 s1Var) {
        this.f6765b = v1Var;
        this.f6764a = s1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        s1 s1Var = this.f6764a;
        s1Var.setLayerType(0, null);
        this.f6765b.d.removeView(s1Var);
    }
}
