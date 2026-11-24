package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e7 extends AnimatorListenerAdapter {
    public final byte a;
    public final r7 b;

    public e7(r7 r7Var, byte b) {
        this.a = b;
        this.b = r7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        r7 r7Var = this.b;
        switch (b) {
            case 0:
                r7Var.s.setVisibility(4);
                r7Var.w = null;
                return;
            default:
                r7Var.w = null;
                return;
        }
    }
}
