package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class i extends AnimatorListenerAdapter {

    public final int f5687a;

    public final j f5688b;

    public final ViewPropertyAnimator f5689c;
    public final View d;

    public final l f5690e;

    public i(l lVar, j jVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f5687a = i10;
        this.f5690e = lVar;
        this.f5688b = jVar;
        this.f5689c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5687a) {
            case 0:
                this.f5689c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                l lVar = this.f5690e;
                if (lVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                j jVar = this.f5688b;
                o1 o1Var = jVar.f5702a;
                lVar.O();
                lVar.d(jVar.f5702a);
                lVar.B.remove(jVar.f5702a);
                lVar.G();
                break;
            default:
                this.f5689c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                l lVar2 = this.f5690e;
                if (lVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                j jVar2 = this.f5688b;
                o1 o1Var2 = jVar2.f5703b;
                lVar2.O();
                lVar2.d(jVar2.f5703b);
                lVar2.B.remove(jVar2.f5703b);
                lVar2.G();
                break;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f5687a) {
            case 0:
                o1 o1Var = this.f5688b.f5702a;
                this.f5690e.getClass();
                break;
            default:
                o1 o1Var2 = this.f5688b.f5703b;
                this.f5690e.getClass();
                break;
        }
    }
}
