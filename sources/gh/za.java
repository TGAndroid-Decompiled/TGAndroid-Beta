package gh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.la0;
public final class za extends AnimatorListenerAdapter {
    public final hg.p0 f9267a;
    public final View f9268b;
    public final ih.p0[] f9269c;
    public final boolean[] d;
    public final RectF f9270e;
    public final Runnable f9271f;
    public final jb h;

    public za(jb jbVar, hg.p0 p0Var, View view, ih.p0[] p0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = jbVar;
        this.f9267a = p0Var;
        this.f9268b = view;
        this.f9269c = p0VarArr;
        this.d = zArr;
        this.f9270e = rectF;
        this.f9271f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        la0 la0Var;
        jb jbVar = this.h;
        dg.q qVar = jbVar.F;
        qVar.setVisibility(4);
        qVar.setPaused(true);
        hg.p0 p0Var = this.f9267a;
        if (p0Var != null) {
            p0Var.f10697l = true;
        }
        View view = this.f9268b;
        if (view != null) {
            view.invalidate();
        }
        ih.p0 p0Var2 = this.f9269c[0];
        if (p0Var2 != null) {
            p0Var2.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.f3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.f9270e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                jbVar.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f9271f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null && (la0Var = launchActivity.f35532t0) != null) {
            la0Var.c(true);
        }
    }
}
