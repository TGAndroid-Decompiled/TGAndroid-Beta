package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u20 extends AnimatorListenerAdapter {
    public final byte a;
    public final i30 b;

    public u20(i30 i30Var, byte b) {
        this.a = b;
        this.b = i30Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.v2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        i30 i30Var = this.b;
        switch (b) {
            case 0:
                i30Var.f2 = false;
                return;
            case 1:
                i30Var.b2.setVisibility(4);
                i30Var.c2.setImageBitmap(null);
                i30Var.f2 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
