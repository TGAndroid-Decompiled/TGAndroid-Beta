package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vu1 extends AnimatorListenerAdapter {
    public final hh7 a;

    public vu1(hh7 hh7Var) {
        this.a = hh7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.q(1.0f);
    }
}
