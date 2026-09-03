package cg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.mr;
public final class y0 implements Runnable {
    public final int f2557a;
    public final d1 f2558b;
    public final s1 f2559c;

    public y0(d1 d1Var, s1 s1Var, int i10) {
        this.f2557a = i10;
        this.f2558b = d1Var;
        this.f2559c = s1Var;
    }

    @Override
    public final void run() {
        boolean z4;
        boolean z10;
        float f10;
        int i10 = this.f2557a;
        s1 s1Var = this.f2559c;
        d1 d1Var = this.f2558b;
        switch (i10) {
            case 0:
                d1Var.f2319c = s1Var;
                if (d1Var.h == null) {
                    d1Var.h = new RectF();
                }
                d1Var.f2319c.a(d1Var.h);
                o5.i iVar = d1Var.f2317a;
                if (iVar != null) {
                    iVar.q();
                    return;
                }
                return;
            default:
                if (s1Var != null && d1Var.f2330q == 0) {
                    d1Var.f2330q = g2.b(d1Var.f2321g);
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
                    d1Var.K.setInterpolator(mr.h);
                    d1Var.K.start();
                    d1Var.d = s1Var;
                    o5.i iVar2 = d1Var.f2317a;
                    if (iVar2 != null) {
                        iVar2.q();
                    }
                    if (d1Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        return;
                    }
                    return;
                } else if (s1Var != d1Var.d) {
                    d1Var.d = s1Var;
                    o5.i iVar3 = d1Var.f2317a;
                    if (iVar3 != null) {
                        iVar3.q();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
