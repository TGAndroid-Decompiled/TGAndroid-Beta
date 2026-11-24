package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Paint;
public final class jv0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ow0 b;
    public final int c;
    public final int d;

    public jv0(ow0 ow0Var, int i, int i2, byte b) {
        this.a = b;
        this.b = ow0Var;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        byte b = this.a;
        int i = this.d;
        int i2 = this.c;
        ow0 ow0Var = this.b;
        switch (b) {
            case 0:
                Paint paint = ow0Var.R;
                paint.setColor(bm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i));
                ow0Var.F();
                ow0Var.f.invalidate();
                cw cwVar = ow0Var.Z0;
                if (cwVar != null) {
                    if (gl.B(paint.getColor()) <= 0.721f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cwVar.b(z, false);
                    ow0Var.Z0.setBackgroundColor(paint.getColor());
                }
                ow0Var.K();
                return;
            default:
                ow0Var.T = bm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i);
                ow0Var.h();
                return;
        }
    }
}
