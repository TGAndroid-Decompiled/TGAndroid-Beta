package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f7 extends AnimatorListenerAdapter {
    public final byte a;
    public final s7 b;

    public f7(s7 s7Var, byte b) {
        this.a = b;
        this.b = s7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        s7 s7Var = this.b;
        switch (b) {
            case 0:
                s7Var.s.setVisibility(4);
                s7Var.w = null;
                return;
            default:
                s7Var.w = null;
                return;
        }
    }
}
