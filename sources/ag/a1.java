package ag;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.jr;
public final class a1 implements Runnable {
    public final int f411a;
    public final f1 f412b;
    public final w1 f413c;

    public a1(f1 f1Var, w1 w1Var, int i10) {
        this.f411a = i10;
        this.f412b = f1Var;
        this.f413c = w1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f9;
        int i10 = this.f411a;
        w1 w1Var = this.f413c;
        f1 f1Var = this.f412b;
        switch (i10) {
            case 0:
                f1Var.f471c = w1Var;
                if (f1Var.h == null) {
                    f1Var.h = new RectF();
                }
                f1Var.f471c.a(f1Var.h);
                o1 o1Var = f1Var.f469a;
                if (o1Var != null) {
                    o1Var.c();
                    return;
                }
                return;
            default:
                if (w1Var != null && f1Var.f483q == 0) {
                    f1Var.f483q = l2.b(f1Var.f474g);
                }
                boolean z12 = f1Var.H;
                if (w1Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 != z10) {
                    if (w1Var != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    f1Var.H = z11;
                    ValueAnimator valueAnimator = f1Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        f1Var.K = null;
                    }
                    float f10 = f1Var.I;
                    if (f1Var.H) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
                    f1Var.K = ofFloat;
                    ofFloat.addUpdateListener(new y0(f1Var, 0));
                    f1Var.K.addListener(new e1(f1Var, 0));
                    f1Var.K.setInterpolator(jr.h);
                    f1Var.K.start();
                    f1Var.d = w1Var;
                    o1 o1Var2 = f1Var.f469a;
                    if (o1Var2 != null) {
                        o1Var2.c();
                    }
                    if (f1Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        return;
                    }
                    return;
                } else if (w1Var != f1Var.d) {
                    f1Var.d = w1Var;
                    o1 o1Var3 = f1Var.f469a;
                    if (o1Var3 != null) {
                        o1Var3.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
