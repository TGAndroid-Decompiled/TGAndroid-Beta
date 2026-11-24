package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g12 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final n12 c;

    public g12(n12 n12Var, boolean z, byte b) {
        this.a = b;
        this.c = n12Var;
        this.b = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int L;
        byte b = this.a;
        boolean z = this.b;
        n12 n12Var = this.c;
        switch (b) {
            case 0:
                i22 i22Var = n12Var.e;
                if (!z) {
                    i22Var.B3.setVisibility(8);
                    L = 0;
                } else {
                    i22Var.u3.setVisibility(8);
                    L = gm.L(36.0f);
                }
                for (int i = 0; i < i22Var.u2.size(); i++) {
                    ((e32) i22Var.u2.valueAt(i)).setMeasureOffsetY(L);
                }
                if (n12Var.a == animator) {
                    n12Var.a = null;
                    return;
                }
                return;
            default:
                i22 i22Var2 = n12Var.e;
                i22Var2.y3 = z;
                if (!z) {
                    i22Var2.z3.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                i22 i22Var = this.c.e;
                if (this.b) {
                    i22Var.B3.setAlpha(0.0f);
                    i22Var.B3.setVisibility(0);
                    int L = gm.L(36.0f);
                    for (int i = 0; i < i22Var.u2.size(); i++) {
                        ((e32) i22Var.u2.valueAt(i)).setMeasureOffsetY(L);
                    }
                    return;
                }
                i22Var.u3.setAlpha(0.0f);
                i22Var.u3.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
