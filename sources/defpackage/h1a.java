package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h1a extends AnimatorListenerAdapter {
    public final boolean a;
    public final g1a b;
    public final boolean[] c;
    public final boolean d;
    public final g1a e;
    public final j1a f;

    public h1a(j1a j1aVar, boolean z, g1a g1aVar, boolean[] zArr, boolean z2, g1a g1aVar2) {
        this.f = j1aVar;
        this.a = z;
        this.b = g1aVar;
        this.c = zArr;
        this.d = z2;
        this.e = g1aVar2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        g1a g1aVar;
        j1a j1aVar = this.f;
        d26 d26Var = j1aVar.s;
        boolean z = this.a;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        j1aVar.J = f;
        hl.V1(j1aVar.c, j1aVar.d, f, j1aVar.e);
        d26Var.invalidate();
        if (!z) {
            j1aVar.w.setAlpha(j1aVar.J);
        }
        if (j1aVar.J < 0.5f && !z && (g1aVar = this.b) != null) {
            boolean[] zArr = this.c;
            if (!zArr[0]) {
                zArr[0] = true;
                g1aVar.run();
            }
        }
        if (!z) {
            if (this.d) {
                j1aVar.a.b = false;
                j1aVar.Q.i0.invalidate();
            }
            jn7.e().k(jn7.k1, 4);
        }
        j1aVar.L = null;
        d26Var.invalidate();
        g1a g1aVar2 = this.e;
        if (g1aVar2 != null) {
            g1aVar2.run();
        }
    }
}
