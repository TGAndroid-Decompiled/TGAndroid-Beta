package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class iu1 extends AnimatorListenerAdapter {
    public final ye7 a;

    public iu1(ye7 ye7Var) {
        this.a = ye7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.q(1.0f);
    }
}
