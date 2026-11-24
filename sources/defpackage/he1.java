package defpackage;

import android.animation.ValueAnimator;
public final class he1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ie1 b;

    public he1(ie1 ie1Var, byte b) {
        this.a = b;
        this.b = ie1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ie1 ie1Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ie1Var.n = floatValue;
                ie1Var.f.setTranslationX(floatValue * gl.L(16.0f));
                ie1Var.d.setAlpha(ie1Var.n);
                return;
            default:
                ie1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i = bkb.y6;
                wjb wjbVar = ie1Var.b;
                int f = bm2.f(ie1Var.F, bkb.v0(i, wjbVar), bkb.v0(bkb.m6, wjbVar));
                ie1Var.e.b(f);
                ie1Var.f.setTextColor(f);
                return;
        }
    }
}
