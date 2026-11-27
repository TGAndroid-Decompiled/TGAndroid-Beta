package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class va2 extends AnimatorListenerAdapter {
    public final byte a = 1;
    public final View b;
    public final f89 c;
    public final bb2 d;

    public va2(bb2 bb2Var, f89 f89Var, View view) {
        this.d = bb2Var;
        this.c = f89Var;
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
        f89 f89Var = this.c;
        bb2 bb2Var = this.d;
        View view = this.b;
        switch (b) {
            case 0:
                animator.removeAllListeners();
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                if (bb2Var.y.remove(f89Var)) {
                    bb2Var.u(f89Var);
                    bb2Var.G();
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
                if (bb2Var.A.remove(f89Var)) {
                    bb2Var.d(f89Var);
                    bb2Var.G();
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

    public va2(bb2 bb2Var, View view, f89 f89Var) {
        this.d = bb2Var;
        this.b = view;
        this.c = f89Var;
    }

    private final void a(Animator animator) {
    }
}
