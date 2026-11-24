package defpackage;

import android.animation.ValueAnimator;
public final class cw7 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final hw7 b;

    public cw7(hw7 hw7Var, byte b) {
        this.a = b;
        this.b = hw7Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        byte b = this.a;
        final hw7 hw7Var = this.b;
        switch (b) {
            case 0:
                hw7Var.f.f(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        ValueAnimator valueAnimator2 = valueAnimator;
                        hw7 hw7Var2 = hw7Var;
                        switch (b2) {
                            case 0:
                                hw7Var2.J = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                x59 x59Var = hw7Var2.a;
                                if (x59Var != null) {
                                    x59Var.f0();
                                    return;
                                }
                                return;
                            default:
                                hw7Var2.I = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                x59 x59Var2 = hw7Var2.a;
                                if (x59Var2 != null) {
                                    x59Var2.f0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                hw7Var.f.f(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        ValueAnimator valueAnimator2 = valueAnimator;
                        hw7 hw7Var2 = hw7Var;
                        switch (b2) {
                            case 0:
                                hw7Var2.J = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                x59 x59Var = hw7Var2.a;
                                if (x59Var != null) {
                                    x59Var.f0();
                                    return;
                                }
                                return;
                            default:
                                hw7Var2.I = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                x59 x59Var2 = hw7Var2.a;
                                if (x59Var2 != null) {
                                    x59Var2.f0();
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
