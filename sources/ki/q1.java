package ki;

import android.animation.ValueAnimator;
import android.graphics.Paint;
public final class q1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18942a;
    public final t2 f18943b;
    public final int f18944c;
    public final int d;

    public q1(t2 t2Var, int i7, int i10, int i11) {
        this.f18942a = i11;
        this.f18943b = t2Var;
        this.f18944c = i7;
        this.d = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f18942a) {
            case 0:
                t2 t2Var = this.f18943b;
                Paint paint = t2Var.R;
                paint.setColor(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f18944c, this.d));
                t2Var.F();
                t2Var.f19025f.invalidate();
                org.telegram.ui.b3 b3Var = t2Var.Z0;
                if (b3Var != null) {
                    if (org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b3Var.b(z10, false);
                    t2Var.Z0.setBackgroundColor(paint.getColor());
                }
                t2Var.K();
                return;
            default:
                t2 t2Var2 = this.f18943b;
                t2Var2.getClass();
                t2Var2.T = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f18944c, this.d);
                t2Var2.l();
                return;
        }
    }
}
