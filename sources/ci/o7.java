package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class o7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5138a;
    public final float f5139b;
    public final float f5140c;
    public final float d;
    public final float e;
    public final Object f5141f;

    public o7(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f5138a = i10;
        this.f5141f = obj;
        this.f5139b = f7;
        this.f5140c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5138a) {
            case 0:
                p pVar = (p) this.f5141f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7 p7Var = pVar.f5349a;
                float f7 = this.f5139b;
                float f10 = this.f5140c;
                p7Var.setScaleX(AndroidUtilities.lerp(f7, f10, floatValue));
                p7Var.setScaleY(AndroidUtilities.lerp(f7, f10, floatValue));
                p7Var.setTranslationX(this.d * floatValue);
                p7Var.setTranslationY(this.e * floatValue);
                float f11 = 1.0f - floatValue;
                p7Var.setAlpha(f11);
                pVar.f5355s = f11;
                pVar.invalidate();
                return;
            default:
                ig.j jVar = (ig.j) this.f5141f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = this.f5140c;
                float f13 = this.f5139b;
                jVar.f11187k = com.google.android.gms.internal.vision.e2.z(f12, f13, floatValue2, f13);
                float f14 = this.e;
                float f15 = this.d;
                jVar.f11188l = com.google.android.gms.internal.vision.e2.z(f14, f15, floatValue2, f15);
                jVar.f11180a.a(f12, f14, false);
                return;
        }
    }
}
