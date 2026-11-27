package defpackage;

import android.animation.ValueAnimator;
public final class hh1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public boolean b = false;
    public final fn7 c;

    public hh1(fn7 fn7Var, byte b) {
        this.a = b;
        this.c = fn7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        fn7 fn7Var = this.c;
        switch (b) {
            case 0:
                wh1 wh1Var = (wh1) fn7Var;
                wh1Var.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wh1Var.n0.invalidate();
                if (!this.b && wh1Var.o0 > 0.5f) {
                    this.b = true;
                    return;
                }
                return;
            case 1:
                h48 h48Var = (h48) fn7Var;
                h48Var.Z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h48Var.Y.invalidate();
                if (!this.b && h48Var.Z > 0.5f) {
                    this.b = true;
                    return;
                }
                return;
            case 2:
                rbb rbbVar = (rbb) fn7Var;
                rbbVar.E2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bbb bbbVar = rbbVar.D2;
                if (bbbVar != null) {
                    bbbVar.invalidate();
                }
                if (!this.b && rbbVar.E2 > 0.5f) {
                    this.b = true;
                    return;
                }
                return;
            default:
                pqb pqbVar = (pqb) fn7Var;
                pqbVar.k2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pqbVar.j2.invalidate();
                if (!this.b && pqbVar.k2 > 0.5f) {
                    this.b = true;
                    return;
                }
                return;
        }
    }
}
