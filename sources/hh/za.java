package hh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pa0;

public final class za extends AnimatorListenerAdapter {

    public final ig.o0 f10441a;

    public final View f10442b;

    public final jh.n0[] f10443c;
    public final boolean[] d;

    public final RectF f10444e;

    public final Runnable f10445f;
    public final jb h;

    public za(jb jbVar, ig.o0 o0Var, View view, jh.n0[] n0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = jbVar;
        this.f10441a = o0Var;
        this.f10442b = view;
        this.f10443c = n0VarArr;
        this.d = zArr;
        this.f10444e = rectF;
        this.f10445f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        pa0 pa0Var;
        jb jbVar = this.h;
        ag.k kVar = jbVar.F;
        kVar.setVisibility(4);
        kVar.setPaused(true);
        ig.o0 o0Var = this.f10441a;
        if (o0Var != null) {
            o0Var.f11393l = true;
        }
        View view = this.f10442b;
        if (view != null) {
            view.invalidate();
        }
        jh.n0 n0Var = this.f10443c[0];
        if (n0Var != null) {
            n0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.e3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.f10444e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                jbVar.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f10445f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity == null || (pa0Var = launchActivity.f35535t0) == null) {
            return;
        }
        pa0Var.c(true);
    }
}
