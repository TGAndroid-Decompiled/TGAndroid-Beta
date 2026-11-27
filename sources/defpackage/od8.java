package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class od8 extends AnimatorListenerAdapter {
    public final byte a;
    public final pd8 b;

    public od8(pd8 pd8Var, byte b) {
        this.a = b;
        this.b = pd8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        pd8 pd8Var = this.b;
        switch (b) {
            case 0:
                pd8Var.a.n.setVisibility(8);
                return;
            default:
                pd8Var.a.h.setVisibility(8);
                return;
        }
    }
}
