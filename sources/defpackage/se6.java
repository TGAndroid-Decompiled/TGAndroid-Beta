package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class se6 extends AnimatorListenerAdapter {
    public final byte a;
    public final qh6 b;

    public se6(qh6 qh6Var, byte b) {
        this.a = b;
        this.b = qh6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        qh6 qh6Var = this.b;
        switch (b) {
            case 0:
                if (qh6Var.d == animator) {
                    qh6Var.d = null;
                    return;
                }
                return;
            default:
                qh6Var.c.setVisibility(8);
                if (qh6Var.d == animator) {
                    qh6Var.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
