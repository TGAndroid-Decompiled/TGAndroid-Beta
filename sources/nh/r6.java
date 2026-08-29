package nh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class r6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18522a;
    public final float f18523b;
    public final float f18524c;
    public final float d;
    public final float f18525e;
    public final Object f18526f;

    public r6(Object obj, float f9, float f10, float f11, float f12, int i10) {
        this.f18522a = i10;
        this.f18526f = obj;
        this.f18523b = f9;
        this.f18524c = f10;
        this.d = f11;
        this.f18525e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18522a) {
            case 0:
                p pVar = (p) this.f18526f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s6 s6Var = pVar.f18672a;
                float f9 = this.f18523b;
                float f10 = this.f18524c;
                s6Var.setScaleX(AndroidUtilities.lerp(f9, f10, floatValue));
                s6Var.setScaleY(AndroidUtilities.lerp(f9, f10, floatValue));
                s6Var.setTranslationX(this.d * floatValue);
                s6Var.setTranslationY(this.f18525e * floatValue);
                float f11 = 1.0f - floatValue;
                s6Var.setAlpha(f11);
                pVar.f18679s = f11;
                pVar.invalidate();
                return;
            default:
                tf.j jVar = (tf.j) this.f18526f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = this.f18524c;
                float f13 = this.f18523b;
                jVar.f48308k = com.google.android.recaptcha.internal.a.z(f12, f13, floatValue2, f13);
                float f14 = this.f18525e;
                float f15 = this.d;
                jVar.f48309l = com.google.android.recaptcha.internal.a.z(f14, f15, floatValue2, f15);
                jVar.f48300a.a(f12, f14, false);
                return;
        }
    }
}
