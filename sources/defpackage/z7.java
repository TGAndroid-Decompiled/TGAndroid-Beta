package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z7 extends AnimatorListenerAdapter {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final a8 e;

    public z7(a8 a8Var, boolean z, int i, int i2, int i3) {
        this.e = a8Var;
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        if (this.a) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        int i = this.b;
        int i2 = this.c;
        int f2 = bm2.f(f, i, i2);
        a8 a8Var = this.e;
        a8Var.setTextColor(f2);
        a8Var.setIconColor(bm2.f(f, this.d, i2));
    }
}
