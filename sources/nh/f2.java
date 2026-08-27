package nh;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

public final class f2 implements ValueAnimator.AnimatorUpdateListener {

    public final int f18677a;

    public final b3 f18678b;

    public final int f18679c;
    public final int d;

    public f2(b3 b3Var, int i10, int i11, int i12) {
        this.f18677a = i12;
        this.f18678b = b3Var;
        this.f18679c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18677a) {
            case 0:
                b3 b3Var = this.f18678b;
                Paint paint = b3Var.L;
                paint.setColor(i0.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f18679c, this.d));
                b3Var.A();
                b3Var.f18575e.invalidate();
                org.telegram.ui.h3 h3Var = b3Var.Q0;
                if (h3Var != null) {
                    h3Var.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
                    b3Var.Q0.setBackgroundColor(paint.getColor());
                }
                b3Var.F();
                break;
            default:
                b3 b3Var2 = this.f18678b;
                b3Var2.getClass();
                b3Var2.N = i0.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f18679c, this.d);
                b3Var2.h();
                break;
        }
    }
}
