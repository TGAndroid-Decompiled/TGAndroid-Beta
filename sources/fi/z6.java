package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class z6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12070a;
    public final float f12071b;
    public final float f12072c;
    public final float d;
    public final float e;
    public final Object f12073f;

    public z6(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f12070a = i10;
        this.f12073f = obj;
        this.f12071b = f7;
        this.f12072c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12070a) {
            case 0:
                p pVar = (p) this.f12073f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a7 a7Var = pVar.f10566a;
                float f7 = this.f12071b;
                float f10 = this.f12072c;
                a7Var.setScaleX(AndroidUtilities.lerp(f7, f10, floatValue));
                a7Var.setScaleY(AndroidUtilities.lerp(f7, f10, floatValue));
                a7Var.setTranslationX(this.d * floatValue);
                a7Var.setTranslationY(this.e * floatValue);
                float f11 = 1.0f - floatValue;
                a7Var.setAlpha(f11);
                pVar.f10572s = f11;
                pVar.invalidate();
                return;
            case 1:
                kg.k kVar = (kg.k) this.f12073f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = this.f12072c;
                float f13 = this.f12071b;
                kVar.f16640k = c3.h0.z(f12, f13, floatValue2, f13);
                float f14 = this.e;
                float f15 = this.d;
                kVar.f16641l = c3.h0.z(f14, f15, floatValue2, f15);
                kVar.f16633a.a(f12, f14, false);
                return;
            default:
                ug.e eVar = (ug.e) this.f12073f;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug.g gVar = ((ug.f) eVar.f49768b).f49769a;
                float f16 = this.f12072c;
                float f17 = this.f12071b;
                gVar.d = c3.h0.z(f16, f17, floatValue3, f17);
                float f18 = this.e;
                float f19 = this.d;
                gVar.f49784i = c3.h0.z(f18, f19, floatValue3, f19);
                return;
        }
    }
}
