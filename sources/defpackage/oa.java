package defpackage;

import android.animation.ValueAnimator;
public final class oa implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final pa b;
    public final u43 c;

    public oa(pa paVar, u43 u43Var, byte b) {
        this.a = b;
        this.b = paVar;
        this.c = u43Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        u43 u43Var = this.c;
        pa paVar = this.b;
        switch (b) {
            case 0:
                paVar.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u43Var.invalidate();
                return;
            default:
                paVar.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u43Var.invalidate();
                return;
        }
    }
}
