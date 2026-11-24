package defpackage;

import android.animation.ValueAnimator;
public final class gi1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public boolean b = false;
    public final jm7 c;

    public gi1(jm7 jm7Var, byte b) {
        this.a = b;
        this.c = jm7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        jm7 jm7Var = this.c;
        switch (b) {
            case 0:
                vi1 vi1Var = (vi1) jm7Var;
                vi1Var.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi1Var.n0.invalidate();
                if (!this.b && vi1Var.o0 > 0.5f) {
                    this.b = true;
                    return;
                }
                return;
            case 1:
                d38 d38Var = (d38) jm7Var;
                d38Var.Z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d38Var.Y.invalidate();
                if (!this.b && d38Var.Z > 0.5f) {
                    this.b = true;
                    return;
                }
                return;
            case 2:
                v9b v9bVar = (v9b) jm7Var;
                v9bVar.E2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f9b f9bVar = v9bVar.D2;
                if (f9bVar != null) {
                    f9bVar.invalidate();
                }
                if (!this.b && v9bVar.E2 > 0.5f) {
                    this.b = true;
                    return;
                }
                return;
            default:
                rob robVar = (rob) jm7Var;
                robVar.k2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                robVar.j2.invalidate();
                if (!this.b && robVar.k2 > 0.5f) {
                    this.b = true;
                    return;
                }
                return;
        }
    }
}
