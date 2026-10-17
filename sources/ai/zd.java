package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.la0;
public final class zd extends AnimatorListenerAdapter {
    public final ah.g1 f2557a;
    public final View f2558b;
    public final ci.q0[] f2559c;
    public final boolean[] d;
    public final RectF e;
    public final Runnable f2560f;
    public final ke h;

    public zd(ke keVar, ah.g1 g1Var, View view, ci.q0[] q0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = keVar;
        this.f2557a = g1Var;
        this.f2558b = view;
        this.f2559c = q0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f2560f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        la0 la0Var;
        ke keVar = this.h;
        yd ydVar = keVar.K;
        ydVar.setVisibility(4);
        ydVar.setPaused(true);
        ah.g1 g1Var = this.f2557a;
        if (g1Var != null) {
            g1Var.f757l = true;
        }
        View view = this.f2558b;
        if (view != null) {
            view.invalidate();
        }
        ci.q0 q0Var = this.f2559c[0];
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
                keVar.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f2560f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && (la0Var = launchActivity.f33187x0) != null) {
            la0Var.c(true);
        }
    }
}
