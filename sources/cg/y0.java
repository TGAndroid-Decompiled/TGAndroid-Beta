package cg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.nr;
public final class y0 implements Runnable {
    public final int f2574a;
    public final d1 f2575b;
    public final s1 f2576c;

    public y0(d1 d1Var, s1 s1Var, int i10) {
        this.f2574a = i10;
        this.f2575b = d1Var;
        this.f2576c = s1Var;
    }

    @Override
    public final void run() {
        boolean z4;
        boolean z10;
        float f10;
        int i10 = this.f2574a;
        s1 s1Var = this.f2576c;
        d1 d1Var = this.f2575b;
        switch (i10) {
            case 0:
                d1Var.f2336c = s1Var;
                if (d1Var.h == null) {
                    d1Var.h = new RectF();
                }
                d1Var.f2336c.a(d1Var.h);
                o5.i iVar = d1Var.f2334a;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
            default:
                if (s1Var != null && d1Var.f2347q == 0) {
                    d1Var.f2347q = g2.b(d1Var.f2338g);
                }
                boolean z11 = d1Var.H;
                if (s1Var != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z11 != z4) {
                    if (s1Var != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    d1Var.H = z10;
                    ValueAnimator valueAnimator = d1Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        d1Var.K = null;
                    }
                    float f11 = d1Var.I;
                    if (d1Var.H) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    d1Var.K = ofFloat;
                    ofFloat.addUpdateListener(new w0(d1Var, 0));
                    d1Var.K.addListener(new c1(d1Var, 0));
                    d1Var.K.setInterpolator(nr.h);
                    d1Var.K.start();
                    d1Var.d = s1Var;
                    o5.i iVar2 = d1Var.f2334a;
                    if (iVar2 != null) {
                        iVar2.d();
                    }
                    if (d1Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        return;
                    }
                    return;
                } else if (s1Var != d1Var.d) {
                    d1Var.d = s1Var;
                    o5.i iVar3 = d1Var.f2334a;
                    if (iVar3 != null) {
                        iVar3.d();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
