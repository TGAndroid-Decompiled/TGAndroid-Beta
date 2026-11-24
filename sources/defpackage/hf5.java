package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hf5 extends AnimatorListenerAdapter {
    public final float[] a;
    public final float b;
    public final float c;
    public final boolean d;
    public final if5 e;

    public hf5(if5 if5Var, float[] fArr, float f, float f2, boolean z) {
        this.e = if5Var;
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
        this.e.a.b.l = gm.R1(this.b, this.c, 1.0f);
        vs4 vs4Var = this.e.a.b;
        float f = vs4Var.f;
        float f2 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i = 1;
        } else {
            i = -1;
        }
        vs4Var.f = (f2 * i) + f;
        this.e.a.b.b();
        if5 if5Var = this.e;
        if5Var.a(if5Var.a.b.l);
        this.e.a.j(750L);
    }
}
