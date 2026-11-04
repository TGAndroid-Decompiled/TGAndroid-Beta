package gi;

import android.animation.ValueAnimator;
public final class k6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f13035a;
    public final float f13036b;
    public final float f13037c;
    public final float d;
    public final float f13038e;
    public final Object f13039f;

    public k6(Object obj, float f10, float f11, float f12, float f13, int i3) {
        this.f13035a = i3;
        this.f13039f = obj;
        this.f13036b = f10;
        this.f13037c = f11;
        this.d = f12;
        this.f13038e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13035a) {
            case 0:
                p pVar = (p) this.f13039f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6 l6Var = pVar.f13243a;
                float f10 = this.f13036b;
                float f11 = this.f13037c;
                l6Var.setScaleX(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                l6Var.setScaleY(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                l6Var.setTranslationX(this.d * floatValue);
                l6Var.setTranslationY(this.f13038e * floatValue);
                float f12 = 1.0f - floatValue;
                l6Var.setAlpha(f12);
                pVar.f13250s = f12;
                pVar.invalidate();
                return;
            case 1:
                mg.j jVar = (mg.j) this.f13039f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = this.f13037c;
                float f14 = this.f13036b;
                jVar.f19385k = com.google.android.recaptcha.internal.a.y(f13, f14, floatValue2, f14);
                float f15 = this.f13038e;
                float f16 = this.d;
                jVar.f19386l = com.google.android.recaptcha.internal.a.y(f15, f16, floatValue2, f16);
                jVar.f19377a.a(f13, f15, false);
                return;
            default:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) this.f13039f;
                x9Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wg.f fVar = ((wg.e) x9Var.f30971b).f57617a;
                float f17 = this.f13037c;
                float f18 = this.f13036b;
                fVar.d = com.google.android.recaptcha.internal.a.y(f17, f18, floatValue3, f18);
                float f19 = this.f13038e;
                float f20 = this.d;
                fVar.f57634i = com.google.android.recaptcha.internal.a.y(f19, f20, floatValue3, f20);
                return;
        }
    }
}
