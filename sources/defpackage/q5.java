package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.ActionBar.a;
public final class q5 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final a b;

    public q5(a aVar, byte b) {
        this.a = b;
        this.b = aVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        r6 r6Var;
        byte b = this.a;
        a aVar = this.b;
        switch (b) {
            case 0:
                sr8 sr8Var = aVar.f1;
                if (sr8Var != null) {
                    sr8Var.run();
                    return;
                }
                return;
            case 1:
                sr8 sr8Var2 = aVar.f1;
                if (sr8Var2 != null) {
                    sr8Var2.run();
                    return;
                }
                return;
            case 2:
                aVar.p0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (aVar.a != null && aVar.S0) {
                    float L = gl.L(23.0f);
                    float U1 = gl.U1(aVar.p0, gl.L(18.33f), gl.L(23.0f));
                    aVar.a.s(U1, L, L, U1);
                    aVar.invalidate();
                }
                if (aVar.Q0 && (r6Var = aVar.F) != null) {
                    r6Var.setTranslationX(-gl.R1(gl.L(10.0f), gl.L(5.0f), aVar.p0));
                }
                sr8 sr8Var3 = aVar.f1;
                if (sr8Var3 != null) {
                    sr8Var3.run();
                    return;
                }
                return;
            case 3:
                aVar.E1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aVar.i();
                return;
            default:
                aVar.E1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aVar.i();
                return;
        }
    }
}
