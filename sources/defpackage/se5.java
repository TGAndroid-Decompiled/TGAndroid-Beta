package defpackage;

import android.animation.ValueAnimator;
public final class se5 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ue5 b;

    public se5(ue5 ue5Var, byte b) {
        this.a = b;
        this.b = ue5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        gv1 gv1Var;
        gu guVar;
        byte b = this.a;
        ue5 ue5Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ue5Var.x = floatValue;
                ue5Var.e.setTranslationY(floatValue * hl.L(48.0f));
                ue5Var.e.setPadding(0, 0, 0, (int) (ue5Var.x * hl.L(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ue5Var.F = floatValue2;
                ue5Var.n.setScaleX(hl.R1(0.95f, 1.0f, floatValue2));
                ue5Var.n.setScaleY(hl.R1(0.95f, 1.0f, ue5Var.F));
                jr1 jr1Var = ue5Var.f;
                if (jr1Var != null && (gv1Var = jr1Var.a) != null && (guVar = gv1Var.a4) != null) {
                    guVar.setScaleX(hl.R1(1.0f, 0.95f, ue5Var.F));
                    ue5Var.f.a.a4.setScaleY(hl.R1(1.0f, 0.95f, ue5Var.F));
                }
                ue5Var.h.setAlpha(ue5Var.F);
                return;
        }
    }
}
