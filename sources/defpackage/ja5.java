package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ja5 extends AnimatorListenerAdapter {
    public final byte a;
    public final oa5 b;

    public ja5(oa5 oa5Var, byte b) {
        this.a = b;
        this.b = oa5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        oa5 oa5Var = this.b;
        switch (b) {
            case 0:
                oa5Var.b.setVisibility(8);
                oa5Var.F = false;
                oa5Var.G = 0.0f;
                return;
            default:
                oa5Var.e.setVisibility(8);
                return;
        }
    }
}
