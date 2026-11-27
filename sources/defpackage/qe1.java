package defpackage;

import android.animation.ValueAnimator;
public final class qe1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final re1 b;

    public qe1(re1 re1Var, byte b) {
        this.a = b;
        this.b = re1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        re1 re1Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                re1Var.n = floatValue;
                re1Var.f.setTranslationX(floatValue * hl.L(16.0f));
                re1Var.d.setAlpha(re1Var.n);
                return;
            default:
                re1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i = aob.z6;
                vnb vnbVar = re1Var.b;
                int f = vm2.f(re1Var.F, aob.v0(i, vnbVar), aob.v0(aob.n6, vnbVar));
                re1Var.e.b(f);
                re1Var.f.setTextColor(f);
                return;
        }
    }
}
