package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class yk3 extends AnimatorListenerAdapter {
    public final byte a = 1;
    public final f89 b;
    public final View c;
    public final ViewPropertyAnimator d;
    public final sh3 e;

    public yk3(sh3 sh3Var, f89 f89Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = sh3Var;
        this.b = f89Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        f89 f89Var = this.b;
        sh3 sh3Var = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.c.setAlpha(1.0f);
                sh3Var.d(f89Var);
                sh3Var.x.remove(f89Var);
                sh3Var.A();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                sh3Var.u(f89Var);
                sh3Var.v.remove(f89Var);
                sh3Var.A();
                View view = f89Var.a;
                if (view instanceof of3) {
                    ((of3) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.y();
                return;
            default:
                return;
        }
    }

    public yk3(sh3 sh3Var, f89 f89Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = sh3Var;
        this.b = f89Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
