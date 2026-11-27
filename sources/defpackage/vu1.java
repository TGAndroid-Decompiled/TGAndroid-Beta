package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vu1 extends AnimatorListenerAdapter {
    public final ih7 a;

    public vu1(ih7 ih7Var) {
        this.a = ih7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.q(1.0f);
    }
}
