package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y38 extends AnimatorListenerAdapter {
    public final byte a;
    public final b48 b;

    public y38(b48 b48Var, byte b) {
        this.a = b;
        this.b = b48Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        b48 b48Var = this.b;
        switch (b) {
            case 0:
                b48Var.w1 = null;
                return;
            default:
                b48Var.x1 = null;
                return;
        }
    }
}
