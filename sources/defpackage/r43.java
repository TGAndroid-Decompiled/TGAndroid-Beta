package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r43 extends AnimatorListenerAdapter {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final u43 e;

    public r43(u43 u43Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = u43Var;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u43 u43Var = this.e;
        u43Var.G = false;
        if (!this.a) {
            u43Var.d(this.b, this.c, this.d, true);
        }
    }
}
