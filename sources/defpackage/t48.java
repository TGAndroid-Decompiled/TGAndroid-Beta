package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t48 extends AnimatorListenerAdapter {
    public final byte a;
    public final v48 b;

    public t48(v48 v48Var, byte b) {
        this.a = b;
        this.b = v48Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        v48 v48Var = this.b;
        switch (b) {
            case 0:
                v48Var.s = null;
                return;
            default:
                v48Var.w = null;
                return;
        }
    }
}
