package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class g extends AnimatorListenerAdapter {
    public final int f5699a = 1;
    public final l1 f5700b;
    public final View f5701c;
    public final ViewPropertyAnimator d;
    public final l e;

    public g(l lVar, l1 l1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = lVar;
        this.f5700b = l1Var;
        this.d = viewPropertyAnimator;
        this.f5701c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f5699a) {
            case 1:
                View view = this.f5701c;
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
        switch (this.f5699a) {
            case 0:
                this.d.setListener(null);
                View view = this.f5701c;
                view.setAlpha(1.0f);
                l lVar = this.e;
                if (lVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                lVar.Q();
                l1 l1Var = this.f5700b;
                lVar.d(l1Var);
                lVar.A.remove(l1Var);
                lVar.G();
                return;
            default:
                this.d.setListener(null);
                l lVar2 = this.e;
                lVar2.M();
                l1 l1Var2 = this.f5700b;
                lVar2.u(l1Var2);
                lVar2.f5782y.remove(l1Var2);
                lVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f5699a) {
            case 0:
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public g(l lVar, l1 l1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = lVar;
        this.f5700b = l1Var;
        this.f5701c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
