package di;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class o2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f6825a;
    public final n3 f6826b;
    public final int f6827c;
    public final int d;

    public o2(n3 n3Var, int i10, int i11, int i12) {
        this.f6825a = i12;
        this.f6826b = n3Var;
        this.f6827c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f6825a) {
            case 0:
                n3 n3Var = this.f6826b;
                Paint paint = n3Var.P;
                paint.setColor(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f6827c, this.d));
                n3Var.A();
                n3Var.e.invalidate();
                org.telegram.ui.e3 e3Var = n3Var.U0;
                if (e3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e3Var.b(z10, false);
                    n3Var.U0.setBackgroundColor(paint.getColor());
                }
                n3Var.F();
                return;
            default:
                n3 n3Var2 = this.f6826b;
                n3Var2.getClass();
                n3Var2.R = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f6827c, this.d);
                n3Var2.h();
                return;
        }
    }
}
