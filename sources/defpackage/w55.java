package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w55 extends AnimatorListenerAdapter {
    public final h75 a;

    public w55(h75 h75Var) {
        this.a = h75Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.a.Q2 = null;
    }
}
