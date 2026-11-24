package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;
public final class cu7 implements Runnable {
    public final byte a;
    public final gu7 b;
    public final d9a c;

    public cu7(gu7 gu7Var, d9a d9aVar, byte b) {
        this.a = b;
        this.b = gu7Var;
        this.c = d9aVar;
    }

    @Override
    public final void run() {
        boolean z;
        boolean z2;
        float f;
        byte b = this.a;
        d9a d9aVar = this.c;
        gu7 gu7Var = this.b;
        switch (b) {
            case 0:
                gu7Var.c = d9aVar;
                RectF rectF = gu7Var.h;
                if (rectF == null) {
                    rectF = new RectF();
                    gu7Var.h = rectF;
                }
                gu7Var.c.a(rectF);
                u39 u39Var = gu7Var.a;
                if (u39Var != null) {
                    u39Var.i0();
                    return;
                }
                return;
            default:
                if (d9aVar != null && gu7Var.q == 0) {
                    gu7Var.q = cjb.b(gu7Var.g);
                }
                boolean z3 = gu7Var.H;
                if (d9aVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z3 != z) {
                    if (d9aVar != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    gu7Var.H = z2;
                    ValueAnimator valueAnimator = gu7Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        gu7Var.K = null;
                    }
                    float f2 = gu7Var.I;
                    if (gu7Var.H) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                    gu7Var.K = ofFloat;
                    ofFloat.addUpdateListener(new bu7(gu7Var, (byte) 0));
                    gu7Var.K.addListener(new fu7(gu7Var, (byte) 0));
                    gu7Var.K.setInterpolator(s33.h);
                    gu7Var.K.start();
                    gu7Var.d = d9aVar;
                    u39 u39Var2 = gu7Var.a;
                    if (u39Var2 != null) {
                        u39Var2.i0();
                    }
                    if (gu7Var.H) {
                        pw0.SELECTION_CHANGE.a();
                        return;
                    }
                    return;
                } else if (d9aVar != gu7Var.d) {
                    gu7Var.d = d9aVar;
                    u39 u39Var3 = gu7Var.a;
                    if (u39Var3 != null) {
                        u39Var3.i0();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
