package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class i extends AnimatorListenerAdapter {
    public final int f6344a;
    public final j f6345b;
    public final ViewPropertyAnimator f6346c;
    public final View d;
    public final l f6347e;

    public i(l lVar, j jVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f6344a = i10;
        this.f6347e = lVar;
        this.f6345b = jVar;
        this.f6346c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6344a) {
            case 0:
                this.f6346c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                l lVar = this.f6347e;
                if (lVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                j jVar = this.f6345b;
                n1 n1Var = jVar.f6357a;
                lVar.O();
                lVar.d(jVar.f6357a);
                lVar.B.remove(jVar.f6357a);
                lVar.G();
                return;
            default:
                this.f6346c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                l lVar2 = this.f6347e;
                if (lVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                j jVar2 = this.f6345b;
                n1 n1Var2 = jVar2.f6358b;
                lVar2.O();
                lVar2.d(jVar2.f6358b);
                lVar2.B.remove(jVar2.f6358b);
                lVar2.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f6344a) {
            case 0:
                n1 n1Var = this.f6345b.f6357a;
                this.f6347e.getClass();
                return;
            default:
                n1 n1Var2 = this.f6345b.f6358b;
                this.f6347e.getClass();
                return;
        }
    }
}
