package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l02 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final s02 c;

    public l02(s02 s02Var, boolean z, byte b) {
        this.a = b;
        this.c = s02Var;
        this.b = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int L;
        byte b = this.a;
        boolean z = this.b;
        s02 s02Var = this.c;
        switch (b) {
            case 0:
                n12 n12Var = s02Var.e;
                if (!z) {
                    n12Var.B3.setVisibility(8);
                    L = 0;
                } else {
                    n12Var.u3.setVisibility(8);
                    L = hl.L(36.0f);
                }
                for (int i = 0; i < n12Var.u2.size(); i++) {
                    ((j22) n12Var.u2.valueAt(i)).setMeasureOffsetY(L);
                }
                if (s02Var.a == animator) {
                    s02Var.a = null;
                    return;
                }
                return;
            default:
                n12 n12Var2 = s02Var.e;
                n12Var2.y3 = z;
                if (!z) {
                    n12Var2.z3.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                n12 n12Var = this.c.e;
                if (this.b) {
                    n12Var.B3.setAlpha(0.0f);
                    n12Var.B3.setVisibility(0);
                    int L = hl.L(36.0f);
                    for (int i = 0; i < n12Var.u2.size(); i++) {
                        ((j22) n12Var.u2.valueAt(i)).setMeasureOffsetY(L);
                    }
                    return;
                }
                n12Var.u3.setAlpha(0.0f);
                n12Var.u3.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
