package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ai3 extends AnimatorListenerAdapter {
    public final byte a;
    public final float b;
    public final cj3 c;

    public ai3(cj3 cj3Var, float f, byte b) {
        this.a = b;
        this.c = cj3Var;
        this.b = f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        float f = this.b;
        int i = 81;
        int i2 = 0;
        cj3 cj3Var = this.c;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                cj3Var.x3 = null;
                cj3Var.P = false;
                cj3Var.R = true;
                cj3Var.S = true;
                cj3Var.fragmentView.invalidate();
                if (!cj3Var.L) {
                    i = 0;
                }
                cj3Var.A3 = -(gl.L(i + 48) - f);
                cj3Var.f0[0].setTranslationY(0.0f);
                while (true) {
                    bj3[] bj3VarArr = cj3Var.f0;
                    if (i2 < bj3VarArr.length) {
                        bj3 bj3Var = bj3VarArr[i2];
                        if (bj3Var != null) {
                            bj3Var.a.requestLayout();
                        }
                        i2++;
                    } else {
                        cj3Var.fragmentView.requestLayout();
                        pi3 pi3Var = cj3Var.Y;
                        if (pi3Var != null && cj3Var.b.f) {
                            pi3Var.r.requestFocus();
                            gl.E3(cj3Var.Y.r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                cj3Var.x3 = null;
                cj3Var.Q = 0;
                cj3Var.P = true;
                if (!cj3Var.L) {
                    i = 0;
                }
                cj3Var.A3 = gl.L(i + 48) - f;
                cj3Var.f0[0].setTranslationY(0.0f);
                int i3 = 0;
                while (true) {
                    bj3[] bj3VarArr2 = cj3Var.f0;
                    if (i3 < bj3VarArr2.length) {
                        bj3 bj3Var2 = bj3VarArr2[i3];
                        if (bj3Var2 != null) {
                            bj3Var2.a.requestLayout();
                        }
                        i3++;
                    } else {
                        cj3Var.F0.l(false, 1.0f);
                        cj3Var.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
