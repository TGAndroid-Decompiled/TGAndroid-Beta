package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zf4 extends AnimatorListenerAdapter {
    public final byte a;
    public final fg4 b;

    public zf4(fg4 fg4Var, byte b) {
        this.a = b;
        this.b = fg4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        fg4 fg4Var = this.b;
        switch (b) {
            case 0:
                if (fg4Var.D0 == animator) {
                    fg4Var.D0 = null;
                    return;
                }
                return;
            default:
                fg4Var.W = fg4Var.e0;
                fg4Var.d0 = fg4Var.h0;
                fg4Var.a0 = fg4Var.f0;
                fg4Var.b0 = fg4Var.g0;
                fg4Var.e0 = -1;
                fg4Var.f0 = -1;
                fg4Var.g0 = -1;
                fg4Var.h0 = -1;
                return;
        }
    }
}
