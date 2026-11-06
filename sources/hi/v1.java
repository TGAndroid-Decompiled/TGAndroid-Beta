package hi;

import android.animation.ValueAnimator;
import android.graphics.Paint;
public final class v1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14997a;
    public final a3 f14998b;
    public final int f14999c;
    public final int d;

    public v1(a3 a3Var, int i7, int i10, int i11) {
        this.f14997a = i11;
        this.f14998b = a3Var;
        this.f14999c = i7;
        this.d = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z9;
        switch (this.f14997a) {
            case 0:
                a3 a3Var = this.f14998b;
                Paint paint = a3Var.Q;
                paint.setColor(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f14999c, this.d));
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
                a3 a3Var2 = this.f14998b;
                a3Var2.getClass();
                a3Var2.S = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f14999c, this.d);
                a3Var2.l();
                return;
        }
    }
}
