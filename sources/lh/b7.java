package lh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class b7 implements ValueAnimator.AnimatorUpdateListener {

    public final int f15685a;

    public final float f15686b;

    public final float f15687c;
    public final float d;

    public final float f15688e;

    public final Object f15689f;

    public b7(Object obj, float f10, float f11, float f12, float f13, int i10) {
        this.f15685a = i10;
        this.f15689f = obj;
        this.f15686b = f10;
        this.f15687c = f11;
        this.d = f12;
        this.f15688e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15685a) {
            case 0:
                q qVar = (q) this.f15689f;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c7 c7Var = qVar.f15860a;
                float f10 = this.f15686b;
                float f11 = this.f15687c;
                c7Var.setScaleX(AndroidUtilities.lerp(f10, f11, fFloatValue));
                c7Var.setScaleY(AndroidUtilities.lerp(f10, f11, fFloatValue));
                c7Var.setTranslationX(this.d * fFloatValue);
                c7Var.setTranslationY(this.f15688e * fFloatValue);
                float f12 = 1.0f - fFloatValue;
                c7Var.setAlpha(f12);
                qVar.f15867s = f12;
                qVar.invalidate();
                break;
            default:
                rf.j jVar = (rf.j) this.f15689f;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = this.f15687c;
                float f14 = this.f15686b;
                jVar.f47008k = com.google.android.recaptcha.internal.a.z(f13, f14, fFloatValue2, f14);
                float f15 = this.f15688e;
                float f16 = this.d;
                jVar.f47009l = com.google.android.recaptcha.internal.a.z(f15, f16, fFloatValue2, f16);
                jVar.f47000a.a(f13, f15, false);
                break;
        }
    }
}
