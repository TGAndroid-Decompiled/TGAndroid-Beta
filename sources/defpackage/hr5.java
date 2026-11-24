package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hr5 extends AnimatorListenerAdapter {
    public final byte a;
    public final ir5 b;

    public hr5(ir5 ir5Var, byte b) {
        this.a = b;
        this.b = ir5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ir5 ir5Var = this.b;
        switch (b) {
            case 0:
                ir5Var.e.X1 = null;
                ir5Var.requestLayout();
                return;
            default:
                ir5Var.e.X1 = null;
                ir5Var.a = false;
                return;
        }
    }
}
