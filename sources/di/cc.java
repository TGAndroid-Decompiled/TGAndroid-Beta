package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.t80;
public final class cc extends AnimatorListenerAdapter {
    public final ch.n0 f8622a;
    public final View f8623b;
    public final fi.m0[] f8624c;
    public final boolean[] d;
    public final RectF f8625e;
    public final Runnable f8626f;
    public final mc h;

    public cc(mc mcVar, ch.n0 n0Var, View view, fi.m0[] m0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = mcVar;
        this.f8622a = n0Var;
        this.f8623b = view;
        this.f8624c = m0VarArr;
        this.d = zArr;
        this.f8625e = rectF;
        this.f8626f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t80 t80Var;
        mc mcVar = this.h;
        bc bcVar = mcVar.F1;
        bcVar.setVisibility(4);
        bcVar.setPaused(true);
        ch.n0 n0Var = this.f8622a;
        if (n0Var != null) {
            n0Var.f5436k = true;
        }
        View view = this.f8623b;
        if (view != null) {
            view.invalidate();
        }
        fi.m0 m0Var = this.f8624c[0];
        if (m0Var != null) {
            m0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.w2*/.L();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.f8625e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                mcVar.f30229c.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f8626f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && (t80Var = launchActivity.f43228w0) != null) {
            t80Var.c(true);
        }
    }
}
