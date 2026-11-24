package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class hk3 extends AnimatorListenerAdapter {
    public final byte a = 1;
    public final s49 b;
    public final View c;
    public final ViewPropertyAnimator d;
    public final yg3 e;

    public hk3(yg3 yg3Var, s49 s49Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = yg3Var;
        this.b = s49Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        s49 s49Var = this.b;
        yg3 yg3Var = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.c.setAlpha(1.0f);
                yg3Var.d(s49Var);
                yg3Var.x.remove(s49Var);
                yg3Var.A();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                yg3Var.u(s49Var);
                yg3Var.v.remove(s49Var);
                yg3Var.A();
                View view = s49Var.a;
                if (view instanceof ue3) {
                    ((ue3) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.y();
                return;
            default:
                return;
        }
    }

    public hk3(yg3 yg3Var, s49 s49Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = yg3Var;
        this.b = s49Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
