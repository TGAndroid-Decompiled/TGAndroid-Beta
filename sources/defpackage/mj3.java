package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mj3 extends AnimatorListenerAdapter {
    public final byte a;
    public final float b;
    public final nk3 c;

    public mj3(nk3 nk3Var, float f, byte b) {
        this.a = b;
        this.c = nk3Var;
        this.b = f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        float f = this.b;
        int i = 81;
        int i2 = 0;
        nk3 nk3Var = this.c;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                nk3Var.x3 = null;
                nk3Var.P = false;
                nk3Var.R = true;
                nk3Var.S = true;
                nk3Var.fragmentView.invalidate();
                if (!nk3Var.L) {
                    i = 0;
                }
                nk3Var.A3 = -(gm.L(i + 48) - f);
                nk3Var.f0[0].setTranslationY(0.0f);
                while (true) {
                    mk3[] mk3VarArr = nk3Var.f0;
                    if (i2 < mk3VarArr.length) {
                        mk3 mk3Var = mk3VarArr[i2];
                        if (mk3Var != null) {
                            mk3Var.a.requestLayout();
                        }
                        i2++;
                    } else {
                        nk3Var.fragmentView.requestLayout();
                        zj3 zj3Var = nk3Var.Y;
                        if (zj3Var != null && nk3Var.b.f) {
                            zj3Var.r.requestFocus();
                            gm.E3(nk3Var.Y.r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                nk3Var.x3 = null;
                nk3Var.Q = 0;
                nk3Var.P = true;
                if (!nk3Var.L) {
                    i = 0;
                }
                nk3Var.A3 = gm.L(i + 48) - f;
                nk3Var.f0[0].setTranslationY(0.0f);
                int i3 = 0;
                while (true) {
                    mk3[] mk3VarArr2 = nk3Var.f0;
                    if (i3 < mk3VarArr2.length) {
                        mk3 mk3Var2 = mk3VarArr2[i3];
                        if (mk3Var2 != null) {
                            mk3Var2.a.requestLayout();
                        }
                        i3++;
                    } else {
                        nk3Var.F0.l(false, 1.0f);
                        nk3Var.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
