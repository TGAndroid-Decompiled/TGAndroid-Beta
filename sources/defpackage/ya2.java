package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ya2 extends AnimatorListenerAdapter {
    public final byte a;
    public final xb3 b;
    public final ViewPropertyAnimator c;
    public final View d;
    public final bb2 e;

    public ya2(bb2 bb2Var, xb3 xb3Var, ViewPropertyAnimator viewPropertyAnimator, View view, byte b) {
        this.a = b;
        this.e = bb2Var;
        this.b = xb3Var;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        View view = this.d;
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        bb2 bb2Var = this.e;
        xb3 xb3Var = this.b;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleX(1.0f);
                if (view instanceof wb2) {
                    ((wb2) view).setAnimationOffsetX(0.0f);
                } else {
                    view.setTranslationX(0.0f);
                }
                view.setTranslationY(0.0f);
                if (bb2Var.B.remove(xb3Var.a)) {
                    bb2Var.d(xb3Var.a);
                    bb2Var.G();
                    return;
                }
                return;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleX(1.0f);
                if (view instanceof wb2) {
                    ((wb2) view).setAnimationOffsetX(0.0f);
                } else {
                    view.setTranslationX(0.0f);
                }
                view.setTranslationY(0.0f);
                if (bb2Var.B.remove(xb3Var.b)) {
                    bb2Var.d(xb3Var.b);
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
                f89 f89Var = this.b.a;
                return;
            default:
                f89 f89Var2 = this.b.b;
                return;
        }
    }
}
