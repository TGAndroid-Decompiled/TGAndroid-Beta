package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class i extends AnimatorListenerAdapter {
    public final int f5379a = 1;
    public final q1 f5380b;
    public final View f5381c;
    public final ViewPropertyAnimator d;
    public final n f5382e;

    public i(n nVar, q1 q1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f5382e = nVar;
        this.f5380b = q1Var;
        this.d = viewPropertyAnimator;
        this.f5381c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f5379a) {
            case 1:
                View view = this.f5381c;
                view.setAlpha(1.0f);
                if (this.f5382e.A(view) > 0.0f) {
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
        switch (this.f5379a) {
            case 0:
                this.d.setListener(null);
                View view = this.f5381c;
                view.setAlpha(1.0f);
                n nVar = this.f5382e;
                if (nVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                nVar.Q();
                q1 q1Var = this.f5380b;
                nVar.d(q1Var);
                nVar.A.remove(q1Var);
                nVar.G();
                return;
            default:
                this.d.setListener(null);
                n nVar2 = this.f5382e;
                nVar2.M();
                q1 q1Var2 = this.f5380b;
                nVar2.u(q1Var2);
                nVar2.f5458y.remove(q1Var2);
                nVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f5379a) {
            case 0:
                return;
            default:
                this.f5382e.getClass();
                return;
        }
    }

    public i(n nVar, q1 q1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f5382e = nVar;
        this.f5380b = q1Var;
        this.f5381c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
