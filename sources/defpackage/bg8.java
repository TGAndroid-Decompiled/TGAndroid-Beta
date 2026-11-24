package defpackage;

import android.animation.ValueAnimator;
public final class bg8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final kg8 b;

    public bg8(kg8 kg8Var, byte b) {
        this.a = b;
        this.b = kg8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        kg8 kg8Var = this.b;
        switch (b) {
            case 0:
                kg8Var.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                kg8Var.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
