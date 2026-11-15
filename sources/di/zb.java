package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r80;
public final class zb extends AnimatorListenerAdapter {
    public final ch.n0 f9857a;
    public final View f9858b;
    public final fi.n0[] f9859c;
    public final boolean[] d;
    public final RectF f9860e;
    public final Runnable f9861f;
    public final jc h;

    public zb(jc jcVar, ch.n0 n0Var, View view, fi.n0[] n0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = jcVar;
        this.f9857a = n0Var;
        this.f9858b = view;
        this.f9859c = n0VarArr;
        this.d = zArr;
        this.f9860e = rectF;
        this.f9861f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        r80 r80Var;
        jc jcVar = this.h;
        yb ybVar = jcVar.F1;
        ybVar.setVisibility(4);
        ybVar.setPaused(true);
        ch.n0 n0Var = this.f9857a;
        if (n0Var != null) {
            n0Var.f5153k = true;
        }
        View view = this.f9858b;
        if (view != null) {
            view.invalidate();
        }
        fi.n0 n0Var2 = this.f9859c[0];
        if (n0Var2 != null) {
            n0Var2.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.u2*/.L();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.f9860e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                jcVar.f29685c.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f9861f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && (r80Var = launchActivity.f42663w0) != null) {
            r80Var.c(true);
        }
    }
}
