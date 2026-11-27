package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y33 extends AnimatorListenerAdapter {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final b43 e;

    public y33(b43 b43Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = b43Var;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        b43 b43Var = this.e;
        b43Var.G = false;
        if (!this.a) {
            b43Var.d(this.b, this.c, this.d, true);
        }
    }
}
