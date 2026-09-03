package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ya0;
public final class ua extends AnimatorListenerAdapter {
    public final mg.o0 f13211a;
    public final View f13212b;
    public final nh.o0[] f13213c;
    public final boolean[] d;
    public final RectF e;
    public final Runnable f13214f;
    public final eb h;

    public ua(eb ebVar, mg.o0 o0Var, View view, nh.o0[] o0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = ebVar;
        this.f13211a = o0Var;
        this.f13212b = view;
        this.f13213c = o0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f13214f = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ya0 ya0Var;
        eb ebVar = this.h;
        eg.i iVar = ebVar.G;
        iVar.setVisibility(4);
        iVar.setPaused(true);
        mg.o0 o0Var = this.f13211a;
        if (o0Var != null) {
            o0Var.f14076l = true;
        }
        View view = this.f13212b;
        if (view != null) {
            view.invalidate();
        }
        nh.o0 o0Var2 = this.f13213c[0];
        if (o0Var2 != null) {
            o0Var2.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.g3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                ebVar.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f13214f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null && (ya0Var = launchActivity.f31626u0) != null) {
            ya0Var.c(true);
        }
    }
}
