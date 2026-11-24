package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qz9 extends AnimatorListenerAdapter {
    public final boolean a;
    public final nz9 b;
    public final boolean[] c;
    public final boolean d;
    public final nz9 e;
    public final rz9 f;

    public qz9(rz9 rz9Var, boolean z, nz9 nz9Var, boolean[] zArr, boolean z2, nz9 nz9Var2) {
        this.f = rz9Var;
        this.a = z;
        this.b = nz9Var;
        this.c = zArr;
        this.d = z2;
        this.e = nz9Var2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        nz9 nz9Var;
        rz9 rz9Var = this.f;
        ne6 ne6Var = rz9Var.s;
        boolean z = this.a;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        rz9Var.J = f;
        gm.V1(rz9Var.c, rz9Var.d, f, rz9Var.e);
        ne6Var.invalidate();
        if (!z) {
            rz9Var.w.setAlpha(rz9Var.J);
        }
        if (rz9Var.J < 0.5f && !z && (nz9Var = this.b) != null) {
            boolean[] zArr = this.c;
            if (!zArr[0]) {
                zArr[0] = true;
                nz9Var.run();
            }
        }
        if (!z) {
            if (this.d) {
                rz9Var.a.b = false;
                rz9Var.Q.i0.invalidate();
            }
            nm7.e().k(nm7.k1, 4);
        }
        rz9Var.L = null;
        ne6Var.invalidate();
        nz9 nz9Var2 = this.e;
        if (nz9Var2 != null) {
            nz9Var2.run();
        }
    }
}
