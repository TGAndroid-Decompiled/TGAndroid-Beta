package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class m7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5600a;
    public final float f5601b;
    public final float f5602c;
    public final float d;
    public final float f5603e;
    public final Object f5604f;

    public m7(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f5600a = i10;
        this.f5604f = obj;
        this.f5601b = f7;
        this.f5602c = f10;
        this.d = f11;
        this.f5603e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5600a) {
            case 0:
                p pVar = (p) this.f5604f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n7 n7Var = pVar.f5678a;
                float f7 = this.f5601b;
                float f10 = this.f5602c;
                n7Var.setScaleX(AndroidUtilities.lerp(f7, f10, floatValue));
                n7Var.setScaleY(AndroidUtilities.lerp(f7, f10, floatValue));
                n7Var.setTranslationX(this.d * floatValue);
                n7Var.setTranslationY(this.f5603e * floatValue);
                float f11 = 1.0f - floatValue;
                n7Var.setAlpha(f11);
                pVar.f5685s = f11;
                pVar.invalidate();
                return;
            case 1:
                ig.j jVar = (ig.j) this.f5604f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = this.f5602c;
                float f13 = this.f5601b;
                jVar.f12214k = com.google.android.gms.internal.vision.e2.y(f12, f13, floatValue2, f13);
                float f14 = this.f5603e;
                float f15 = this.d;
                jVar.f12215l = com.google.android.gms.internal.vision.e2.y(f14, f15, floatValue2, f15);
                jVar.f12206a.a(f12, f14, false);
                return;
            default:
                sg.e eVar = (sg.e) this.f5604f;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.g gVar = ((sg.f) eVar.f48259b).f48260a;
                float f16 = this.f5602c;
                float f17 = this.f5601b;
                gVar.d = com.google.android.gms.internal.vision.e2.y(f16, f17, floatValue3, f17);
                float f18 = this.f5603e;
                float f19 = this.d;
                gVar.f48277i = com.google.android.gms.internal.vision.e2.y(f18, f19, floatValue3, f19);
                return;
        }
    }
}
