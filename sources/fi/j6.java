package fi;

import android.animation.ValueAnimator;
public final class j6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12236a;
    public final float f12237b;
    public final float f12238c;
    public final float d;
    public final float f12239e;
    public final Object f12240f;

    public j6(Object obj, float f10, float f11, float f12, float f13, int i7) {
        this.f12236a = i7;
        this.f12240f = obj;
        this.f12237b = f10;
        this.f12238c = f11;
        this.d = f12;
        this.f12239e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12236a) {
            case 0:
                p pVar = (p) this.f12240f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k6 k6Var = pVar.f12328a;
                float f10 = this.f12237b;
                float f11 = this.f12238c;
                k6Var.setScaleX(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                k6Var.setScaleY(org.telegram.messenger.g0.T1(f10, f11, floatValue));
                k6Var.setTranslationX(this.d * floatValue);
                k6Var.setTranslationY(this.f12239e * floatValue);
                float f12 = 1.0f - floatValue;
                k6Var.setAlpha(f12);
                pVar.f12335s = f12;
                pVar.invalidate();
                return;
            case 1:
                lg.j jVar = (lg.j) this.f12240f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = this.f12238c;
                float f14 = this.f12237b;
                jVar.f18349k = com.google.android.recaptcha.internal.a.z(f13, f14, floatValue2, f14);
                float f15 = this.f12239e;
                float f16 = this.d;
                jVar.f18350l = com.google.android.recaptcha.internal.a.z(f15, f16, floatValue2, f16);
                jVar.f18341a.a(f13, f15, false);
                return;
            default:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) this.f12240f;
                x9Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = ((vg.e) x9Var.f30927b).f57371a;
                float f17 = this.f12238c;
                float f18 = this.f12237b;
                fVar.d = com.google.android.recaptcha.internal.a.z(f17, f18, floatValue3, f18);
                float f19 = this.f12239e;
                float f20 = this.d;
                fVar.f57388i = com.google.android.recaptcha.internal.a.z(f19, f20, floatValue3, f20);
                return;
        }
    }
}
