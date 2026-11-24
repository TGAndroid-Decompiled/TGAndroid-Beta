package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ia2 extends AnimatorListenerAdapter {
    public final byte a;
    public final eb3 b;
    public final ViewPropertyAnimator c;
    public final View d;
    public final la2 e;

    public ia2(la2 la2Var, eb3 eb3Var, ViewPropertyAnimator viewPropertyAnimator, View view, byte b) {
        this.a = b;
        this.e = la2Var;
        this.b = eb3Var;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        View view = this.d;
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        la2 la2Var = this.e;
        eb3 eb3Var = this.b;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleX(1.0f);
                if (view instanceof gb2) {
                    ((gb2) view).setAnimationOffsetX(0.0f);
                } else {
                    view.setTranslationX(0.0f);
                }
                view.setTranslationY(0.0f);
                if (la2Var.B.remove(eb3Var.a)) {
                    la2Var.d(eb3Var.a);
                    la2Var.G();
                    return;
                }
                return;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleX(1.0f);
                if (view instanceof gb2) {
                    ((gb2) view).setAnimationOffsetX(0.0f);
                } else {
                    view.setTranslationX(0.0f);
                }
                view.setTranslationY(0.0f);
                if (la2Var.B.remove(eb3Var.b)) {
                    la2Var.d(eb3Var.b);
                    la2Var.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                s49 s49Var = this.b.a;
                return;
            default:
                s49 s49Var2 = this.b.b;
                return;
        }
    }
}
