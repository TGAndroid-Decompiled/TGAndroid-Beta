package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ag3 extends AnimatorListenerAdapter {
    public final byte a;
    public final hg3 b;

    public ag3(hg3 hg3Var, byte b) {
        this.a = b;
        this.b = hg3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        int i2;
        byte b = this.a;
        hg3 hg3Var = this.b;
        switch (b) {
            case 0:
                hg3Var.W3 = 1.0f;
                hg3Var.Z3 = null;
                hg3Var.a4 = null;
                hg3Var.b4 = null;
                hg3Var.invalidate();
                return;
            case 1:
                hg3Var.X3 = 1.0f;
                hg3Var.invalidate();
                return;
            default:
                boolean z = hg3Var.T2;
                if (hg3Var.R2) {
                    i = 2;
                } else {
                    i = 0;
                }
                int i3 = (z ? 1 : 0) + i;
                if (hg3Var.S2) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                int i4 = i3 + i2;
                int i5 = hg3Var.w4;
                if (i5 != i4) {
                    hg3Var.F(i5, i4);
                } else {
                    hg3Var.A4 = false;
                    hg3Var.y4 = i5;
                }
                hg3Var.invalidate();
                return;
        }
    }
}
