package defpackage;

import android.animation.ValueAnimator;
public final class zf4 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final gg4 b;

    public zf4(gg4 gg4Var, byte b) {
        this.a = b;
        this.b = gg4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        gg4 gg4Var = this.b;
        switch (b) {
            case 0:
                gg4Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gg4Var.invalidate();
                return;
            default:
                gg4Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gg4Var.invalidate();
                return;
        }
    }
}
