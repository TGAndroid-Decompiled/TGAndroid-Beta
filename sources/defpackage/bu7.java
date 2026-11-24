package defpackage;

import android.animation.ValueAnimator;
public final class bu7 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final gu7 b;

    public bu7(gu7 gu7Var, byte b) {
        this.a = b;
        this.b = gu7Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        byte b = this.a;
        final gu7 gu7Var = this.b;
        switch (b) {
            case 0:
                gu7Var.f.f(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        ValueAnimator valueAnimator2 = valueAnimator;
                        gu7 gu7Var2 = gu7Var;
                        switch (b2) {
                            case 0:
                                gu7Var2.J = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                u39 u39Var = gu7Var2.a;
                                if (u39Var != null) {
                                    u39Var.i0();
                                    return;
                                }
                                return;
                            default:
                                gu7Var2.I = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                u39 u39Var2 = gu7Var2.a;
                                if (u39Var2 != null) {
                                    u39Var2.i0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                gu7Var.f.f(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        ValueAnimator valueAnimator2 = valueAnimator;
                        gu7 gu7Var2 = gu7Var;
                        switch (b2) {
                            case 0:
                                gu7Var2.J = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                u39 u39Var = gu7Var2.a;
                                if (u39Var != null) {
                                    u39Var.i0();
                                    return;
                                }
                                return;
                            default:
                                gu7Var2.I = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                u39 u39Var2 = gu7Var2.a;
                                if (u39Var2 != null) {
                                    u39Var2.i0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
