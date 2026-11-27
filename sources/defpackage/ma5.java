package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ma5 extends AnimatorListenerAdapter {
    public final byte a;
    public final ra5 b;

    public ma5(ra5 ra5Var, byte b) {
        this.a = b;
        this.b = ra5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ra5 ra5Var = this.b;
        switch (b) {
            case 0:
                ra5Var.b.setVisibility(8);
                ra5Var.F = false;
                ra5Var.G = 0.0f;
                return;
            default:
                ra5Var.e.setVisibility(8);
                return;
        }
    }
}
