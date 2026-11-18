package ki;

import android.animation.ValueAnimator;
import android.graphics.Paint;
public final class r1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18861a;
    public final t2 f18862b;
    public final int f18863c;
    public final int d;

    public r1(t2 t2Var, int i7, int i10, int i11) {
        this.f18861a = i11;
        this.f18862b = t2Var;
        this.f18863c = i7;
        this.d = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f18861a) {
            case 0:
                t2 t2Var = this.f18862b;
                Paint paint = t2Var.R;
                paint.setColor(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f18863c, this.d));
                t2Var.F();
                t2Var.f18930f.invalidate();
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
                t2 t2Var2 = this.f18862b;
                t2Var2.getClass();
                t2Var2.T = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f18863c, this.d);
                t2Var2.l();
                return;
        }
    }
}
