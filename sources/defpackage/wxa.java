package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class wxa extends AnimatorListenerAdapter {
    public final i39 a;
    public final View b;
    public final d96[] c;
    public final boolean[] d;
    public final RectF e;
    public final fva f;
    public final eya h;

    public wxa(eya eyaVar, i39 i39Var, View view, d96[] d96VarArr, boolean[] zArr, RectF rectF, fva fvaVar) {
        this.h = eyaVar;
        this.a = i39Var;
        this.b = view;
        this.c = d96VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = fvaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v16 v16Var;
        eya eyaVar = this.h;
        w94 w94Var = eyaVar.E1;
        w94Var.setVisibility(4);
        w94Var.setPaused(true);
        i39 i39Var = this.a;
        if (i39Var != null) {
            i39Var.k = true;
        }
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
        d96 d96Var = this.c[0];
        if (d96Var != null) {
            d96Var.setDrawStar(true);
        }
        super/*my0*/.H();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.a0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                eyaVar.c.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            fva fvaVar = this.f;
            if (fvaVar != null) {
                fvaVar.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && (v16Var = launchActivity.w0) != null) {
            v16Var.c(true);
        }
    }
}
