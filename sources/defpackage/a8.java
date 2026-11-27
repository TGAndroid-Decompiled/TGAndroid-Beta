package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a8 extends AnimatorListenerAdapter {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final b8 e;

    public a8(b8 b8Var, boolean z, int i, int i2, int i3) {
        this.e = b8Var;
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
        int f2 = vm2.f(f, i, i2);
        b8 b8Var = this.e;
        b8Var.setTextColor(f2);
        b8Var.setIconColor(vm2.f(f, this.d, i2));
    }
}
