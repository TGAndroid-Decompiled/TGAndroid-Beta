package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t94 extends AnimatorListenerAdapter {
    public final v94 a;

    public t94(v94 v94Var) {
        this.a = v94Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v94 v94Var = this.a;
        if (v94Var.r) {
            v94Var.d.setVisibility(4);
        } else {
            v94Var.e.setVisibility(4);
        }
    }
}
