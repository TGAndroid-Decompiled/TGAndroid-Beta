package og;

import android.animation.ValueAnimator;
public final class o0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14438a;
    public final v0 f14439b;

    public o0(v0 v0Var, int i10) {
        this.f14438a = i10;
        this.f14439b = v0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f14438a) {
            case 0:
                final v0 v0Var = this.f14439b;
                v0Var.f14515f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v0 v0Var2 = v0Var;
                                v0Var2.getClass();
                                v0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                l2.h hVar = v0Var2.f14512a;
                                if (hVar != null) {
                                    hVar.n();
                                    return;
                                }
                                return;
                            default:
                                v0 v0Var3 = v0Var;
                                v0Var3.getClass();
                                v0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                l2.h hVar2 = v0Var3.f14512a;
                                if (hVar2 != null) {
                                    hVar2.n();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final v0 v0Var2 = this.f14439b;
                v0Var2.f14515f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v0 v0Var22 = v0Var2;
                                v0Var22.getClass();
                                v0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                l2.h hVar = v0Var22.f14512a;
                                if (hVar != null) {
                                    hVar.n();
                                    return;
                                }
                                return;
                            default:
                                v0 v0Var3 = v0Var2;
                                v0Var3.getClass();
                                v0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                l2.h hVar2 = v0Var3.f14512a;
                                if (hVar2 != null) {
                                    hVar2.n();
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
