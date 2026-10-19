package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ja0;
public final class ae extends AnimatorListenerAdapter {
    public final ah.g1 f983a;
    public final View f984b;
    public final ci.q0[] f985c;
    public final boolean[] d;
    public final RectF e;
    public final Runnable f986f;
    public final le h;

    public ae(le leVar, ah.g1 g1Var, View view, ci.q0[] q0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = leVar;
        this.f983a = g1Var;
        this.f984b = view;
        this.f985c = q0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f986f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ja0 ja0Var;
        le leVar = this.h;
        zd zdVar = leVar.K;
        zdVar.setVisibility(4);
        zdVar.setPaused(true);
        ah.g1 g1Var = this.f983a;
        if (g1Var != null) {
            g1Var.f755l = true;
        }
        View view = this.f984b;
        if (view != null) {
            view.invalidate();
        }
        ci.q0 q0Var = this.f985c[0];
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
            Runnable runnable = this.f986f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && (ja0Var = launchActivity.f33193x0) != null) {
            ja0Var.c(true);
        }
    }
}
