package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tq4 extends AnimatorListenerAdapter {
    public final byte a;
    public final uq4 b;

    public tq4(uq4 uq4Var, byte b) {
        this.a = b;
        this.b = uq4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        uq4 uq4Var = this.b;
        switch (b) {
            case 0:
                jn7.f(uq4Var.r.a).j(uq4Var.f);
                uq4Var.requestLayout();
                return;
            default:
                uq4Var.d = null;
                uq4Var.a = null;
                uq4Var.b = false;
                return;
        }
    }
}
