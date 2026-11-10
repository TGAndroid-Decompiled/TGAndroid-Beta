package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.u80;
public final class rd extends AnimatorListenerAdapter {
    public final ch.m0 f4650a;
    public final View f4651b;
    public final di.n0[] f4652c;
    public final boolean[] d;
    public final RectF f4653e;
    public final Runnable f4654f;
    public final ce h;

    public rd(ce ceVar, ch.m0 m0Var, View view, di.n0[] n0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = ceVar;
        this.f4650a = m0Var;
        this.f4651b = view;
        this.f4652c = n0VarArr;
        this.d = zArr;
        this.f4653e = rectF;
        this.f4654f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u80 u80Var;
        ce ceVar = this.h;
        qd qdVar = ceVar.E1;
        qdVar.setVisibility(4);
        qdVar.setPaused(true);
        ch.m0 m0Var = this.f4650a;
        if (m0Var != null) {
            m0Var.f6326k = true;
        }
        View view = this.f4651b;
        if (view != null) {
            view.invalidate();
        }
        di.n0 n0Var = this.f4652c[0];
        if (n0Var != null) {
            n0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.w2*/.K();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.f4653e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                ceVar.f28675c.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f4654f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (u80Var = launchActivity.f41291v0) != null) {
            u80Var.c(true);
        }
    }
}
