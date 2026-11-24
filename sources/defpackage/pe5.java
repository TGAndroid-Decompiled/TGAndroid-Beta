package defpackage;

import android.animation.ValueAnimator;
public final class pe5 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final re5 b;

    public pe5(re5 re5Var, byte b) {
        this.a = b;
        this.b = re5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        fw1 fw1Var;
        fv fvVar;
        byte b = this.a;
        re5 re5Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                re5Var.x = floatValue;
                re5Var.e.setTranslationY(floatValue * gm.L(48.0f));
                re5Var.e.setPadding(0, 0, 0, (int) (re5Var.x * gm.L(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                re5Var.F = floatValue2;
                re5Var.n.setScaleX(gm.R1(0.95f, 1.0f, floatValue2));
                re5Var.n.setScaleY(gm.R1(0.95f, 1.0f, re5Var.F));
                is1 is1Var = re5Var.f;
                if (is1Var != null && (fw1Var = is1Var.a) != null && (fvVar = fw1Var.a4) != null) {
                    fvVar.setScaleX(gm.R1(1.0f, 0.95f, re5Var.F));
                    re5Var.f.a.a4.setScaleY(gm.R1(1.0f, 0.95f, re5Var.F));
                }
                re5Var.h.setAlpha(re5Var.F);
                return;
        }
    }
}
