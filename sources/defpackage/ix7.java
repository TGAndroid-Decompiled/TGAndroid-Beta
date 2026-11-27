package defpackage;

import android.animation.ValueAnimator;
public final class ix7 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final nx7 b;

    public ix7(nx7 nx7Var, byte b) {
        this.a = b;
        this.b = nx7Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        byte b = this.a;
        final nx7 nx7Var = this.b;
        switch (b) {
            case 0:
                nx7Var.f.f(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        ValueAnimator valueAnimator2 = valueAnimator;
                        nx7 nx7Var2 = nx7Var;
                        switch (b2) {
                            case 0:
                                nx7Var2.J = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                xh4 xh4Var = nx7Var2.a;
                                if (xh4Var != null) {
                                    xh4Var.v();
                                    return;
                                }
                                return;
                            default:
                                nx7Var2.I = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                xh4 xh4Var2 = nx7Var2.a;
                                if (xh4Var2 != null) {
                                    xh4Var2.v();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                nx7Var.f.f(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        ValueAnimator valueAnimator2 = valueAnimator;
                        nx7 nx7Var2 = nx7Var;
                        switch (b2) {
                            case 0:
                                nx7Var2.J = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                xh4 xh4Var = nx7Var2.a;
                                if (xh4Var != null) {
                                    xh4Var.v();
                                    return;
                                }
                                return;
                            default:
                                nx7Var2.I = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                xh4 xh4Var2 = nx7Var2.a;
                                if (xh4Var2 != null) {
                                    xh4Var2.v();
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
