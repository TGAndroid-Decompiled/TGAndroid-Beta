package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class g extends AnimatorListenerAdapter {
    public final int f5769a = 1;
    public final m1 f5770b;
    public final View f5771c;
    public final ViewPropertyAnimator d;
    public final l f5772e;

    public g(l lVar, m1 m1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f5772e = lVar;
        this.f5770b = m1Var;
        this.d = viewPropertyAnimator;
        this.f5771c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f5769a) {
            case 1:
                View view = this.f5771c;
                view.setAlpha(1.0f);
                if (this.f5772e.A(view) > 0.0f) {
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
        switch (this.f5769a) {
            case 0:
                this.d.setListener(null);
                View view = this.f5771c;
                view.setAlpha(1.0f);
                l lVar = this.f5772e;
                if (lVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                lVar.Q();
                m1 m1Var = this.f5770b;
                lVar.d(m1Var);
                lVar.A.remove(m1Var);
                lVar.G();
                return;
            default:
                this.d.setListener(null);
                l lVar2 = this.f5772e;
                lVar2.M();
                m1 m1Var2 = this.f5770b;
                lVar2.u(m1Var2);
                lVar2.f5861y.remove(m1Var2);
                lVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f5769a) {
            case 0:
                return;
            default:
                this.f5772e.getClass();
                return;
        }
    }

    public g(l lVar, m1 m1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f5772e = lVar;
        this.f5770b = m1Var;
        this.f5771c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
