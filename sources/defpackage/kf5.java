package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kf5 extends AnimatorListenerAdapter {
    public final float[] a;
    public final float b;
    public final float c;
    public final boolean d;
    public final lf5 e;

    public kf5(lf5 lf5Var, float[] fArr, float f, float f2, boolean z) {
        this.e = lf5Var;
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
        this.e.a.b.l = hl.R1(this.b, this.c, 1.0f);
        ys4 ys4Var = this.e.a.b;
        float f = ys4Var.f;
        float f2 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i = 1;
        } else {
            i = -1;
        }
        ys4Var.f = (f2 * i) + f;
        this.e.a.b.b();
        lf5 lf5Var = this.e;
        lf5Var.a(lf5Var.a.b.l);
        this.e.a.j(750L);
    }
}
