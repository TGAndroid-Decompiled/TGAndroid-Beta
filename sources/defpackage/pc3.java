package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class pc3 extends AnimatorListenerAdapter {
    public final byte a;
    public final qc3 b;
    public final ViewPropertyAnimator c;
    public final View d;
    public final sc3 e;

    public pc3(sc3 sc3Var, qc3 qc3Var, ViewPropertyAnimator viewPropertyAnimator, View view, byte b) {
        this.a = b;
        this.e = sc3Var;
        this.b = qc3Var;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        sc3 sc3Var = this.e;
        View view = this.d;
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        qc3 qc3Var = this.b;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                if (sc3Var.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                u69 u69Var = qc3Var.a;
                sc3Var.O();
                sc3Var.d(qc3Var.a);
                sc3Var.B.remove(qc3Var.a);
                sc3Var.G();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                if (sc3Var.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                u69 u69Var2 = qc3Var.b;
                sc3Var.O();
                sc3Var.d(qc3Var.b);
                sc3Var.B.remove(qc3Var.b);
                sc3Var.G();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                u69 u69Var = this.b.a;
                return;
            default:
                u69 u69Var2 = this.b.b;
                return;
        }
    }
}
