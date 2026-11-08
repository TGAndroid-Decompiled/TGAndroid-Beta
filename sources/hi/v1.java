package hi;

import android.animation.ValueAnimator;
import android.graphics.Paint;
public final class v1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15000a;
    public final a3 f15001b;
    public final int f15002c;
    public final int d;

    public v1(a3 a3Var, int i7, int i10, int i11) {
        this.f15000a = i11;
        this.f15001b = a3Var;
        this.f15002c = i7;
        this.d = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z9;
        switch (this.f15000a) {
            case 0:
                a3 a3Var = this.f15001b;
                Paint paint = a3Var.Q;
                paint.setColor(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f15002c, this.d));
                a3Var.F();
                a3Var.f14519f.invalidate();
                org.telegram.ui.b3 b3Var = a3Var.Y0;
                if (b3Var != null) {
                    if (org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    b3Var.b(z9, false);
                    a3Var.Y0.setBackgroundColor(paint.getColor());
                }
                a3Var.K();
                return;
            default:
                a3 a3Var2 = this.f15001b;
                a3Var2.getClass();
                a3Var2.S = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f15002c, this.d);
                a3Var2.l();
                return;
        }
    }
}
