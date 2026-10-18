package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.la0;
public final class ae extends AnimatorListenerAdapter {
    public final ah.g1 f986a;
    public final View f987b;
    public final ci.q0[] f988c;
    public final boolean[] d;
    public final RectF e;
    public final Runnable f989f;
    public final le h;

    public ae(le leVar, ah.g1 g1Var, View view, ci.q0[] q0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = leVar;
        this.f986a = g1Var;
        this.f987b = view;
        this.f988c = q0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f989f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        la0 la0Var;
        le leVar = this.h;
        zd zdVar = leVar.K;
        zdVar.setVisibility(4);
        zdVar.setPaused(true);
        ah.g1 g1Var = this.f986a;
        if (g1Var != null) {
            g1Var.f757l = true;
        }
        View view = this.f987b;
        if (view != null) {
            view.invalidate();
        }
        ci.q0 q0Var = this.f988c[0];
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
            Runnable runnable = this.f989f;
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
