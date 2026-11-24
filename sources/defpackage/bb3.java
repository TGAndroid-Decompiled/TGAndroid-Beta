package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class bb3 extends AnimatorListenerAdapter {
    public final byte a = 1;
    public final s49 b;
    public final View c;
    public final ViewPropertyAnimator d;
    public final gb3 e;

    public bb3(gb3 gb3Var, s49 s49Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = gb3Var;
        this.b = s49Var;
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
        s49 s49Var = this.b;
        gb3 gb3Var = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                View view = this.c;
                view.setAlpha(1.0f);
                if (gb3Var.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                gb3Var.Q();
                gb3Var.d(s49Var);
                gb3Var.A.remove(s49Var);
                gb3Var.G();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                gb3Var.M();
                gb3Var.u(s49Var);
                gb3Var.y.remove(s49Var);
                gb3Var.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
    }

    public bb3(gb3 gb3Var, s49 s49Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = gb3Var;
        this.b = s49Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }
}
