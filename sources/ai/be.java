package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pa0;
public final class be extends AnimatorListenerAdapter {
    public final ah.g1 f1058a;
    public final View f1059b;
    public final ci.q0[] f1060c;
    public final boolean[] d;
    public final RectF e;
    public final Runnable f1061f;
    public final me h;

    public be(me meVar, ah.g1 g1Var, View view, ci.q0[] q0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = meVar;
        this.f1058a = g1Var;
        this.f1059b = view;
        this.f1060c = q0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f1061f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        pa0 pa0Var;
        me meVar = this.h;
        ae aeVar = meVar.K;
        aeVar.setVisibility(4);
        aeVar.setPaused(true);
        ah.g1 g1Var = this.f1058a;
        if (g1Var != null) {
            g1Var.f756l = true;
        }
        View view = this.f1059b;
        if (view != null) {
            view.invalidate();
        }
        ci.q0 q0Var = this.f1060c[0];
        if (q0Var != null) {
            q0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.h3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.c0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                meVar.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f1061f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null && (pa0Var = launchActivity.f33503x0) != null) {
            pa0Var.c(true);
        }
    }
}
