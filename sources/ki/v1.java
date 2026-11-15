package ki;

import android.animation.ValueAnimator;
import android.graphics.Paint;
public final class v1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18601a;
    public final x2 f18602b;
    public final int f18603c;
    public final int d;

    public v1(x2 x2Var, int i7, int i10, int i11) {
        this.f18601a = i11;
        this.f18602b = x2Var;
        this.f18603c = i7;
        this.d = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f18601a) {
            case 0:
                x2 x2Var = this.f18602b;
                Paint paint = x2Var.R;
                paint.setColor(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f18603c, this.d));
                x2Var.F();
                x2Var.f18661f.invalidate();
                org.telegram.ui.b3 b3Var = x2Var.Z0;
                if (b3Var != null) {
                    if (org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b3Var.b(z10, false);
                    x2Var.Z0.setBackgroundColor(paint.getColor());
                }
                x2Var.K();
                return;
            default:
                x2 x2Var2 = this.f18602b;
                x2Var2.getClass();
                x2Var2.T = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f18603c, this.d);
                x2Var2.l();
                return;
        }
    }
}
