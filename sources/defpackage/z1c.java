package defpackage;

import android.animation.ValueAnimator;
public final class z1c implements ValueAnimator.AnimatorUpdateListener {
    public int a = 0;
    public final int b;
    public final d2c c;

    public z1c(d2c d2cVar, int i) {
        this.c = d2cVar;
        this.b = i;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.b);
        d2c d2cVar = this.c;
        d2cVar.O = true;
        d2cVar.n.scrollBy(0, floatValue - this.a);
        d2cVar.O = false;
        this.a = floatValue;
    }
}
