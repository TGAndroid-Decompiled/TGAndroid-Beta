package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Paint;
public final class tw0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final wx0 b;
    public final int c;
    public final int d;

    public tw0(wx0 wx0Var, int i, int i2, byte b) {
        this.a = b;
        this.b = wx0Var;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        byte b = this.a;
        int i = this.d;
        int i2 = this.c;
        wx0 wx0Var = this.b;
        switch (b) {
            case 0:
                Paint paint = wx0Var.R;
                paint.setColor(on2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i));
                wx0Var.F();
                wx0Var.f.invalidate();
                cx cxVar = wx0Var.Z0;
                if (cxVar != null) {
                    if (gm.B(paint.getColor()) <= 0.721f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cxVar.b(z, false);
                    wx0Var.Z0.setBackgroundColor(paint.getColor());
                }
                wx0Var.K();
                return;
            default:
                wx0Var.T = on2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i);
                wx0Var.h();
                return;
        }
    }
}
