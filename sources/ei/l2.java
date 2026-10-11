package ei;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class l2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9200a;
    public final k3 f9201b;
    public final int f9202c;
    public final int d;

    public l2(k3 k3Var, int i10, int i11, int i12) {
        this.f9200a = i12;
        this.f9201b = k3Var;
        this.f9202c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f9200a) {
            case 0:
                k3 k3Var = this.f9201b;
                Paint paint = k3Var.P;
                paint.setColor(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f9202c, this.d));
                k3Var.B();
                k3Var.f9158e.invalidate();
                org.telegram.ui.c3 c3Var = k3Var.U0;
                if (c3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c3Var.b(z10, false);
                    k3Var.U0.setBackgroundColor(paint.getColor());
                }
                k3Var.G();
                return;
            default:
                k3 k3Var2 = this.f9201b;
                k3Var2.getClass();
                k3Var2.R = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f9202c, this.d);
                k3Var2.h();
                return;
        }
    }
}
