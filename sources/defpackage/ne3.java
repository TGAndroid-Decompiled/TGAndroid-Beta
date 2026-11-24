package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ne3 extends AnimatorListenerAdapter {
    public final byte a;
    public final ue3 b;

    public ne3(ue3 ue3Var, byte b) {
        this.a = b;
        this.b = ue3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        int i2;
        byte b = this.a;
        ue3 ue3Var = this.b;
        switch (b) {
            case 0:
                ue3Var.W3 = 1.0f;
                ue3Var.Z3 = null;
                ue3Var.a4 = null;
                ue3Var.b4 = null;
                ue3Var.invalidate();
                return;
            case 1:
                ue3Var.X3 = 1.0f;
                ue3Var.invalidate();
                return;
            default:
                boolean z = ue3Var.T2;
                if (ue3Var.R2) {
                    i = 2;
                } else {
                    i = 0;
                }
                int i3 = (z ? 1 : 0) + i;
                if (ue3Var.S2) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                int i4 = i3 + i2;
                int i5 = ue3Var.w4;
                if (i5 != i4) {
                    ue3Var.J(i5, i4);
                } else {
                    ue3Var.A4 = false;
                    ue3Var.y4 = i5;
                }
                ue3Var.invalidate();
                return;
        }
    }
}
