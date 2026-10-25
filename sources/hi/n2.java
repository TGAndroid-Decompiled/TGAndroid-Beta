package hi;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class n2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f13147a;
    public final m3 f13148b;
    public final int f13149c;
    public final int d;

    public n2(m3 m3Var, int i10, int i11, int i12) {
        this.f13147a = i12;
        this.f13148b = m3Var;
        this.f13149c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f13147a) {
            case 0:
                m3 m3Var = this.f13148b;
                Paint paint = m3Var.Q;
                paint.setColor(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f13149c, this.d));
                m3Var.B();
                m3Var.f13109f.invalidate();
                org.telegram.ui.c3 c3Var = m3Var.Y0;
                if (c3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c3Var.b(z10, false);
                    m3Var.Y0.setBackgroundColor(paint.getColor());
                }
                m3Var.G();
                return;
            default:
                m3 m3Var2 = this.f13148b;
                m3Var2.getClass();
                m3Var2.S = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f13149c, this.d);
                m3Var2.h();
                return;
        }
    }
}
