package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jd5 extends AnimatorListenerAdapter {
    public final float[] a;
    public final float b;
    public final float c;
    public final boolean d;
    public final kd5 e;

    public jd5(kd5 kd5Var, float[] fArr, float f, float f2, boolean z) {
        this.e = kd5Var;
        this.a = fArr;
        this.b = f;
        this.c = f2;
        this.d = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        float[] fArr = this.a;
        fArr[0] = 1.0f;
        this.e.a.b.l = gl.R1(this.b, this.c, 1.0f);
        uq4 uq4Var = this.e.a.b;
        float f = uq4Var.f;
        float f2 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i = 1;
        } else {
            i = -1;
        }
        uq4Var.f = (f2 * i) + f;
        this.e.a.b.b();
        kd5 kd5Var = this.e;
        kd5Var.a(kd5Var.a.b.l);
        this.e.a.j(750L);
    }
}
