package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class be4 extends AnimatorListenerAdapter {
    public final byte a;
    public final he4 b;

    public be4(he4 he4Var, byte b) {
        this.a = b;
        this.b = he4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        he4 he4Var = this.b;
        switch (b) {
            case 0:
                if (he4Var.C0 == animator) {
                    he4Var.C0 = null;
                    return;
                }
                return;
            default:
                he4Var.V = he4Var.d0;
                he4Var.c0 = he4Var.g0;
                he4Var.W = he4Var.e0;
                he4Var.a0 = he4Var.f0;
                he4Var.d0 = -1;
                he4Var.e0 = -1;
                he4Var.f0 = -1;
                he4Var.g0 = -1;
                return;
        }
    }
}
