package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class m7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5602a;
    public final float f5603b;
    public final float f5604c;
    public final float d;
    public final float f5605e;
    public final Object f5606f;

    public m7(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f5602a = i10;
        this.f5606f = obj;
        this.f5603b = f7;
        this.f5604c = f10;
        this.d = f11;
        this.f5605e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5602a) {
            case 0:
                p pVar = (p) this.f5606f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n7 n7Var = pVar.f5680a;
                float f7 = this.f5603b;
                float f10 = this.f5604c;
                n7Var.setScaleX(AndroidUtilities.lerp(f7, f10, floatValue));
                n7Var.setScaleY(AndroidUtilities.lerp(f7, f10, floatValue));
                n7Var.setTranslationX(this.d * floatValue);
                n7Var.setTranslationY(this.f5605e * floatValue);
                float f11 = 1.0f - floatValue;
                n7Var.setAlpha(f11);
                pVar.f5687s = f11;
                pVar.invalidate();
                return;
            case 1:
                ig.j jVar = (ig.j) this.f5606f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = this.f5604c;
                float f13 = this.f5603b;
                jVar.f12216k = com.google.android.gms.internal.vision.e2.y(f12, f13, floatValue2, f13);
                float f14 = this.f5605e;
                float f15 = this.d;
                jVar.f12217l = com.google.android.gms.internal.vision.e2.y(f14, f15, floatValue2, f15);
                jVar.f12208a.a(f12, f14, false);
                return;
            default:
                sg.e eVar = (sg.e) this.f5606f;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.g gVar = ((sg.f) eVar.f48072b).f48073a;
                float f16 = this.f5604c;
                float f17 = this.f5603b;
                gVar.d = com.google.android.gms.internal.vision.e2.y(f16, f17, floatValue3, f17);
                float f18 = this.f5605e;
                float f19 = this.d;
                gVar.f48090i = com.google.android.gms.internal.vision.e2.y(f18, f19, floatValue3, f19);
                return;
        }
    }
}
