package defpackage;

import android.animation.ValueAnimator;
public final class oa implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final pa b;
    public final f63 c;

    public oa(pa paVar, f63 f63Var, byte b) {
        this.a = b;
        this.b = paVar;
        this.c = f63Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        f63 f63Var = this.c;
        pa paVar = this.b;
        switch (b) {
            case 0:
                paVar.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f63Var.invalidate();
                return;
            default:
                paVar.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f63Var.invalidate();
                return;
        }
    }
}
