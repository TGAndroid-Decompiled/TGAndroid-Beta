package dg;

import android.animation.ValueAnimator;
public final class v0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4692a;
    public final c1 f4693b;

    public v0(c1 c1Var, int i10) {
        this.f4692a = i10;
        this.f4693b = c1Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f4692a) {
            case 0:
                final c1 c1Var = this.f4693b;
                c1Var.f4455f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                c1 c1Var2 = c1Var;
                                c1Var2.getClass();
                                c1Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o5.i iVar = c1Var2.f4451a;
                                if (iVar != null) {
                                    iVar.c();
                                    return;
                                }
                                return;
                            default:
                                c1 c1Var3 = c1Var;
                                c1Var3.getClass();
                                c1Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o5.i iVar2 = c1Var3.f4451a;
                                if (iVar2 != null) {
                                    iVar2.c();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final c1 c1Var2 = this.f4693b;
                c1Var2.f4455f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                c1 c1Var22 = c1Var2;
                                c1Var22.getClass();
                                c1Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o5.i iVar = c1Var22.f4451a;
                                if (iVar != null) {
                                    iVar.c();
                                    return;
                                }
                                return;
                            default:
                                c1 c1Var3 = c1Var2;
                                c1Var3.getClass();
                                c1Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o5.i iVar2 = c1Var3.f4451a;
                                if (iVar2 != null) {
                                    iVar2.c();
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
