package defpackage;

import android.animation.ValueAnimator;
public final class tz9 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final n1a b;
    public final boolean c;

    public tz9(n1a n1aVar, boolean z, byte b) {
        this.a = b;
        this.b = n1aVar;
        this.c = z;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        boolean z = this.c;
        n1a n1aVar = this.b;
        switch (b) {
            case 0:
                k0a k0aVar = n1aVar.i0;
                a0a a0aVar = n1aVar.j0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!z) {
                    floatValue = 1.0f - floatValue;
                }
                float f = 1.0f - floatValue;
                k0aVar.setAlpha(f);
                k0aVar.setTranslationY(hl.L(8.0f) * floatValue);
                a0aVar.setAlpha(floatValue);
                a0aVar.setTranslationY(hl.L(8.0f) * f);
                n1aVar.k0.setAlpha(a0aVar.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!z) {
                    floatValue2 = 1.0f - floatValue2;
                }
                n1aVar.k0.setAlpha(n1aVar.j0.getAlpha() * floatValue2);
                return;
        }
    }
}
