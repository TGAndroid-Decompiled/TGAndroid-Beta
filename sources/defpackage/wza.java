package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class wza extends AnimatorListenerAdapter {
    public final u49 a;
    public final View b;
    public final h96[] c;
    public final boolean[] d;
    public final RectF e;
    public final fxa f;
    public final e0b h;

    public wza(e0b e0bVar, u49 u49Var, View view, h96[] h96VarArr, boolean[] zArr, RectF rectF, fxa fxaVar) {
        this.h = e0bVar;
        this.a = u49Var;
        this.b = view;
        this.c = h96VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = fxaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        y16 y16Var;
        e0b e0bVar = this.h;
        i94 i94Var = e0bVar.E1;
        i94Var.setVisibility(4);
        i94Var.setPaused(true);
        u49 u49Var = this.a;
        if (u49Var != null) {
            u49Var.k = true;
        }
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
        h96 h96Var = this.c[0];
        if (h96Var != null) {
            h96Var.setDrawStar(true);
        }
        super/*nx0*/.H();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.a0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                e0bVar.c.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            fxa fxaVar = this.f;
            if (fxaVar != null) {
                fxaVar.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && (y16Var = launchActivity.w0) != null) {
            y16Var.c(true);
        }
    }
}
