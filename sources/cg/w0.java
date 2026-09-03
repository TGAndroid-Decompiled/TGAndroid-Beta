package cg;

import android.animation.ValueAnimator;
public final class w0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f2540a;
    public final d1 f2541b;

    public w0(d1 d1Var, int i10) {
        this.f2540a = i10;
        this.f2541b = d1Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f2540a) {
            case 0:
                final d1 d1Var = this.f2541b;
                d1Var.f2320f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                d1 d1Var2 = d1Var;
                                d1Var2.getClass();
                                d1Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o5.i iVar = d1Var2.f2317a;
                                if (iVar != null) {
                                    iVar.q();
                                    return;
                                }
                                return;
                            default:
                                d1 d1Var3 = d1Var;
                                d1Var3.getClass();
                                d1Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o5.i iVar2 = d1Var3.f2317a;
                                if (iVar2 != null) {
                                    iVar2.q();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final d1 d1Var2 = this.f2541b;
                d1Var2.f2320f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                d1 d1Var22 = d1Var2;
                                d1Var22.getClass();
                                d1Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o5.i iVar = d1Var22.f2317a;
                                if (iVar != null) {
                                    iVar.q();
                                    return;
                                }
                                return;
                            default:
                                d1 d1Var3 = d1Var2;
                                d1Var3.getClass();
                                d1Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o5.i iVar2 = d1Var3.f2317a;
                                if (iVar2 != null) {
                                    iVar2.q();
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
