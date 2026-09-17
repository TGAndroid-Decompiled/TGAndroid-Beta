package fi;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class l2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9803a;
    public final k3 f9804b;
    public final int f9805c;
    public final int d;

    public l2(k3 k3Var, int i10, int i11, int i12) {
        this.f9803a = i12;
        this.f9804b = k3Var;
        this.f9805c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f9803a) {
            case 0:
                k3 k3Var = this.f9804b;
                Paint paint = k3Var.P;
                paint.setColor(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f9805c, this.d));
                k3Var.A();
                k3Var.f9765e.invalidate();
                org.telegram.ui.d3 d3Var = k3Var.U0;
                if (d3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    d3Var.b(z10, false);
                    k3Var.U0.setBackgroundColor(paint.getColor());
                }
                k3Var.F();
                return;
            default:
                k3 k3Var2 = this.f9804b;
                k3Var2.getClass();
                k3Var2.R = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f9805c, this.d);
                k3Var2.h();
                return;
        }
    }
}
