package mh;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f17829a;
    public final c3 f17830b;
    public final int f17831c;
    public final int d;

    public f2(c3 c3Var, int i9, int i10, int i11) {
        this.f17829a = i11;
        this.f17830b = c3Var;
        this.f17831c = i9;
        this.d = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f17829a) {
            case 0:
                c3 c3Var = this.f17830b;
                Paint paint = c3Var.L;
                paint.setColor(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f17831c, this.d));
                c3Var.A();
                c3Var.f17754e.invalidate();
                org.telegram.ui.g3 g3Var = c3Var.Q0;
                if (g3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    g3Var.b(z10, false);
                    c3Var.Q0.setBackgroundColor(paint.getColor());
                }
                c3Var.F();
                return;
            default:
                c3 c3Var2 = this.f17830b;
                c3Var2.getClass();
                c3Var2.N = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f17831c, this.d);
                c3Var2.h();
                return;
        }
    }
}
