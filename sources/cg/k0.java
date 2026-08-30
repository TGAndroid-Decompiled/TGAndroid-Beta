package cg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final h1 f2436a;
    public final float f2437b;
    public final m f2438c;
    public final boolean d;
    public final Runnable e;
    public final m0 f2439f;

    public k0(m0 m0Var, h1 h1Var, float f10, m mVar, boolean z4, Runnable runnable) {
        this.f2439f = m0Var;
        this.f2436a = h1Var;
        this.f2437b = f10;
        this.f2438c = mVar;
        this.d = z4;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        o1 o1Var;
        m0 m0Var = this.f2439f;
        m0Var.f2467x = null;
        e1 e1Var = new e1(new h1[]{this.f2436a});
        p1 p1Var = m0Var.f2448a;
        e1Var.f2367c = p1Var.getCurrentColor();
        e1Var.d = this.f2437b * 1.0f;
        m mVar = this.f2438c;
        e1Var.e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = p1Var.getCurrentColor();
        }
        d1 painting = p1Var.getPainting();
        boolean z4 = this.d;
        painting.c(e1Var, currentColor, z4, null);
        if (z4 && (o1Var = p1Var.f2492a) != null) {
            o1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
