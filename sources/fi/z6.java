package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class z6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12069a;
    public final float f12070b;
    public final float f12071c;
    public final float d;
    public final float e;
    public final Object f12072f;

    public z6(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f12069a = i10;
        this.f12072f = obj;
        this.f12070b = f7;
        this.f12071c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12069a) {
            case 0:
                p pVar = (p) this.f12072f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a7 a7Var = pVar.f10565a;
                float f7 = this.f12070b;
                float f10 = this.f12071c;
                a7Var.setScaleX(AndroidUtilities.lerp(f7, f10, floatValue));
                a7Var.setScaleY(AndroidUtilities.lerp(f7, f10, floatValue));
                a7Var.setTranslationX(this.d * floatValue);
                a7Var.setTranslationY(this.e * floatValue);
                float f11 = 1.0f - floatValue;
                a7Var.setAlpha(f11);
                pVar.f10571s = f11;
                pVar.invalidate();
                return;
            case 1:
                kg.k kVar = (kg.k) this.f12072f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = this.f12071c;
                float f13 = this.f12070b;
                kVar.f16639k = c3.h0.z(f12, f13, floatValue2, f13);
                float f14 = this.e;
                float f15 = this.d;
                kVar.f16640l = c3.h0.z(f14, f15, floatValue2, f15);
                kVar.f16632a.a(f12, f14, false);
                return;
            default:
                ug.e eVar = (ug.e) this.f12072f;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug.g gVar = ((ug.f) eVar.f49803b).f49804a;
                float f16 = this.f12071c;
                float f17 = this.f12070b;
                gVar.d = c3.h0.z(f16, f17, floatValue3, f17);
                float f18 = this.e;
                float f19 = this.d;
                gVar.f49819i = c3.h0.z(f18, f19, floatValue3, f19);
                return;
        }
    }
}
