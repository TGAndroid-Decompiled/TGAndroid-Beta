package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class qb2 extends AnimatorListenerAdapter {
    public final byte a = 1;
    public final View b;
    public final u69 c;
    public final wb2 d;

    public qb2(wb2 wb2Var, u69 u69Var, View view) {
        this.d = wb2Var;
        this.c = u69Var;
        this.b = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        u69 u69Var = this.c;
        wb2 wb2Var = this.d;
        View view = this.b;
        switch (b) {
            case 0:
                animator.removeAllListeners();
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                if (wb2Var.y.remove(u69Var)) {
                    wb2Var.u(u69Var);
                    wb2Var.G();
                    return;
                }
                return;
            default:
                animator.removeAllListeners();
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                if (wb2Var.A.remove(u69Var)) {
                    wb2Var.d(u69Var);
                    wb2Var.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public qb2(wb2 wb2Var, View view, u69 u69Var) {
        this.d = wb2Var;
        this.b = view;
        this.c = u69Var;
    }

    private final void a(Animator animator) {
    }
}
