package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class g extends AnimatorListenerAdapter {

    public final int f5667a = 1;

    public final o1 f5668b;

    public final View f5669c;
    public final ViewPropertyAnimator d;

    public final l f5670e;

    public g(l lVar, o1 o1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f5670e = lVar;
        this.f5668b = o1Var;
        this.d = viewPropertyAnimator;
        this.f5669c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f5667a) {
            case 1:
                View view = this.f5669c;
                view.setAlpha(1.0f);
                if (this.f5670e.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5667a) {
            case 0:
                this.d.setListener(null);
                View view = this.f5669c;
                view.setAlpha(1.0f);
                l lVar = this.f5670e;
                if (lVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                lVar.Q();
                o1 o1Var = this.f5668b;
                lVar.d(o1Var);
                lVar.A.remove(o1Var);
                lVar.G();
                break;
            default:
                this.d.setListener(null);
                l lVar2 = this.f5670e;
                lVar2.M();
                o1 o1Var2 = this.f5668b;
                lVar2.u(o1Var2);
                lVar2.f5746y.remove(o1Var2);
                lVar2.G();
                break;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f5667a) {
            case 0:
                break;
            default:
                this.f5670e.getClass();
                break;
        }
    }

    public g(l lVar, o1 o1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f5670e = lVar;
        this.f5668b = o1Var;
        this.f5669c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
