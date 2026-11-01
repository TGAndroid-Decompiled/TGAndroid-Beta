package ig;

import android.animation.ValueAnimator;
public final class j0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f8333a;
    public final q0 f8334b;

    public j0(q0 q0Var, int i10) {
        this.f8333a = i10;
        this.f8334b = q0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f8333a) {
            case 0:
                final q0 q0Var = this.f8334b;
                q0Var.f8414f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var2 = q0Var;
                                q0Var2.getClass();
                                q0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                a4.l lVar = q0Var2.f8411a;
                                if (lVar != null) {
                                    lVar.u();
                                    return;
                                }
                                return;
                            default:
                                q0 q0Var3 = q0Var;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                a4.l lVar2 = q0Var3.f8411a;
                                if (lVar2 != null) {
                                    lVar2.u();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final q0 q0Var2 = this.f8334b;
                q0Var2.f8414f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var22 = q0Var2;
                                q0Var22.getClass();
                                q0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                a4.l lVar = q0Var22.f8411a;
                                if (lVar != null) {
                                    lVar.u();
                                    return;
                                }
                                return;
                            default:
                                q0 q0Var3 = q0Var2;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                a4.l lVar2 = q0Var3.f8411a;
                                if (lVar2 != null) {
                                    lVar2.u();
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
