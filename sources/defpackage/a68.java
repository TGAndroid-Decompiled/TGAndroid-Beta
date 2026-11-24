package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a68 extends AnimatorListenerAdapter {
    public final byte a;
    public final d68 b;

    public a68(d68 d68Var, byte b) {
        this.a = b;
        this.b = d68Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        d68 d68Var = this.b;
        switch (b) {
            case 0:
                d68Var.w1 = null;
                return;
            default:
                d68Var.x1 = null;
                return;
        }
    }
}
