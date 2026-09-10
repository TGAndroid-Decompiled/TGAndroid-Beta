package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class p8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3399a;
    public final float f3400b;
    public final float f3401c;
    public final float d;
    public final float e;
    public final Object f3402f;

    public p8(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f3399a = i10;
        this.f3402f = obj;
        this.f3400b = f7;
        this.f3401c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3399a) {
            case 0:
                t tVar = (t) this.f3402f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8 q8Var = tVar.f3549a;
                float f7 = this.f3400b;
                float f10 = this.f3401c;
                q8Var.setScaleX(AndroidUtilities.lerp(f7, f10, floatValue));
                q8Var.setScaleY(AndroidUtilities.lerp(f7, f10, floatValue));
                q8Var.setTranslationX(this.d * floatValue);
                q8Var.setTranslationY(this.e * floatValue);
                float f11 = 1.0f - floatValue;
                q8Var.setAlpha(f11);
                tVar.f3555s = f11;
                tVar.invalidate();
                return;
            default:
                hg.j jVar = (hg.j) this.f3402f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = this.f3401c;
                float f13 = this.f3400b;
                jVar.f9404k = com.google.android.gms.internal.vision.e2.z(f12, f13, floatValue2, f13);
                float f14 = this.e;
                float f15 = this.d;
                jVar.f9405l = com.google.android.gms.internal.vision.e2.z(f14, f15, floatValue2, f15);
                jVar.f9397a.a(f12, f14, false);
                return;
        }
    }
}
