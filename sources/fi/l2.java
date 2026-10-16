package fi;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class l2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9395a;
    public final k3 f9396b;
    public final int f9397c;
    public final int d;

    public l2(k3 k3Var, int i10, int i11, int i12) {
        this.f9395a = i12;
        this.f9396b = k3Var;
        this.f9397c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f9395a) {
            case 0:
                k3 k3Var = this.f9396b;
                Paint paint = k3Var.P;
                paint.setColor(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f9397c, this.d));
                k3Var.B();
                k3Var.e.invalidate();
                org.telegram.ui.f3 f3Var = k3Var.U0;
                if (f3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    f3Var.b(z10, false);
                    k3Var.U0.setBackgroundColor(paint.getColor());
                }
                k3Var.G();
                return;
            default:
                k3 k3Var2 = this.f9396b;
                k3Var2.getClass();
                k3Var2.R = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f9397c, this.d);
                k3Var2.h();
                return;
        }
    }
}
