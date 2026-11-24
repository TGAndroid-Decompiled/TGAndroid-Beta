package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sc8 extends AnimatorListenerAdapter {
    public final byte a;
    public final tc8 b;

    public sc8(tc8 tc8Var, byte b) {
        this.a = b;
        this.b = tc8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        tc8 tc8Var = this.b;
        switch (b) {
            case 0:
                tc8Var.h = false;
                tc8Var.a = tc8Var.c;
                tc8Var.invalidate();
                int i = tc8Var.K;
                if (i >= 0) {
                    tc8Var.b(i);
                    tc8Var.K = -1;
                    return;
                }
                return;
            default:
                tc8Var.n = false;
                tc8Var.h = false;
                tc8Var.invalidate();
                int i2 = tc8Var.K;
                if (i2 >= 0) {
                    tc8Var.b(i2);
                    tc8Var.K = -1;
                }
                tc8Var.a();
                return;
        }
    }
}
