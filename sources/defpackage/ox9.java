package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ox9 extends AnimatorListenerAdapter {
    public final boolean a;
    public final lx9 b;
    public final boolean[] c;
    public final boolean d;
    public final lx9 e;
    public final px9 f;

    public ox9(px9 px9Var, boolean z, lx9 lx9Var, boolean[] zArr, boolean z2, lx9 lx9Var2) {
        this.f = px9Var;
        this.a = z;
        this.b = lx9Var;
        this.c = zArr;
        this.d = z2;
        this.e = lx9Var2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        lx9 lx9Var;
        px9 px9Var = this.f;
        oc6 oc6Var = px9Var.s;
        boolean z = this.a;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        px9Var.J = f;
        gl.V1(px9Var.c, px9Var.d, f, px9Var.e);
        oc6Var.invalidate();
        if (!z) {
            px9Var.w.setAlpha(px9Var.J);
        }
        if (px9Var.J < 0.5f && !z && (lx9Var = this.b) != null) {
            boolean[] zArr = this.c;
            if (!zArr[0]) {
                zArr[0] = true;
                lx9Var.run();
            }
        }
        if (!z) {
            if (this.d) {
                px9Var.a.b = false;
                px9Var.Q.i0.invalidate();
            }
            kk7.e().k(kk7.j1, 4);
        }
        px9Var.L = null;
        oc6Var.invalidate();
        lx9 lx9Var2 = this.e;
        if (lx9Var2 != null) {
            lx9Var2.run();
        }
    }
}
