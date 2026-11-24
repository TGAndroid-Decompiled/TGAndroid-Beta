package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;
public final class dw7 implements Runnable {
    public final byte a;
    public final hw7 b;
    public final dba c;

    public dw7(hw7 hw7Var, dba dbaVar, byte b) {
        this.a = b;
        this.b = hw7Var;
        this.c = dbaVar;
    }

    @Override
    public final void run() {
        boolean z;
        boolean z2;
        float f;
        byte b = this.a;
        dba dbaVar = this.c;
        hw7 hw7Var = this.b;
        switch (b) {
            case 0:
                hw7Var.c = dbaVar;
                RectF rectF = hw7Var.h;
                if (rectF == null) {
                    rectF = new RectF();
                    hw7Var.h = rectF;
                }
                hw7Var.c.a(rectF);
                x59 x59Var = hw7Var.a;
                if (x59Var != null) {
                    x59Var.f0();
                    return;
                }
                return;
            default:
                if (dbaVar != null && hw7Var.q == 0) {
                    hw7Var.q = dlb.b(hw7Var.g);
                }
                boolean z3 = hw7Var.H;
                if (dbaVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z3 != z) {
                    if (dbaVar != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hw7Var.H = z2;
                    ValueAnimator valueAnimator = hw7Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        hw7Var.K = null;
                    }
                    float f2 = hw7Var.I;
                    if (hw7Var.H) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                    hw7Var.K = ofFloat;
                    ofFloat.addUpdateListener(new cw7(hw7Var, (byte) 0));
                    hw7Var.K.addListener(new gw7(hw7Var, (byte) 0));
                    hw7Var.K.setInterpolator(d53.h);
                    hw7Var.K.start();
                    hw7Var.d = dbaVar;
                    x59 x59Var2 = hw7Var.a;
                    if (x59Var2 != null) {
                        x59Var2.f0();
                    }
                    if (hw7Var.H) {
                        xx0.SELECTION_CHANGE.a();
                        return;
                    }
                    return;
                } else if (dbaVar != hw7Var.d) {
                    hw7Var.d = dbaVar;
                    x59 x59Var3 = hw7Var.a;
                    if (x59Var3 != null) {
                        x59Var3.f0();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
