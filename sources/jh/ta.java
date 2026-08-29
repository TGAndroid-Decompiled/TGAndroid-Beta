package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.oa0;
public final class ta extends AnimatorListenerAdapter {
    public final kg.o0 f12865a;
    public final View f12866b;
    public final lh.n0[] f12867c;
    public final boolean[] d;
    public final RectF f12868e;
    public final Runnable f12869f;
    public final db h;

    public ta(db dbVar, kg.o0 o0Var, View view, lh.n0[] n0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = dbVar;
        this.f12865a = o0Var;
        this.f12866b = view;
        this.f12867c = n0VarArr;
        this.d = zArr;
        this.f12868e = rectF;
        this.f12869f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        oa0 oa0Var;
        db dbVar = this.h;
        cg.i iVar = dbVar.F;
        iVar.setVisibility(4);
        iVar.setPaused(true);
        kg.o0 o0Var = this.f12865a;
        if (o0Var != null) {
            o0Var.f13806l = true;
        }
        View view = this.f12866b;
        if (view != null) {
            view.invalidate();
        }
        lh.n0 n0Var = this.f12867c[0];
        if (n0Var != null) {
            n0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.f3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.f12868e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                dbVar.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f12869f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null && (oa0Var = launchActivity.f35599t0) != null) {
            oa0Var.c(true);
        }
    }
}
