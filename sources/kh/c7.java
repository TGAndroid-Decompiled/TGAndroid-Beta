package kh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class c7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15040a;
    public final float f15041b;
    public final float f15042c;
    public final float d;
    public final float f15043e;
    public final Object f15044f;

    public c7(Object obj, float f10, float f11, float f12, float f13, int i9) {
        this.f15040a = i9;
        this.f15044f = obj;
        this.f15041b = f10;
        this.f15042c = f11;
        this.d = f12;
        this.f15043e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15040a) {
            case 0:
                q qVar = (q) this.f15044f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d7 d7Var = qVar.f15153a;
                float f10 = this.f15041b;
                float f11 = this.f15042c;
                d7Var.setScaleX(AndroidUtilities.lerp(f10, f11, floatValue));
                d7Var.setScaleY(AndroidUtilities.lerp(f10, f11, floatValue));
                d7Var.setTranslationX(this.d * floatValue);
                d7Var.setTranslationY(this.f15043e * floatValue);
                float f12 = 1.0f - floatValue;
                d7Var.setAlpha(f12);
                qVar.f15160s = f12;
                qVar.invalidate();
                return;
            default:
                qf.j jVar = (qf.j) this.f15044f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = this.f15042c;
                float f14 = this.f15041b;
                jVar.f46249k = e2.c.z(f13, f14, floatValue2, f14);
                float f15 = this.f15043e;
                float f16 = this.d;
                jVar.f46250l = e2.c.z(f15, f16, floatValue2, f16);
                jVar.f46241a.a(f13, f15, false);
                return;
        }
    }
}
