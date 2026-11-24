package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vz1 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final c02 c;

    public vz1(c02 c02Var, boolean z, byte b) {
        this.a = b;
        this.c = c02Var;
        this.b = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int L;
        byte b = this.a;
        boolean z = this.b;
        c02 c02Var = this.c;
        switch (b) {
            case 0:
                x02 x02Var = c02Var.e;
                if (!z) {
                    x02Var.B3.setVisibility(8);
                    L = 0;
                } else {
                    x02Var.u3.setVisibility(8);
                    L = gl.L(36.0f);
                }
                for (int i = 0; i < x02Var.u2.size(); i++) {
                    ((s12) x02Var.u2.valueAt(i)).setMeasureOffsetY(L);
                }
                if (c02Var.a == animator) {
                    c02Var.a = null;
                    return;
                }
                return;
            default:
                x02 x02Var2 = c02Var.e;
                x02Var2.y3 = z;
                if (!z) {
                    x02Var2.z3.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                x02 x02Var = this.c.e;
                if (this.b) {
                    x02Var.B3.setAlpha(0.0f);
                    x02Var.B3.setVisibility(0);
                    int L = gl.L(36.0f);
                    for (int i = 0; i < x02Var.u2.size(); i++) {
                        ((s12) x02Var.u2.valueAt(i)).setMeasureOffsetY(L);
                    }
                    return;
                }
                x02Var.u3.setAlpha(0.0f);
                x02Var.u3.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
