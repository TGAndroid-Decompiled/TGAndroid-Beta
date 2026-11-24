package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class rl3 extends AnimatorListenerAdapter {
    public final byte a = 1;
    public final u69 b;
    public final View c;
    public final ViewPropertyAnimator d;
    public final ki3 e;

    public rl3(ki3 ki3Var, u69 u69Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = ki3Var;
        this.b = u69Var;
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
        u69 u69Var = this.b;
        ki3 ki3Var = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.c.setAlpha(1.0f);
                ki3Var.d(u69Var);
                ki3Var.x.remove(u69Var);
                ki3Var.A();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                ki3Var.u(u69Var);
                ki3Var.v.remove(u69Var);
                ki3Var.A();
                View view = u69Var.a;
                if (view instanceof hg3) {
                    ((hg3) view).setMoving(false);
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

    public rl3(ki3 ki3Var, u69 u69Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = ki3Var;
        this.b = u69Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
