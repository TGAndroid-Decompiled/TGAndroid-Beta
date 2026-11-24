package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jp9 extends AnimatorListenerAdapter {
    public final byte a;
    public final pp9 b;

    public jp9(pp9 pp9Var, byte b) {
        this.a = b;
        this.b = pp9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        pp9 pp9Var = this.b;
        switch (b) {
            case 0:
                pp9Var.Y = null;
                return;
            case 1:
                pp9Var.V = null;
                return;
            default:
                pp9Var.p0 = null;
                return;
        }
    }
}
