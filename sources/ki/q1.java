package ki;

import android.animation.ValueAnimator;
import android.graphics.Paint;
public final class q1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18868a;
    public final s2 f18869b;
    public final int f18870c;
    public final int d;

    public q1(s2 s2Var, int i7, int i10, int i11) {
        this.f18868a = i11;
        this.f18869b = s2Var;
        this.f18870c = i7;
        this.d = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f18868a) {
            case 0:
                s2 s2Var = this.f18869b;
                Paint paint = s2Var.R;
                paint.setColor(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f18870c, this.d));
                s2Var.F();
                s2Var.f18937f.invalidate();
                org.telegram.ui.b3 b3Var = s2Var.Z0;
                if (b3Var != null) {
                    if (org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b3Var.b(z10, false);
                    s2Var.Z0.setBackgroundColor(paint.getColor());
                }
                s2Var.K();
                return;
            default:
                s2 s2Var2 = this.f18869b;
                s2Var2.getClass();
                s2Var2.T = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f18870c, this.d);
                s2Var2.l();
                return;
        }
    }
}
