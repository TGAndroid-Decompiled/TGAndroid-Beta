package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g33 extends AnimatorListenerAdapter {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final j33 e;

    public g33(j33 j33Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = j33Var;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        j33 j33Var = this.e;
        j33Var.G = false;
        if (!this.a) {
            j33Var.d(this.b, this.c, this.d, true);
        }
    }
}
