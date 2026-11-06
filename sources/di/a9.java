package di;

import android.animation.ValueAnimator;
public final class a9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f8824a;
    public final d9 f8825b;

    public a9(d9 d9Var, int i7) {
        this.f8824a = i7;
        this.f8825b = d9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8824a) {
            case 0:
                p9 p9Var = this.f8825b.f8950r0;
                p9Var.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9.i(p9Var);
                return;
            default:
                p9 p9Var2 = this.f8825b.f8950r0;
                p9Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9.i(p9Var2);
                return;
        }
    }
}
