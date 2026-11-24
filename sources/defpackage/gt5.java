package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gt5 extends AnimatorListenerAdapter {
    public final byte a;
    public final ht5 b;

    public gt5(ht5 ht5Var, byte b) {
        this.a = b;
        this.b = ht5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ht5 ht5Var = this.b;
        switch (b) {
            case 0:
                ht5Var.e.X1 = null;
                ht5Var.requestLayout();
                return;
            default:
                ht5Var.e.X1 = null;
                ht5Var.a = false;
                return;
        }
    }
}
