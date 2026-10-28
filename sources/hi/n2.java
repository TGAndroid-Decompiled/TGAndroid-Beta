package hi;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class n2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f13146a;
    public final m3 f13147b;
    public final int f13148c;
    public final int d;

    public n2(m3 m3Var, int i10, int i11, int i12) {
        this.f13146a = i12;
        this.f13147b = m3Var;
        this.f13148c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f13146a) {
            case 0:
                m3 m3Var = this.f13147b;
                Paint paint = m3Var.Q;
                paint.setColor(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f13148c, this.d));
                m3Var.B();
                m3Var.f13108f.invalidate();
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
                m3 m3Var2 = this.f13147b;
                m3Var2.getClass();
                m3Var2.S = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f13148c, this.d);
                m3Var2.h();
                return;
        }
    }
}
