package gi;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11220a;
    public final d3 f11221b;
    public final int f11222c;
    public final int d;

    public f2(d3 d3Var, int i10, int i11, int i12) {
        this.f11220a = i12;
        this.f11221b = d3Var;
        this.f11222c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f11220a) {
            case 0:
                d3 d3Var = this.f11221b;
                Paint paint = d3Var.Q;
                paint.setColor(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f11222c, this.d));
                d3Var.B();
                d3Var.f11164f.invalidate();
                org.telegram.ui.e3 e3Var = d3Var.Y0;
                if (e3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e3Var.b(z10, false);
                    d3Var.Y0.setBackgroundColor(paint.getColor());
                }
                d3Var.G();
                return;
            default:
                d3 d3Var2 = this.f11221b;
                d3Var2.getClass();
                d3Var2.S = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f11222c, this.d);
                d3Var2.h();
                return;
        }
    }
}
