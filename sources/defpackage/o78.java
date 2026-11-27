package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o78 extends AnimatorListenerAdapter {
    public final byte a;
    public final r78 b;

    public o78(r78 r78Var, byte b) {
        this.a = b;
        this.b = r78Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        r78 r78Var = this.b;
        switch (b) {
            case 0:
                r78Var.w1 = null;
                return;
            default:
                r78Var.x1 = null;
                return;
        }
    }
}
