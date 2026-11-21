package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.u80;
public final class cc extends AnimatorListenerAdapter {
    public final ch.n0 f8658a;
    public final View f8659b;
    public final fi.m0[] f8660c;
    public final boolean[] d;
    public final RectF f8661e;
    public final Runnable f8662f;
    public final mc h;

    public cc(mc mcVar, ch.n0 n0Var, View view, fi.m0[] m0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = mcVar;
        this.f8658a = n0Var;
        this.f8659b = view;
        this.f8660c = m0VarArr;
        this.d = zArr;
        this.f8661e = rectF;
        this.f8662f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u80 u80Var;
        mc mcVar = this.h;
        bc bcVar = mcVar.F1;
        bcVar.setVisibility(4);
        bcVar.setPaused(true);
        ch.n0 n0Var = this.f8658a;
        if (n0Var != null) {
            n0Var.f5470k = true;
        }
        View view = this.f8659b;
        if (view != null) {
            view.invalidate();
        }
        fi.m0 m0Var = this.f8660c[0];
        if (m0Var != null) {
            m0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.w2*/.L();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.f8661e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                mcVar.f30176c.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f8662f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && (u80Var = launchActivity.f43149w0) != null) {
            u80Var.c(true);
        }
    }
}
