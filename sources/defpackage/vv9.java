package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class vv9 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final tx9 b;

    public vv9(tx9 tx9Var, byte b) {
        this.a = b;
        this.b = tx9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        tx9 tx9Var = this.b;
        switch (b) {
            case 0:
                tx9Var.getClass();
                tx9Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                tx9Var.l();
                return;
            case 2:
                View view = tx9Var.u0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = bkb.v(bkb.v0(bkb.F8, tx9Var.a1), bm2.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = tx9Var.n0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                d62 d62Var = tx9Var.o0;
                if (d62Var != null) {
                    d62Var.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                ow9 ow9Var = tx9Var.b0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tx9Var.setTranslationY((1.0f - floatValue) * gl.L(8.0f));
                View view3 = tx9Var.n0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                d62 d62Var2 = tx9Var.o0;
                if (d62Var2 != null) {
                    d62Var2.setAlpha(floatValue * floatValue);
                }
                ow9Var.setAlpha(floatValue);
                ow9Var.invalidate();
                tx9Var.invalidate();
                return;
        }
    }
}
