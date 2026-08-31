package dg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final g1 f4569a;
    public final float f4570b;
    public final m f4571c;
    public final boolean d;
    public final Runnable f4572e;
    public final m0 f4573f;

    public k0(m0 m0Var, g1 g1Var, float f10, m mVar, boolean z4, Runnable runnable) {
        this.f4573f = m0Var;
        this.f4569a = g1Var;
        this.f4570b = f10;
        this.f4571c = mVar;
        this.d = z4;
        this.f4572e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        n1 n1Var;
        m0 m0Var = this.f4573f;
        m0Var.f4602x = null;
        d1 d1Var = new d1(new g1[]{this.f4569a});
        o1 o1Var = m0Var.f4582a;
        d1Var.f4485c = o1Var.getCurrentColor();
        d1Var.d = this.f4570b * 1.0f;
        m mVar = this.f4571c;
        d1Var.f4486e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = o1Var.getCurrentColor();
        }
        c1 painting = o1Var.getPainting();
        boolean z4 = this.d;
        painting.c(d1Var, currentColor, z4, null);
        if (z4 && (n1Var = o1Var.f4624a) != null) {
            n1Var.e();
        }
        Runnable runnable = this.f4572e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
