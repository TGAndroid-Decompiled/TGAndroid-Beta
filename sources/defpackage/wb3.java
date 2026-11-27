package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class wb3 extends AnimatorListenerAdapter {
    public final byte a;
    public final xb3 b;
    public final ViewPropertyAnimator c;
    public final View d;
    public final zb3 e;

    public wb3(zb3 zb3Var, xb3 xb3Var, ViewPropertyAnimator viewPropertyAnimator, View view, byte b) {
        this.a = b;
        this.e = zb3Var;
        this.b = xb3Var;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        zb3 zb3Var = this.e;
        View view = this.d;
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        xb3 xb3Var = this.b;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                if (zb3Var.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                f89 f89Var = xb3Var.a;
                zb3Var.O();
                zb3Var.d(xb3Var.a);
                zb3Var.B.remove(xb3Var.a);
                zb3Var.G();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                if (zb3Var.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                f89 f89Var2 = xb3Var.b;
                zb3Var.O();
                zb3Var.d(xb3Var.b);
                zb3Var.B.remove(xb3Var.b);
                zb3Var.G();
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
