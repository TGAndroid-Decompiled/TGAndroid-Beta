package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class po4 extends AnimatorListenerAdapter {
    public final byte a;
    public final qo4 b;

    public po4(qo4 qo4Var, byte b) {
        this.a = b;
        this.b = qo4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        qo4 qo4Var = this.b;
        switch (b) {
            case 0:
                kk7.f(qo4Var.r.a).j(qo4Var.f);
                qo4Var.requestLayout();
                return;
            default:
                qo4Var.d = null;
                qo4Var.a = null;
                qo4Var.b = false;
                return;
        }
    }
}
