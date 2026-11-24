package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class tva extends AnimatorListenerAdapter {
    public final f19 a;
    public final View b;
    public final d76[] c;
    public final boolean[] d;
    public final RectF e;
    public final cta f;
    public final bwa h;

    public tva(bwa bwaVar, f19 f19Var, View view, d76[] d76VarArr, boolean[] zArr, RectF rectF, cta ctaVar) {
        this.h = bwaVar;
        this.a = f19Var;
        this.b = view;
        this.c = d76VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = ctaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        vz5 vz5Var;
        bwa bwaVar = this.h;
        n84 n84Var = bwaVar.E1;
        n84Var.setVisibility(4);
        n84Var.setPaused(true);
        f19 f19Var = this.a;
        if (f19Var != null) {
            f19Var.k = true;
        }
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
        d76 d76Var = this.c[0];
        if (d76Var != null) {
            d76Var.setDrawStar(true);
        }
        super/*fx0*/.I();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.a0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                bwaVar.c.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            cta ctaVar = this.f;
            if (ctaVar != null) {
                ctaVar.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && (vz5Var = launchActivity.w0) != null) {
            vz5Var.c(true);
        }
    }
}
