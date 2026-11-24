package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class in9 extends AnimatorListenerAdapter {
    public final byte a;
    public final on9 b;

    public in9(on9 on9Var, byte b) {
        this.a = b;
        this.b = on9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        on9 on9Var = this.b;
        switch (b) {
            case 0:
                on9Var.Y = null;
                return;
            case 1:
                on9Var.V = null;
                return;
            default:
                on9Var.p0 = null;
                return;
        }
    }
}
