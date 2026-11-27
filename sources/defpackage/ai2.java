package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
public final class ai2 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public ai2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei2 ei2Var = (ei2) obj2;
                ci2 ci2Var = (ci2) obj;
                ei2.b(floatValue, ci2Var);
                ei2Var.a(floatValue, ci2Var, false);
                ei2Var.invalidateSelf();
                return;
            case 1:
                v3b v3bVar = (v3b) obj2;
                v3bVar.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3bVar.invalidate();
                ((xu9) obj).invalidate();
                return;
            default:
                ((vic) obj2).G((View) obj, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
