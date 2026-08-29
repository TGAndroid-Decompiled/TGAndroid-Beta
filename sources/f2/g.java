package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class g extends AnimatorListenerAdapter {
    public final int f6320a = 1;
    public final n1 f6321b;
    public final View f6322c;
    public final ViewPropertyAnimator d;
    public final l f6323e;

    public g(l lVar, n1 n1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f6323e = lVar;
        this.f6321b = n1Var;
        this.d = viewPropertyAnimator;
        this.f6322c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f6320a) {
            case 1:
                View view = this.f6322c;
                view.setAlpha(1.0f);
                if (this.f6323e.A(view) > 0.0f) {
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
        switch (this.f6320a) {
            case 0:
                this.d.setListener(null);
                View view = this.f6322c;
                view.setAlpha(1.0f);
                l lVar = this.f6323e;
                if (lVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                lVar.Q();
                n1 n1Var = this.f6321b;
                lVar.d(n1Var);
                lVar.A.remove(n1Var);
                lVar.G();
                return;
            default:
                this.d.setListener(null);
                l lVar2 = this.f6323e;
                lVar2.M();
                n1 n1Var2 = this.f6321b;
                lVar2.u(n1Var2);
                lVar2.f6413y.remove(n1Var2);
                lVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f6320a) {
            case 0:
                return;
            default:
                this.f6323e.getClass();
                return;
        }
    }

    public g(l lVar, n1 n1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f6323e = lVar;
        this.f6321b = n1Var;
        this.f6322c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
