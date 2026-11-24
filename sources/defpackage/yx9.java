package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class yx9 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final vz9 b;

    public yx9(vz9 vz9Var, byte b) {
        this.a = b;
        this.b = vz9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        vz9 vz9Var = this.b;
        switch (b) {
            case 0:
                vz9Var.getClass();
                vz9Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                vz9Var.l();
                return;
            case 2:
                View view = vz9Var.u0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = cmb.v(cmb.v0(cmb.F8, vz9Var.a1), on2.p(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = vz9Var.n0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                o72 o72Var = vz9Var.o0;
                if (o72Var != null) {
                    o72Var.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                qy9 qy9Var = vz9Var.b0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vz9Var.setTranslationY((1.0f - floatValue) * gm.L(8.0f));
                View view3 = vz9Var.n0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                o72 o72Var2 = vz9Var.o0;
                if (o72Var2 != null) {
                    o72Var2.setAlpha(floatValue * floatValue);
                }
                qy9Var.setAlpha(floatValue);
                qy9Var.invalidate();
                vz9Var.invalidate();
                return;
        }
    }
}
