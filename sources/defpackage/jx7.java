package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;
public final class jx7 implements Runnable {
    public final byte a;
    public final nx7 b;
    public final uca c;

    public jx7(nx7 nx7Var, uca ucaVar, byte b) {
        this.a = b;
        this.b = nx7Var;
        this.c = ucaVar;
    }

    @Override
    public final void run() {
        boolean z;
        boolean z2;
        float f;
        byte b = this.a;
        uca ucaVar = this.c;
        nx7 nx7Var = this.b;
        switch (b) {
            case 0:
                nx7Var.c = ucaVar;
                RectF rectF = nx7Var.h;
                if (rectF == null) {
                    rectF = new RectF();
                    nx7Var.h = rectF;
                }
                nx7Var.c.a(rectF);
                xh4 xh4Var = nx7Var.a;
                if (xh4Var != null) {
                    xh4Var.v();
                    return;
                }
                return;
            default:
                if (ucaVar != null && nx7Var.q == 0) {
                    nx7Var.q = ymb.b(nx7Var.g);
                }
                boolean z3 = nx7Var.H;
                if (ucaVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z3 != z) {
                    if (ucaVar != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    nx7Var.H = z2;
                    ValueAnimator valueAnimator = nx7Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        nx7Var.K = null;
                    }
                    float f2 = nx7Var.I;
                    if (nx7Var.H) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                    nx7Var.K = ofFloat;
                    ofFloat.addUpdateListener(new ix7(nx7Var, (byte) 0));
                    nx7Var.K.addListener(new mx7(nx7Var, (byte) 0));
                    nx7Var.K.setInterpolator(k43.h);
                    nx7Var.K.start();
                    nx7Var.d = ucaVar;
                    xh4 xh4Var2 = nx7Var.a;
                    if (xh4Var2 != null) {
                        xh4Var2.v();
                    }
                    if (nx7Var.H) {
                        yw0.SELECTION_CHANGE.a();
                        return;
                    }
                    return;
                } else if (ucaVar != nx7Var.d) {
                    nx7Var.d = ucaVar;
                    xh4 xh4Var3 = nx7Var.a;
                    if (xh4Var3 != null) {
                        xh4Var3.v();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
