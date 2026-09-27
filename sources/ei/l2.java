package ei;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class l2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f8456a;
    public final k3 f8457b;
    public final int f8458c;
    public final int d;

    public l2(k3 k3Var, int i10, int i11, int i12) {
        this.f8456a = i12;
        this.f8457b = k3Var;
        this.f8458c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f8456a) {
            case 0:
                k3 k3Var = this.f8457b;
                Paint paint = k3Var.P;
                paint.setColor(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f8458c, this.d));
                k3Var.A();
                k3Var.e.invalidate();
                org.telegram.ui.e3 e3Var = k3Var.U0;
                if (e3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e3Var.b(z10, false);
                    k3Var.U0.setBackgroundColor(paint.getColor());
                }
                k3Var.F();
                return;
            default:
                k3 k3Var2 = this.f8457b;
                k3Var2.getClass();
                k3Var2.R = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f8458c, this.d);
                k3Var2.h();
                return;
        }
    }
}
