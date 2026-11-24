package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class fa2 extends AnimatorListenerAdapter {
    public final byte a = 1;
    public final View b;
    public final s49 c;
    public final la2 d;

    public fa2(la2 la2Var, s49 s49Var, View view) {
        this.d = la2Var;
        this.c = s49Var;
        this.b = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        s49 s49Var = this.c;
        la2 la2Var = this.d;
        View view = this.b;
        switch (b) {
            case 0:
                animator.removeAllListeners();
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                if (la2Var.y.remove(s49Var)) {
                    la2Var.u(s49Var);
                    la2Var.G();
                    return;
                }
                return;
            default:
                animator.removeAllListeners();
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                if (la2Var.A.remove(s49Var)) {
                    la2Var.d(s49Var);
                    la2Var.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public fa2(la2 la2Var, View view, s49 s49Var) {
        this.d = la2Var;
        this.b = view;
        this.c = s49Var;
    }

    private final void a(Animator animator) {
    }
}
