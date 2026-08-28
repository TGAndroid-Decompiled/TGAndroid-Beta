package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class k extends AnimatorListenerAdapter {
    public final int f5399a;
    public final l f5400b;
    public final ViewPropertyAnimator f5401c;
    public final View d;
    public final n f5402e;

    public k(n nVar, l lVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i9) {
        this.f5399a = i9;
        this.f5402e = nVar;
        this.f5400b = lVar;
        this.f5401c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5399a) {
            case 0:
                this.f5401c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                n nVar = this.f5402e;
                if (nVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                l lVar = this.f5400b;
                q1 q1Var = lVar.f5414a;
                nVar.O();
                nVar.d(lVar.f5414a);
                nVar.B.remove(lVar.f5414a);
                nVar.G();
                return;
            default:
                this.f5401c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                n nVar2 = this.f5402e;
                if (nVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                l lVar2 = this.f5400b;
                q1 q1Var2 = lVar2.f5415b;
                nVar2.O();
                nVar2.d(lVar2.f5415b);
                nVar2.B.remove(lVar2.f5415b);
                nVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f5399a) {
            case 0:
                q1 q1Var = this.f5400b.f5414a;
                this.f5402e.getClass();
                return;
            default:
                q1 q1Var2 = this.f5400b.f5415b;
                this.f5402e.getClass();
                return;
        }
    }
}
