package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class m7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5571a;
    public final float f5572b;
    public final float f5573c;
    public final float d;
    public final float f5574e;
    public final Object f5575f;

    public m7(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f5571a = i10;
        this.f5575f = obj;
        this.f5572b = f7;
        this.f5573c = f10;
        this.d = f11;
        this.f5574e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5571a) {
            case 0:
                p pVar = (p) this.f5575f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n7 n7Var = pVar.f5655a;
                float f7 = this.f5572b;
                float f10 = this.f5573c;
                n7Var.setScaleX(AndroidUtilities.lerp(f7, f10, floatValue));
                n7Var.setScaleY(AndroidUtilities.lerp(f7, f10, floatValue));
                n7Var.setTranslationX(this.d * floatValue);
                n7Var.setTranslationY(this.f5574e * floatValue);
                float f11 = 1.0f - floatValue;
                n7Var.setAlpha(f11);
                pVar.f5662s = f11;
                pVar.invalidate();
                return;
            default:
                ig.j jVar = (ig.j) this.f5575f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = this.f5573c;
                float f13 = this.f5572b;
                jVar.f12168k = com.google.android.gms.internal.vision.e2.z(f12, f13, floatValue2, f13);
                float f14 = this.f5574e;
                float f15 = this.d;
                jVar.f12169l = com.google.android.gms.internal.vision.e2.z(f14, f15, floatValue2, f15);
                jVar.f12160a.a(f12, f14, false);
                return;
        }
    }
}
