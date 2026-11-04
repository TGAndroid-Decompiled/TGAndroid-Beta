package ii;

import android.animation.ValueAnimator;
import android.graphics.Paint;
public final class v1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15269a;
    public final a3 f15270b;
    public final int f15271c;
    public final int d;

    public v1(a3 a3Var, int i3, int i10, int i11) {
        this.f15269a = i11;
        this.f15270b = a3Var;
        this.f15271c = i3;
        this.d = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f15269a) {
            case 0:
                a3 a3Var = this.f15270b;
                Paint paint = a3Var.R;
                paint.setColor(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f15271c, this.d));
                a3Var.F();
                a3Var.f14802f.invalidate();
                org.telegram.ui.c3 c3Var = a3Var.Z0;
                if (c3Var != null) {
                    if (org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c3Var.b(z10, false);
                    a3Var.Z0.setBackgroundColor(paint.getColor());
                }
                a3Var.K();
                return;
            default:
                a3 a3Var2 = this.f15270b;
                a3Var2.getClass();
                a3Var2.T = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f15271c, this.d);
                a3Var2.l();
                return;
        }
    }
}
