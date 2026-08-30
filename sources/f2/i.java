package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class i extends AnimatorListenerAdapter {
    public final int f5728a;
    public final j f5729b;
    public final ViewPropertyAnimator f5730c;
    public final View d;
    public final l e;

    public i(l lVar, j jVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f5728a = i10;
        this.e = lVar;
        this.f5729b = jVar;
        this.f5730c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5728a) {
            case 0:
                this.f5730c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                l lVar = this.e;
                if (lVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                j jVar = this.f5729b;
                l1 l1Var = jVar.f5753a;
                lVar.O();
                lVar.d(jVar.f5753a);
                lVar.B.remove(jVar.f5753a);
                lVar.G();
                return;
            default:
                this.f5730c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                l lVar2 = this.e;
                if (lVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                j jVar2 = this.f5729b;
                l1 l1Var2 = jVar2.f5754b;
                lVar2.O();
                lVar2.d(jVar2.f5754b);
                lVar2.B.remove(jVar2.f5754b);
                lVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f5728a) {
            case 0:
                l1 l1Var = this.f5729b.f5753a;
                this.e.getClass();
                return;
            default:
                l1 l1Var2 = this.f5729b.f5754b;
                this.e.getClass();
                return;
        }
    }
}
