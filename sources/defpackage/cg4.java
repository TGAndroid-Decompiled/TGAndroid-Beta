package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cg4 extends AnimatorListenerAdapter {
    public final byte a;
    public final ig4 b;

    public cg4(ig4 ig4Var, byte b) {
        this.a = b;
        this.b = ig4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ig4 ig4Var = this.b;
        switch (b) {
            case 0:
                if (ig4Var.C0 == animator) {
                    ig4Var.C0 = null;
                    return;
                }
                return;
            default:
                ig4Var.V = ig4Var.d0;
                ig4Var.c0 = ig4Var.g0;
                ig4Var.W = ig4Var.e0;
                ig4Var.a0 = ig4Var.f0;
                ig4Var.d0 = -1;
                ig4Var.e0 = -1;
                ig4Var.f0 = -1;
                ig4Var.g0 = -1;
                return;
        }
    }
}
