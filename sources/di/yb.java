package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r80;
public final class yb extends AnimatorListenerAdapter {
    public final ch.n0 f9807a;
    public final View f9808b;
    public final fi.n0[] f9809c;
    public final boolean[] d;
    public final RectF f9810e;
    public final Runnable f9811f;
    public final ic h;

    public yb(ic icVar, ch.n0 n0Var, View view, fi.n0[] n0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = icVar;
        this.f9807a = n0Var;
        this.f9808b = view;
        this.f9809c = n0VarArr;
        this.d = zArr;
        this.f9810e = rectF;
        this.f9811f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        r80 r80Var;
        ic icVar = this.h;
        xb xbVar = icVar.F1;
        xbVar.setVisibility(4);
        xbVar.setPaused(true);
        ch.n0 n0Var = this.f9807a;
        if (n0Var != null) {
            n0Var.f5156k = true;
        }
        View view = this.f9808b;
        if (view != null) {
            view.invalidate();
        }
        fi.n0 n0Var2 = this.f9809c[0];
        if (n0Var2 != null) {
            n0Var2.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.u2*/.L();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.f9810e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                icVar.f29685c.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f9811f;
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
