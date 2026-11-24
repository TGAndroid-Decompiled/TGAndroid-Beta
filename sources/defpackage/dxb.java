package defpackage;

import android.animation.ValueAnimator;
public final class dxb implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final fxb b;

    public dxb(fxb fxbVar, byte b) {
        this.a = b;
        this.b = fxbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        fxb fxbVar = this.b;
        switch (b) {
            case 0:
                rj4 rj4Var = fxbVar.f;
                rj4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                rj4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                rj4Var.invalidate();
                return;
            default:
                fxbVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fxbVar.h();
                return;
        }
    }
}
