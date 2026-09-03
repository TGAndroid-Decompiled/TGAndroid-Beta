package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xa0;
public final class ua extends AnimatorListenerAdapter {
    public final ng.o0 f14907a;
    public final View f14908b;
    public final oh.o0[] f14909c;
    public final boolean[] d;
    public final RectF f14910e;
    public final Runnable f14911f;
    public final eb h;

    public ua(eb ebVar, ng.o0 o0Var, View view, oh.o0[] o0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = ebVar;
        this.f14907a = o0Var;
        this.f14908b = view;
        this.f14909c = o0VarArr;
        this.d = zArr;
        this.f14910e = rectF;
        this.f14911f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        xa0 xa0Var;
        eb ebVar = this.h;
        fg.i iVar = ebVar.G;
        iVar.setVisibility(4);
        iVar.setPaused(true);
        ng.o0 o0Var = this.f14907a;
        if (o0Var != null) {
            o0Var.f16160l = true;
        }
        View view = this.f14908b;
        if (view != null) {
            view.invalidate();
        }
        oh.o0 o0Var2 = this.f14909c[0];
        if (o0Var2 != null) {
            o0Var2.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.h3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.f14910e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                ebVar.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f14911f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null && (xa0Var = launchActivity.f34174u0) != null) {
            xa0Var.c(true);
        }
    }
}
