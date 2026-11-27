package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ui3 extends AnimatorListenerAdapter {
    public final byte a;
    public final float b;
    public final uj3 c;

    public ui3(uj3 uj3Var, float f, byte b) {
        this.a = b;
        this.c = uj3Var;
        this.b = f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        float f = this.b;
        int i = 81;
        int i2 = 0;
        uj3 uj3Var = this.c;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                uj3Var.x3 = null;
                uj3Var.P = false;
                uj3Var.R = true;
                uj3Var.S = true;
                uj3Var.fragmentView.invalidate();
                if (!uj3Var.L) {
                    i = 0;
                }
                uj3Var.A3 = -(hl.L(i + 48) - f);
                uj3Var.f0[0].setTranslationY(0.0f);
                while (true) {
                    tj3[] tj3VarArr = uj3Var.f0;
                    if (i2 < tj3VarArr.length) {
                        tj3 tj3Var = tj3VarArr[i2];
                        if (tj3Var != null) {
                            tj3Var.a.requestLayout();
                        }
                        i2++;
                    } else {
                        uj3Var.fragmentView.requestLayout();
                        hj3 hj3Var = uj3Var.Y;
                        if (hj3Var != null && uj3Var.b.f) {
                            hj3Var.r.requestFocus();
                            hl.E3(uj3Var.Y.r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                uj3Var.x3 = null;
                uj3Var.Q = 0;
                uj3Var.P = true;
                if (!uj3Var.L) {
                    i = 0;
                }
                uj3Var.A3 = hl.L(i + 48) - f;
                uj3Var.f0[0].setTranslationY(0.0f);
                int i3 = 0;
                while (true) {
                    tj3[] tj3VarArr2 = uj3Var.f0;
                    if (i3 < tj3VarArr2.length) {
                        tj3 tj3Var2 = tj3VarArr2[i3];
                        if (tj3Var2 != null) {
                            tj3Var2.a.requestLayout();
                        }
                        i3++;
                    } else {
                        uj3Var.F0.l(false, 1.0f);
                        uj3Var.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
