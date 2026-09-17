package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class o7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f7735a;
    public final float f7736b;
    public final float f7737c;
    public final float d;
    public final float f7738e;
    public final Object f7739f;

    public o7(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f7735a = i10;
        this.f7739f = obj;
        this.f7736b = f7;
        this.f7737c = f10;
        this.d = f11;
        this.f7738e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7735a) {
            case 0:
                p pVar = (p) this.f7739f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7 p7Var = pVar.f8002a;
                float f7 = this.f7736b;
                float f10 = this.f7737c;
                p7Var.setScaleX(AndroidUtilities.lerp(f7, f10, floatValue));
                p7Var.setScaleY(AndroidUtilities.lerp(f7, f10, floatValue));
                p7Var.setTranslationX(this.d * floatValue);
                p7Var.setTranslationY(this.f7738e * floatValue);
                float f11 = 1.0f - floatValue;
                p7Var.setAlpha(f11);
                pVar.f8009s = f11;
                pVar.invalidate();
                return;
            default:
                jg.j jVar = (jg.j) this.f7739f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = this.f7737c;
                float f13 = this.f7736b;
                jVar.f13714k = com.google.android.gms.internal.vision.e2.z(f12, f13, floatValue2, f13);
                float f14 = this.f7738e;
                float f15 = this.d;
                jVar.f13715l = com.google.android.gms.internal.vision.e2.z(f14, f15, floatValue2, f15);
                jVar.f13706a.a(f12, f14, false);
                return;
        }
    }
}
