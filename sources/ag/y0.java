package ag;

import android.animation.ValueAnimator;
public final class y0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f722a;
    public final f1 f723b;

    public y0(f1 f1Var, int i10) {
        this.f722a = i10;
        this.f723b = f1Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f722a) {
            case 0:
                final f1 f1Var = this.f723b;
                f1Var.f473f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                f1 f1Var2 = f1Var;
                                f1Var2.getClass();
                                f1Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o1 o1Var = f1Var2.f469a;
                                if (o1Var != null) {
                                    o1Var.c();
                                    return;
                                }
                                return;
                            default:
                                f1 f1Var3 = f1Var;
                                f1Var3.getClass();
                                f1Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o1 o1Var2 = f1Var3.f469a;
                                if (o1Var2 != null) {
                                    o1Var2.c();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final f1 f1Var2 = this.f723b;
                f1Var2.f473f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                f1 f1Var22 = f1Var2;
                                f1Var22.getClass();
                                f1Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o1 o1Var = f1Var22.f469a;
                                if (o1Var != null) {
                                    o1Var.c();
                                    return;
                                }
                                return;
                            default:
                                f1 f1Var3 = f1Var2;
                                f1Var3.getClass();
                                f1Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o1 o1Var2 = f1Var3.f469a;
                                if (o1Var2 != null) {
                                    o1Var2.c();
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
