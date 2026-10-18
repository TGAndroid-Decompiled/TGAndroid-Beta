package gi;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11201a;
    public final d3 f11202b;
    public final int f11203c;
    public final int d;

    public f2(d3 d3Var, int i10, int i11, int i12) {
        this.f11201a = i12;
        this.f11202b = d3Var;
        this.f11203c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f11201a) {
            case 0:
                d3 d3Var = this.f11202b;
                Paint paint = d3Var.P;
                paint.setColor(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f11203c, this.d));
                d3Var.B();
                d3Var.e.invalidate();
                org.telegram.ui.f3 f3Var = d3Var.U0;
                if (f3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    f3Var.b(z10, false);
                    d3Var.U0.setBackgroundColor(paint.getColor());
                }
                d3Var.G();
                return;
            default:
                d3 d3Var2 = this.f11202b;
                d3Var2.getClass();
                d3Var2.R = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f11203c, this.d);
                d3Var2.h();
                return;
        }
    }
}
