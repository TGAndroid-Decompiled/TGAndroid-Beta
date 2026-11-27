package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yq9 extends AnimatorListenerAdapter {
    public final byte a;
    public final er9 b;

    public yq9(er9 er9Var, byte b) {
        this.a = b;
        this.b = er9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        er9 er9Var = this.b;
        switch (b) {
            case 0:
                er9Var.Y = null;
                return;
            case 1:
                er9Var.V = null;
                return;
            default:
                er9Var.p0 = null;
                return;
        }
    }
}
