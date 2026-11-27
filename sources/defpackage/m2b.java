package defpackage;

import android.animation.ValueAnimator;
public final class m2b implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final p2b b;

    public m2b(p2b p2bVar, byte b) {
        this.a = b;
        this.b = p2bVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        p2b p2bVar = this.b;
        switch (b) {
            case 0:
                p2bVar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2bVar.invalidate();
                return;
            case 1:
                p2bVar.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                p2bVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2bVar.invalidate();
                return;
        }
    }
}
