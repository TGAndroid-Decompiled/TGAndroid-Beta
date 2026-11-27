package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i88 extends AnimatorListenerAdapter {
    public final byte a;
    public final k88 b;

    public i88(k88 k88Var, byte b) {
        this.a = b;
        this.b = k88Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        k88 k88Var = this.b;
        switch (b) {
            case 0:
                k88Var.s = null;
                return;
            default:
                k88Var.w = null;
                return;
        }
    }
}
