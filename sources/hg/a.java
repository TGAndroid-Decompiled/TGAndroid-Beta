package hg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f10526a;
    public final b f10527b;
    public final g0 f10528c;

    public a(b bVar, g0 g0Var, int i9) {
        this.f10526a = i9;
        this.f10527b = bVar;
        this.f10528c = g0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10526a) {
            case 0:
                this.f10527b.f10536f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f10528c.invalidate();
                return;
            default:
                this.f10527b.f10536f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f10528c.invalidate();
                return;
        }
    }
}
