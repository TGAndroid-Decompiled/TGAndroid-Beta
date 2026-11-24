package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class db3 extends AnimatorListenerAdapter {
    public final byte a;
    public final eb3 b;
    public final ViewPropertyAnimator c;
    public final View d;
    public final gb3 e;

    public db3(gb3 gb3Var, eb3 eb3Var, ViewPropertyAnimator viewPropertyAnimator, View view, byte b) {
        this.a = b;
        this.e = gb3Var;
        this.b = eb3Var;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        gb3 gb3Var = this.e;
        View view = this.d;
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        eb3 eb3Var = this.b;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                if (gb3Var.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                s49 s49Var = eb3Var.a;
                gb3Var.O();
                gb3Var.d(eb3Var.a);
                gb3Var.B.remove(eb3Var.a);
                gb3Var.G();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                if (gb3Var.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                s49 s49Var2 = eb3Var.b;
                gb3Var.O();
                gb3Var.d(eb3Var.b);
                gb3Var.B.remove(eb3Var.b);
                gb3Var.G();
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
