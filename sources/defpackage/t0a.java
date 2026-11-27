package defpackage;

import android.animation.ValueAnimator;
public final class t0a implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final w0a b;

    public t0a(w0a w0aVar, byte b) {
        this.a = b;
        this.b = w0aVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        w0a w0aVar = this.b;
        switch (b) {
            case 0:
                w0aVar.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w0aVar.W.i0.invalidate();
                return;
            case 1:
                w0aVar.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w0aVar.W.i0.invalidate();
                return;
            default:
                w0aVar.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w0aVar.W.i0.invalidate();
                return;
        }
    }
}
