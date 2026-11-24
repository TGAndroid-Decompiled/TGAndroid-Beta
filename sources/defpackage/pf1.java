package defpackage;

import android.animation.ValueAnimator;
public final class pf1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final qf1 b;

    public pf1(qf1 qf1Var, byte b) {
        this.a = b;
        this.b = qf1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        qf1 qf1Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qf1Var.n = floatValue;
                qf1Var.f.setTranslationX(floatValue * gm.L(16.0f));
                qf1Var.d.setAlpha(qf1Var.n);
                return;
            default:
                qf1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i = cmb.y6;
                ylb ylbVar = qf1Var.b;
                int f = on2.f(qf1Var.F, cmb.v0(i, ylbVar), cmb.v0(cmb.m6, ylbVar));
                qf1Var.e.b(f);
                qf1Var.f.setTextColor(f);
                return;
        }
    }
}
