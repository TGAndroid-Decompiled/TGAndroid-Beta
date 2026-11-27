package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r84 extends AnimatorListenerAdapter {
    public final byte a;
    public final float b;
    public final float c;
    public final Object d;

    public r84(Object obj, float f, float f2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = f;
        this.c = f2;
    }

    public final void a() {
        t84 t84Var = (t84) this.d;
        if (t84Var.h) {
            t84Var.d(this.b + this.c, 1.0f);
            if (t84Var.h) {
                t84Var.h = false;
            }
            t84Var.b.v0(t84Var.f, t84Var.a);
        }
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                ujc ujcVar = (ujc) this.d;
                ujcVar.P = false;
                ujcVar.N = true;
                ujcVar.a0 = this.b;
                ujcVar.b0 = this.c;
                ujcVar.requestLayout();
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

    private final void b(Animator animator) {
    }
}
