package defpackage;

import android.animation.ValueAnimator;
public final class fzb implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final hzb b;

    public fzb(hzb hzbVar, byte b) {
        this.a = b;
        this.b = hzbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        hzb hzbVar = this.b;
        switch (b) {
            case 0:
                yc ycVar = hzbVar.f;
                ycVar.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                ycVar.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                ycVar.invalidate();
                return;
            default:
                hzbVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hzbVar.h();
                return;
        }
    }
}
