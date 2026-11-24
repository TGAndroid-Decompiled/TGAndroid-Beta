package defpackage;

import android.animation.ValueAnimator;
public final class z3c implements ValueAnimator.AnimatorUpdateListener {
    public int a = 0;
    public final int b;
    public final d4c c;

    public z3c(d4c d4cVar, int i) {
        this.c = d4cVar;
        this.b = i;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.b);
        d4c d4cVar = this.c;
        d4cVar.O = true;
        d4cVar.n.scrollBy(0, floatValue - this.a);
        d4cVar.O = false;
        this.a = floatValue;
    }
}
