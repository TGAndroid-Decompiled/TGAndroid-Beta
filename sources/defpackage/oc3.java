package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class oc3 extends AnimatorListenerAdapter {
    public final byte a;
    public final u69 b;
    public final int c;
    public final View d;
    public final int e;
    public final ViewPropertyAnimator f;
    public final jka h;

    public oc3(jka jkaVar, u69 u69Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator, byte b) {
        this.a = b;
        this.h = jkaVar;
        this.b = u69Var;
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
                if (view2 instanceof hg3) {
                    ((hg3) view2).setMoving(false);
                    return;
                } else if (view2 instanceof yk3) {
                    ((yk3) view2).a = false;
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        u69 u69Var = this.b;
        jka jkaVar = this.h;
        ViewPropertyAnimator viewPropertyAnimator = this.f;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                sc3 sc3Var = (sc3) jkaVar;
                sc3Var.P(u69Var);
                sc3Var.v(u69Var);
                sc3Var.z.remove(u69Var);
                sc3Var.G();
                sc3Var.z(u69Var);
                return;
            default:
                viewPropertyAnimator.setListener(null);
                ki3 ki3Var = (ki3) jkaVar;
                ki3Var.v(u69Var);
                ki3Var.w.remove(u69Var);
                ki3Var.A();
                View view = u69Var.a;
                if (view instanceof hg3) {
                    ((hg3) view).setMoving(false);
                } else if (view instanceof yk3) {
                    ((yk3) view).a = false;
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
