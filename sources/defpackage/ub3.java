package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ub3 extends AnimatorListenerAdapter {
    public final byte a = 1;
    public final f89 b;
    public final View c;
    public final ViewPropertyAnimator d;
    public final zb3 e;

    public ub3(zb3 zb3Var, f89 f89Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = zb3Var;
        this.b = f89Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                View view = this.c;
                view.setAlpha(1.0f);
                if (this.e.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        f89 f89Var = this.b;
        zb3 zb3Var = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                View view = this.c;
                view.setAlpha(1.0f);
                if (zb3Var.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                zb3Var.Q();
                zb3Var.d(f89Var);
                zb3Var.A.remove(f89Var);
                zb3Var.G();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                zb3Var.M();
                zb3Var.u(f89Var);
                zb3Var.y.remove(f89Var);
                zb3Var.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
    }

    public ub3(zb3 zb3Var, f89 f89Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = zb3Var;
        this.b = f89Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }
}
