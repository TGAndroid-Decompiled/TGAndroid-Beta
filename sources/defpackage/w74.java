package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w74 extends AnimatorListenerAdapter {
    public final byte a;
    public final float b;
    public final float c;
    public final Object d;

    public w74(Object obj, float f, float f2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = f;
        this.c = f2;
    }

    public final void a() {
        y74 y74Var = (y74) this.d;
        if (y74Var.h) {
            y74Var.d(this.b + this.c, 1.0f);
            if (y74Var.h) {
                y74Var.h = false;
            }
            y74Var.b.D(y74Var.f, y74Var.a);
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
                pfc pfcVar = (pfc) this.d;
                pfcVar.P = false;
                pfcVar.N = true;
                pfcVar.a0 = this.b;
                pfcVar.b0 = this.c;
                pfcVar.requestLayout();
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
