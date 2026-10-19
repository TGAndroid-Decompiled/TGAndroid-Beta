package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class c7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f8830a;
    public final float f8831b;
    public final float f8832c;
    public final float d;
    public final float e;
    public final Object f8833f;

    public c7(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f8830a = i10;
        this.f8833f = obj;
        this.f8831b = f7;
        this.f8832c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8830a) {
            case 0:
                p pVar = (p) this.f8833f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d7 d7Var = pVar.f8961a;
                float f7 = this.f8831b;
                float f10 = this.f8832c;
                d7Var.setScaleX(AndroidUtilities.lerp(f7, f10, floatValue));
                d7Var.setScaleY(AndroidUtilities.lerp(f7, f10, floatValue));
                d7Var.setTranslationX(this.d * floatValue);
                d7Var.setTranslationY(this.e * floatValue);
                float f11 = 1.0f - floatValue;
                d7Var.setAlpha(f11);
                pVar.f8967s = f11;
                pVar.invalidate();
                return;
            case 1:
                jg.j jVar = (jg.j) this.f8833f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = this.f8832c;
                float f13 = this.f8831b;
                jVar.f14502k = com.google.android.gms.internal.play_billing.k3.y(f12, f13, floatValue2, f13);
                float f14 = this.e;
                float f15 = this.d;
                jVar.f14503l = com.google.android.gms.internal.play_billing.k3.y(f14, f15, floatValue2, f15);
                jVar.f14495a.a(f12, f14, false);
                return;
            default:
                tg.e eVar = (tg.e) this.f8833f;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.g gVar = ((tg.f) eVar.f47055b).f47056a;
                float f16 = this.f8832c;
                float f17 = this.f8831b;
                gVar.d = com.google.android.gms.internal.play_billing.k3.y(f16, f17, floatValue3, f17);
                float f18 = this.e;
                float f19 = this.d;
                gVar.f47071i = com.google.android.gms.internal.play_billing.k3.y(f18, f19, floatValue3, f19);
                return;
        }
    }
}
