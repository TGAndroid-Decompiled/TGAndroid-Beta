package defpackage;

import android.animation.ValueAnimator;
public final class rc5 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final tc5 b;

    public rc5(tc5 tc5Var, byte b) {
        this.a = b;
        this.b = tc5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        tu1 tu1Var;
        fu fuVar;
        byte b = this.a;
        tc5 tc5Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tc5Var.x = floatValue;
                tc5Var.e.setTranslationY(floatValue * gl.L(48.0f));
                tc5Var.e.setPadding(0, 0, 0, (int) (tc5Var.x * gl.L(48.0f)));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tc5Var.F = floatValue2;
                tc5Var.n.setScaleX(gl.R1(0.95f, 1.0f, floatValue2));
                tc5Var.n.setScaleY(gl.R1(0.95f, 1.0f, tc5Var.F));
                wq1 wq1Var = tc5Var.f;
                if (wq1Var != null && (tu1Var = wq1Var.a) != null && (fuVar = tu1Var.a4) != null) {
                    fuVar.setScaleX(gl.R1(1.0f, 0.95f, tc5Var.F));
                    tc5Var.f.a.a4.setScaleY(gl.R1(1.0f, 0.95f, tc5Var.F));
                }
                tc5Var.h.setAlpha(tc5Var.F);
                return;
        }
    }
}
