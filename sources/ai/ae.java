package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.la0;
public final class ae extends AnimatorListenerAdapter {
    public final ah.g1 f984a;
    public final View f985b;
    public final ci.q0[] f986c;
    public final boolean[] d;
    public final RectF e;
    public final Runnable f987f;
    public final le h;

    public ae(le leVar, ah.g1 g1Var, View view, ci.q0[] q0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = leVar;
        this.f984a = g1Var;
        this.f985b = view;
        this.f986c = q0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f987f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        la0 la0Var;
        le leVar = this.h;
        zd zdVar = leVar.K;
        zdVar.setVisibility(4);
        zdVar.setPaused(true);
        ah.g1 g1Var = this.f984a;
        if (g1Var != null) {
            g1Var.f757l = true;
        }
        View view = this.f985b;
        if (view != null) {
            view.invalidate();
        }
        ci.q0 q0Var = this.f986c[0];
        if (q0Var != null) {
            q0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.f3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.c0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                leVar.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f987f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && (la0Var = launchActivity.f33194x0) != null) {
            la0Var.c(true);
        }
    }
}
