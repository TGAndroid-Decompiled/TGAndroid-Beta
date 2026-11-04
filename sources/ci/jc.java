package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p80;
public final class jc extends AnimatorListenerAdapter {
    public final dh.l0 f5360a;
    public final View f5361b;
    public final ei.p0[] f5362c;
    public final boolean[] d;
    public final RectF f5363e;
    public final Runnable f5364f;
    public final tc h;

    public jc(tc tcVar, dh.l0 l0Var, View view, ei.p0[] p0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = tcVar;
        this.f5360a = l0Var;
        this.f5361b = view;
        this.f5362c = p0VarArr;
        this.d = zArr;
        this.f5363e = rectF;
        this.f5364f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p80 p80Var;
        tc tcVar = this.h;
        ic icVar = tcVar.C1;
        icVar.setVisibility(4);
        icVar.setPaused(true);
        dh.l0 l0Var = this.f5360a;
        if (l0Var != null) {
            l0Var.f9074k = true;
        }
        View view = this.f5361b;
        if (view != null) {
            view.invalidate();
        }
        ei.p0 p0Var = this.f5362c[0];
        if (p0Var != null) {
            p0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.t2*/.K();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.f5363e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                tcVar.f28589c.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f5364f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity != null && (p80Var = launchActivity.f41328y0) != null) {
            p80Var.c(true);
        }
    }
}
