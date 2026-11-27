package defpackage;

import android.animation.ValueAnimator;
public final class y5c implements ValueAnimator.AnimatorUpdateListener {
    public int a = 0;
    public final int b;
    public final d6c c;

    public y5c(d6c d6cVar, int i) {
        this.c = d6cVar;
        this.b = i;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.b);
        d6c d6cVar = this.c;
        d6cVar.O = true;
        d6cVar.n.scrollBy(0, floatValue - this.a);
        d6cVar.O = false;
        this.a = floatValue;
    }
}
