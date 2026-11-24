package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qq4 extends AnimatorListenerAdapter {
    public final byte a;
    public final rq4 b;

    public qq4(rq4 rq4Var, byte b) {
        this.a = b;
        this.b = rq4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        rq4 rq4Var = this.b;
        switch (b) {
            case 0:
                nm7.f(rq4Var.r.a).j(rq4Var.f);
                rq4Var.requestLayout();
                return;
            default:
                rq4Var.d = null;
                rq4Var.a = null;
                rq4Var.b = false;
                return;
        }
    }
}
