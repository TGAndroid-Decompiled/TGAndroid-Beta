package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f94 extends AnimatorListenerAdapter {
    public final h94 a;

    public f94(h94 h94Var) {
        this.a = h94Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h94 h94Var = this.a;
        if (h94Var.r) {
            h94Var.d.setVisibility(4);
        } else {
            h94Var.e.setVisibility(4);
        }
    }
}
