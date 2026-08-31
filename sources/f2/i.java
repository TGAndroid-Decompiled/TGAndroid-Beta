package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class i extends AnimatorListenerAdapter {
    public final int f5798a;
    public final j f5799b;
    public final ViewPropertyAnimator f5800c;
    public final View d;
    public final l f5801e;

    public i(l lVar, j jVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f5798a = i10;
        this.f5801e = lVar;
        this.f5799b = jVar;
        this.f5800c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5798a) {
            case 0:
                this.f5800c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                l lVar = this.f5801e;
                if (lVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                j jVar = this.f5799b;
                m1 m1Var = jVar.f5811a;
                lVar.O();
                lVar.d(jVar.f5811a);
                lVar.B.remove(jVar.f5811a);
                lVar.G();
                return;
            default:
                this.f5800c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                l lVar2 = this.f5801e;
                if (lVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                j jVar2 = this.f5799b;
                m1 m1Var2 = jVar2.f5812b;
                lVar2.O();
                lVar2.d(jVar2.f5812b);
                lVar2.B.remove(jVar2.f5812b);
                lVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f5798a) {
            case 0:
                m1 m1Var = this.f5799b.f5811a;
                this.f5801e.getClass();
                return;
            default:
                m1 m1Var2 = this.f5799b.f5812b;
                this.f5801e.getClass();
                return;
        }
    }
}
