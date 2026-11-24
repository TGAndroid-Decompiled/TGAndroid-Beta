package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xp5 extends AnimatorListenerAdapter {
    public final jf8 a;
    public final float b;
    public final u11 c;
    public final boolean d;
    public final y89 e;
    public final yp5 f;

    public xp5(yp5 yp5Var, jf8 jf8Var, float f, u11 u11Var, boolean z, y89 y89Var) {
        this.f = yp5Var;
        this.a = jf8Var;
        this.b = f;
        this.c = u11Var;
        this.d = z;
        this.e = y89Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        d99 d99Var;
        yp5 yp5Var = this.f;
        yp5Var.x = null;
        f08 f08Var = new f08(new jf8[]{this.a});
        e99 e99Var = yp5Var.a;
        f08Var.c = e99Var.getCurrentColor();
        f08Var.d = this.b * 1.0f;
        u11 u11Var = this.c;
        f08Var.e = u11Var;
        u11Var.getClass();
        if (u11Var instanceof q11) {
            currentColor = -1;
        } else {
            currentColor = e99Var.getCurrentColor();
        }
        hw7 painting = e99Var.getPainting();
        boolean z = this.d;
        painting.c(f08Var, currentColor, z, null);
        if (z && (d99Var = e99Var.a) != null) {
            d99Var.Q();
        }
        y89 y89Var = this.e;
        if (y89Var != null) {
            y89Var.run();
        }
    }
}
