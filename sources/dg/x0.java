package dg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.pr;
public final class x0 implements Runnable {
    public final int f4717a;
    public final c1 f4718b;
    public final r1 f4719c;

    public x0(c1 c1Var, r1 r1Var, int i10) {
        this.f4717a = i10;
        this.f4718b = c1Var;
        this.f4719c = r1Var;
    }

    @Override
    public final void run() {
        boolean z4;
        boolean z10;
        float f10;
        int i10 = this.f4717a;
        r1 r1Var = this.f4719c;
        c1 c1Var = this.f4718b;
        switch (i10) {
            case 0:
                c1Var.f4453c = r1Var;
                if (c1Var.h == null) {
                    c1Var.h = new RectF();
                }
                c1Var.f4453c.a(c1Var.h);
                o5.i iVar = c1Var.f4451a;
                if (iVar != null) {
                    iVar.c();
                    return;
                }
                return;
            default:
                if (r1Var != null && c1Var.f4465q == 0) {
                    c1Var.f4465q = f2.b(c1Var.f4456g);
                }
                boolean z11 = c1Var.H;
                if (r1Var != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z11 != z4) {
                    if (r1Var != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c1Var.H = z10;
                    ValueAnimator valueAnimator = c1Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        c1Var.K = null;
                    }
                    float f11 = c1Var.I;
                    if (c1Var.H) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    c1Var.K = ofFloat;
                    ofFloat.addUpdateListener(new v0(c1Var, 0));
                    c1Var.K.addListener(new b1(c1Var, 0));
                    c1Var.K.setInterpolator(pr.h);
                    c1Var.K.start();
                    c1Var.d = r1Var;
                    o5.i iVar2 = c1Var.f4451a;
                    if (iVar2 != null) {
                        iVar2.c();
                    }
                    if (c1Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        return;
                    }
                    return;
                } else if (r1Var != c1Var.d) {
                    c1Var.d = r1Var;
                    o5.i iVar3 = c1Var.f4451a;
                    if (iVar3 != null) {
                        iVar3.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
