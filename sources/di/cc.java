package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.t80;
public final class cc extends AnimatorListenerAdapter {
    public final ch.n0 f8634a;
    public final View f8635b;
    public final fi.m0[] f8636c;
    public final boolean[] d;
    public final RectF f8637e;
    public final Runnable f8638f;
    public final mc h;

    public cc(mc mcVar, ch.n0 n0Var, View view, fi.m0[] m0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = mcVar;
        this.f8634a = n0Var;
        this.f8635b = view;
        this.f8636c = m0VarArr;
        this.d = zArr;
        this.f8637e = rectF;
        this.f8638f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t80 t80Var;
        mc mcVar = this.h;
        bc bcVar = mcVar.F1;
        bcVar.setVisibility(4);
        bcVar.setPaused(true);
        ch.n0 n0Var = this.f8634a;
        if (n0Var != null) {
            n0Var.f5444k = true;
        }
        View view = this.f8635b;
        if (view != null) {
            view.invalidate();
        }
        fi.m0 m0Var = this.f8636c[0];
        if (m0Var != null) {
            m0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.x2*/.L();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.f8637e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                mcVar.f30195c.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f8638f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && (t80Var = launchActivity.f43108w0) != null) {
            t80Var.c(true);
        }
    }
}
