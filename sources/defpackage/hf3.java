package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hf3 extends AnimatorListenerAdapter {
    public final byte a;
    public final of3 b;

    public hf3(of3 of3Var, byte b) {
        this.a = b;
        this.b = of3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        int i2;
        byte b = this.a;
        of3 of3Var = this.b;
        switch (b) {
            case 0:
                of3Var.W3 = 1.0f;
                of3Var.Z3 = null;
                of3Var.a4 = null;
                of3Var.b4 = null;
                of3Var.invalidate();
                return;
            case 1:
                of3Var.X3 = 1.0f;
                of3Var.invalidate();
                return;
            default:
                boolean z = of3Var.T2;
                if (of3Var.R2) {
                    i = 2;
                } else {
                    i = 0;
                }
                int i3 = (z ? 1 : 0) + i;
                if (of3Var.S2) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                int i4 = i3 + i2;
                int i5 = of3Var.w4;
                if (i5 != i4) {
                    of3Var.I(i5, i4);
                } else {
                    of3Var.A4 = false;
                    of3Var.y4 = i5;
                }
                of3Var.invalidate();
                return;
        }
    }
}
