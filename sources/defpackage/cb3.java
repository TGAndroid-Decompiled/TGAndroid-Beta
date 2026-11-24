package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class cb3 extends AnimatorListenerAdapter {
    public final byte a;
    public final s49 b;
    public final int c;
    public final View d;
    public final int e;
    public final ViewPropertyAnimator f;
    public final hia h;

    public cb3(hia hiaVar, s49 s49Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator, byte b) {
        this.a = b;
        this.h = hiaVar;
        this.b = s49Var;
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
                if (view2 instanceof ue3) {
                    ((ue3) view2).setMoving(false);
                    return;
                } else if (view2 instanceof nj3) {
                    ((nj3) view2).a = false;
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        s49 s49Var = this.b;
        hia hiaVar = this.h;
        ViewPropertyAnimator viewPropertyAnimator = this.f;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                gb3 gb3Var = (gb3) hiaVar;
                gb3Var.P(s49Var);
                gb3Var.v(s49Var);
                gb3Var.z.remove(s49Var);
                gb3Var.G();
                gb3Var.z(s49Var);
                return;
            default:
                viewPropertyAnimator.setListener(null);
                yg3 yg3Var = (yg3) hiaVar;
                yg3Var.v(s49Var);
                yg3Var.w.remove(s49Var);
                yg3Var.A();
                View view = s49Var.a;
                if (view instanceof ue3) {
                    ((ue3) view).setMoving(false);
                } else if (view instanceof nj3) {
                    ((nj3) view).a = false;
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
