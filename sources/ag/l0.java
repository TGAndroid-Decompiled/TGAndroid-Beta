package ag;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l0 extends AnimatorListenerAdapter {
    public final j1 f575a;
    public final float f576b;
    public final m f577c;
    public final boolean d;
    public final Runnable f578e;
    public final n0 f579f;

    public l0(n0 n0Var, j1 j1Var, float f9, m mVar, boolean z10, Runnable runnable) {
        this.f579f = n0Var;
        this.f575a = j1Var;
        this.f576b = f9;
        this.f577c = mVar;
        this.d = z10;
        this.f578e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        s1 s1Var;
        n0 n0Var = this.f579f;
        n0Var.f612x = null;
        g1 g1Var = new g1(new j1[]{this.f575a});
        t1 t1Var = n0Var.f592a;
        g1Var.f502c = t1Var.getCurrentColor();
        g1Var.d = this.f576b * 1.0f;
        m mVar = this.f577c;
        g1Var.f503e = mVar;
        mVar.getClass();
        if (mVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = t1Var.getCurrentColor();
        }
        f1 painting = t1Var.getPainting();
        boolean z10 = this.d;
        painting.c(g1Var, currentColor, z10, null);
        if (z10 && (s1Var = t1Var.f658a) != null) {
            s1Var.e();
        }
        Runnable runnable = this.f578e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
