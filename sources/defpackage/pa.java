package defpackage;

import android.animation.ValueAnimator;
public final class pa implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final qa b;
    public final m53 c;

    public pa(qa qaVar, m53 m53Var, byte b) {
        this.a = b;
        this.b = qaVar;
        this.c = m53Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        m53 m53Var = this.c;
        qa qaVar = this.b;
        switch (b) {
            case 0:
                qaVar.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m53Var.invalidate();
                return;
            default:
                qaVar.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m53Var.invalidate();
                return;
        }
    }
}
