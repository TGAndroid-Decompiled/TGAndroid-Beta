package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f94 extends AnimatorListenerAdapter {
    public final byte a;
    public final float b;
    public final float c;
    public final Object d;

    public f94(Object obj, float f, float f2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = f;
        this.c = f2;
    }

    public final void a() {
        h94 h94Var = (h94) this.d;
        if (h94Var.h) {
            h94Var.d(this.b + this.c, 1.0f);
            if (h94Var.h) {
                h94Var.h = false;
            }
            h94Var.b.V(h94Var.f, h94Var.a);
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
                phc phcVar = (phc) this.d;
                phcVar.P = false;
                phcVar.N = true;
                phcVar.a0 = this.b;
                phcVar.b0 = this.c;
                phcVar.requestLayout();
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
