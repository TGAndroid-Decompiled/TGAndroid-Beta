package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xn5 extends AnimatorListenerAdapter {
    public final hd8 a;
    public final float b;
    public final m01 c;
    public final boolean d;
    public final w69 e;
    public final yn5 f;

    public xn5(yn5 yn5Var, hd8 hd8Var, float f, m01 m01Var, boolean z, w69 w69Var) {
        this.f = yn5Var;
        this.a = hd8Var;
        this.b = f;
        this.c = m01Var;
        this.d = z;
        this.e = w69Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        b79 b79Var;
        yn5 yn5Var = this.f;
        yn5Var.x = null;
        dy7 dy7Var = new dy7(new hd8[]{this.a});
        c79 c79Var = yn5Var.a;
        dy7Var.c = c79Var.getCurrentColor();
        dy7Var.d = this.b * 1.0f;
        m01 m01Var = this.c;
        dy7Var.e = m01Var;
        m01Var.getClass();
        if (m01Var instanceof i01) {
            currentColor = -1;
        } else {
            currentColor = c79Var.getCurrentColor();
        }
        gu7 painting = c79Var.getPainting();
        boolean z = this.d;
        painting.c(dy7Var, currentColor, z, null);
        if (z && (b79Var = c79Var.a) != null) {
            b79Var.P();
        }
        w69 w69Var = this.e;
        if (w69Var != null) {
            w69Var.run();
        }
    }
}
