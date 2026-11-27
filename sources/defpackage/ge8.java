package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ge8 extends AnimatorListenerAdapter {
    public final byte a;
    public final he8 b;

    public ge8(he8 he8Var, byte b) {
        this.a = b;
        this.b = he8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        he8 he8Var = this.b;
        switch (b) {
            case 0:
                he8Var.h = false;
                he8Var.a = he8Var.c;
                he8Var.invalidate();
                int i = he8Var.K;
                if (i >= 0) {
                    he8Var.b(i);
                    he8Var.K = -1;
                    return;
                }
                return;
            default:
                he8Var.n = false;
                he8Var.h = false;
                he8Var.invalidate();
                int i2 = he8Var.K;
                if (i2 >= 0) {
                    he8Var.b(i2);
                    he8Var.K = -1;
                }
                he8Var.a();
                return;
        }
    }
}
