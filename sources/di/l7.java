package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class l7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f7362a;
    public final float f7363b;
    public final float f7364c;
    public final float d;
    public final float e;
    public final Object f7365f;

    public l7(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f7362a = i10;
        this.f7365f = obj;
        this.f7363b = f7;
        this.f7364c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7362a) {
            case 0:
                p pVar = (p) this.f7365f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m7 m7Var = pVar.f7462a;
                float f7 = this.f7363b;
                float f10 = this.f7364c;
                m7Var.setScaleX(AndroidUtilities.lerp(f7, f10, floatValue));
                m7Var.setScaleY(AndroidUtilities.lerp(f7, f10, floatValue));
                m7Var.setTranslationX(this.d * floatValue);
                m7Var.setTranslationY(this.e * floatValue);
                float f11 = 1.0f - floatValue;
                m7Var.setAlpha(f11);
                pVar.f7468s = f11;
                pVar.invalidate();
                return;
            case 1:
                jg.j jVar = (jg.j) this.f7365f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = this.f7364c;
                float f13 = this.f7363b;
                jVar.f13090k = com.google.android.gms.internal.play_billing.k3.y(f12, f13, floatValue2, f13);
                float f14 = this.e;
                float f15 = this.d;
                jVar.f13091l = com.google.android.gms.internal.play_billing.k3.y(f14, f15, floatValue2, f15);
                jVar.f13083a.a(f12, f14, false);
                return;
            default:
                tg.e eVar = (tg.e) this.f7365f;
                eVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.g gVar = ((tg.f) eVar.f45692b).f45693a;
                float f16 = this.f7364c;
                float f17 = this.f7363b;
                gVar.d = com.google.android.gms.internal.play_billing.k3.y(f16, f17, floatValue3, f17);
                float f18 = this.e;
                float f19 = this.d;
                gVar.f45708i = com.google.android.gms.internal.play_billing.k3.y(f18, f19, floatValue3, f19);
                return;
        }
    }
}
