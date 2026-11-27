package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jt5 extends AnimatorListenerAdapter {
    public final byte a;
    public final kt5 b;

    public jt5(kt5 kt5Var, byte b) {
        this.a = b;
        this.b = kt5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        kt5 kt5Var = this.b;
        switch (b) {
            case 0:
                kt5Var.e.X1 = null;
                kt5Var.requestLayout();
                return;
            default:
                kt5Var.e.X1 = null;
                kt5Var.a = false;
                return;
        }
    }
}
