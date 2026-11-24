package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v68 extends AnimatorListenerAdapter {
    public final byte a;
    public final x68 b;

    public v68(x68 x68Var, byte b) {
        this.a = b;
        this.b = x68Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        x68 x68Var = this.b;
        switch (b) {
            case 0:
                x68Var.s = null;
                return;
            default:
                x68Var.w = null;
                return;
        }
    }
}
