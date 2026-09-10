package og;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f0 extends AnimatorListenerAdapter {
    public final z0 f14350a;
    public final float f14351b;
    public final m f14352c;
    public final boolean d;
    public final Runnable e;
    public final g0 f14353f;

    public f0(g0 g0Var, z0 z0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f14353f = g0Var;
        this.f14350a = z0Var;
        this.f14351b = f7;
        this.f14352c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        g1 g1Var;
        g0 g0Var = this.f14353f;
        g0Var.f14383x = null;
        w0 w0Var = new w0(new z0[]{this.f14350a});
        h1 h1Var = g0Var.f14364a;
        w0Var.f14540c = h1Var.getCurrentColor();
        w0Var.d = this.f14351b * 1.0f;
        m mVar = this.f14352c;
        w0Var.e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = h1Var.getCurrentColor();
        }
        v0 painting = h1Var.getPainting();
        boolean z10 = this.d;
        painting.c(w0Var, currentColor, z10, null);
        if (z10 && (g1Var = h1Var.f14388a) != null) {
            g1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
