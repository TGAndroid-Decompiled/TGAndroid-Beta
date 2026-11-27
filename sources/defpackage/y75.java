package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y75 extends AnimatorListenerAdapter {
    public final j95 a;

    public y75(j95 j95Var) {
        this.a = j95Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.a.Q2 = null;
    }
}
