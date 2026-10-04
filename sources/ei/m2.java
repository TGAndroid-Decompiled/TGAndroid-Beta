package ei;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class m2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9198a;
    public final l3 f9199b;
    public final int f9200c;
    public final int d;

    public m2(l3 l3Var, int i10, int i11, int i12) {
        this.f9198a = i12;
        this.f9199b = l3Var;
        this.f9200c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f9198a) {
            case 0:
                l3 l3Var = this.f9199b;
                Paint paint = l3Var.P;
                paint.setColor(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f9200c, this.d));
                l3Var.A();
                l3Var.f9157e.invalidate();
                org.telegram.ui.d3 d3Var = l3Var.U0;
                if (d3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    d3Var.b(z10, false);
                    l3Var.U0.setBackgroundColor(paint.getColor());
                }
                l3Var.F();
                return;
            default:
                l3 l3Var2 = this.f9199b;
                l3Var2.getClass();
                l3Var2.R = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f9200c, this.d);
                l3Var2.h();
                return;
        }
    }
}
