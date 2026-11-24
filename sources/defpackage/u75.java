package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u75 extends AnimatorListenerAdapter {
    public final g95 a;

    public u75(g95 g95Var) {
        this.a = g95Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.a.Q2 = null;
    }
}
