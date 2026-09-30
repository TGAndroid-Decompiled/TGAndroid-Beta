package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class m7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5180a;
    public final float f5181b;
    public final float f5182c;
    public final float d;
    public final float e;
    public final Object f5183f;

    public m7(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f5180a = i10;
        this.f5183f = obj;
        this.f5181b = f7;
        this.f5182c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5180a) {
            case 0:
                p pVar = (p) this.f5183f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n7 n7Var = pVar.f5250a;
                float f7 = this.f5181b;
                float f10 = this.f5182c;
                n7Var.setScaleX(AndroidUtilities.lerp(f7, f10, floatValue));
                n7Var.setScaleY(AndroidUtilities.lerp(f7, f10, floatValue));
                n7Var.setTranslationX(this.d * floatValue);
                n7Var.setTranslationY(this.e * floatValue);
                float f11 = 1.0f - floatValue;
                n7Var.setAlpha(f11);
                pVar.f5256s = f11;
                pVar.invalidate();
                return;
            default:
                ig.j jVar = (ig.j) this.f5183f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = this.f5182c;
                float f13 = this.f5181b;
                jVar.f11188k = com.google.android.gms.internal.vision.e2.z(f12, f13, floatValue2, f13);
                float f14 = this.e;
                float f15 = this.d;
                jVar.f11189l = com.google.android.gms.internal.vision.e2.z(f14, f15, floatValue2, f15);
                jVar.f11181a.a(f12, f14, false);
                return;
        }
    }
}
