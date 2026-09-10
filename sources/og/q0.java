package og;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.wr;
public final class q0 implements Runnable {
    public final int f14461a;
    public final v0 f14462b;
    public final k1 f14463c;

    public q0(v0 v0Var, k1 k1Var, int i10) {
        this.f14461a = i10;
        this.f14462b = v0Var;
        this.f14463c = k1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f7;
        int i10 = this.f14461a;
        k1 k1Var = this.f14463c;
        v0 v0Var = this.f14462b;
        switch (i10) {
            case 0:
                v0Var.f14514c = k1Var;
                if (v0Var.h == null) {
                    v0Var.h = new RectF();
                }
                v0Var.f14514c.a(v0Var.h);
                l2.h hVar = v0Var.f14512a;
                if (hVar != null) {
                    hVar.n();
                    return;
                }
                return;
            default:
                if (k1Var != null && v0Var.f14525q == 0) {
                    v0Var.f14525q = w1.b(v0Var.f14516g);
                }
                boolean z12 = v0Var.H;
                if (k1Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 != z10) {
                    if (k1Var != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    v0Var.H = z11;
                    ValueAnimator valueAnimator = v0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        v0Var.K = null;
                    }
                    float f10 = v0Var.I;
                    if (v0Var.H) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    v0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new o0(v0Var, 0));
                    v0Var.K.addListener(new t0(v0Var, 0));
                    v0Var.K.setInterpolator(wr.h);
                    v0Var.K.start();
                    v0Var.d = k1Var;
                    l2.h hVar2 = v0Var.f14512a;
                    if (hVar2 != null) {
                        hVar2.n();
                    }
                    if (v0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        return;
                    }
                    return;
                } else if (k1Var != v0Var.d) {
                    v0Var.d = k1Var;
                    l2.h hVar3 = v0Var.f14512a;
                    if (hVar3 != null) {
                        hVar3.n();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
