package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.u80;
public final class cc extends AnimatorListenerAdapter {
    public final ch.n0 f8631a;
    public final View f8632b;
    public final fi.m0[] f8633c;
    public final boolean[] d;
    public final RectF f8634e;
    public final Runnable f8635f;
    public final mc h;

    public cc(mc mcVar, ch.n0 n0Var, View view, fi.m0[] m0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = mcVar;
        this.f8631a = n0Var;
        this.f8632b = view;
        this.f8633c = m0VarArr;
        this.d = zArr;
        this.f8634e = rectF;
        this.f8635f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u80 u80Var;
        mc mcVar = this.h;
        bc bcVar = mcVar.F1;
        bcVar.setVisibility(4);
        bcVar.setPaused(true);
        ch.n0 n0Var = this.f8631a;
        if (n0Var != null) {
            n0Var.f5441k = true;
        }
        View view = this.f8632b;
        if (view != null) {
            view.invalidate();
        }
        fi.m0 m0Var = this.f8633c[0];
        if (m0Var != null) {
            m0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.x2*/.L();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.f8634e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                mcVar.f30193c.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f8635f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && (u80Var = launchActivity.f43108w0) != null) {
            u80Var.c(true);
        }
    }
}
