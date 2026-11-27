package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Paint;
public final class uv0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final xw0 b;
    public final int c;
    public final int d;

    public uv0(xw0 xw0Var, int i, int i2, byte b) {
        this.a = b;
        this.b = xw0Var;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        byte b = this.a;
        int i = this.d;
        int i2 = this.c;
        xw0 xw0Var = this.b;
        switch (b) {
            case 0:
                Paint paint = xw0Var.R;
                paint.setColor(vm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i));
                xw0Var.F();
                xw0Var.f.invalidate();
                dw dwVar = xw0Var.Z0;
                if (dwVar != null) {
                    if (hl.B(paint.getColor()) <= 0.721f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    dwVar.b(z, false);
                    xw0Var.Z0.setBackgroundColor(paint.getColor());
                }
                xw0Var.K();
                return;
            default:
                xw0Var.T = vm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i);
                xw0Var.h();
                return;
        }
    }
}
