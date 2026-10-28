package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qa0;
public final class rd extends AnimatorListenerAdapter {
    public final bh.v0 f5377a;
    public final View f5378b;
    public final di.q0[] f5379c;
    public final boolean[] d;
    public final RectF e;
    public final Runnable f5380f;
    public final be h;

    public rd(be beVar, bh.v0 v0Var, View view, di.q0[] q0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = beVar;
        this.f5377a = v0Var;
        this.f5378b = view;
        this.f5379c = q0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f5380f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        qa0 qa0Var;
        be beVar = this.h;
        qd qdVar = beVar.K;
        qdVar.setVisibility(4);
        qdVar.setPaused(true);
        bh.v0 v0Var = this.f5377a;
        if (v0Var != null) {
            v0Var.f4178l = true;
        }
        View view = this.f5378b;
        if (view != null) {
            view.invalidate();
        }
        di.q0 q0Var = this.f5379c[0];
        if (q0Var != null) {
            q0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.k3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.c0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                beVar.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f5380f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null && (qa0Var = launchActivity.f35591x0) != null) {
            qa0Var.c(true);
        }
    }
}
