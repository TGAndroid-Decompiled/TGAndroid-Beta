package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class vb3 extends AnimatorListenerAdapter {
    public final byte a;
    public final f89 b;
    public final int c;
    public final View d;
    public final int e;
    public final ViewPropertyAnimator f;
    public final cma h;

    public vb3(cma cmaVar, f89 f89Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator, byte b) {
        this.a = b;
        this.h = cmaVar;
        this.b = f89Var;
        this.c = i;
        this.d = view;
        this.e = i2;
        this.f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        int i = this.e;
        int i2 = this.c;
        View view = this.d;
        switch (b) {
            case 0:
                if (i2 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i != 0) {
                    view.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                if (i2 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.b.a;
                if (view2 instanceof of3) {
                    ((of3) view2).setMoving(false);
                    return;
                } else if (view2 instanceof fk3) {
                    ((fk3) view2).a = false;
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        f89 f89Var = this.b;
        cma cmaVar = this.h;
        ViewPropertyAnimator viewPropertyAnimator = this.f;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                zb3 zb3Var = (zb3) cmaVar;
                zb3Var.P(f89Var);
                zb3Var.v(f89Var);
                zb3Var.z.remove(f89Var);
                zb3Var.G();
                zb3Var.z(f89Var);
                return;
            default:
                viewPropertyAnimator.setListener(null);
                sh3 sh3Var = (sh3) cmaVar;
                sh3Var.v(f89Var);
                sh3Var.w.remove(f89Var);
                sh3Var.A();
                View view = f89Var.a;
                if (view instanceof of3) {
                    ((of3) view).setMoving(false);
                } else if (view instanceof fk3) {
                    ((fk3) view).a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }
}
