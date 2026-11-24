package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vv1 extends AnimatorListenerAdapter {
    public final ah7 a;

    public vv1(ah7 ah7Var) {
        this.a = ah7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.q(1.0f);
    }
}
