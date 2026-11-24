package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u10 extends AnimatorListenerAdapter {
    public final byte a;
    public final i20 b;

    public u10(i20 i20Var, byte b) {
        this.a = b;
        this.b = i20Var;
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
        i20 i20Var = this.b;
        switch (b) {
            case 0:
                i20Var.f2 = false;
                return;
            case 1:
                i20Var.b2.setVisibility(4);
                i20Var.c2.setImageBitmap(null);
                i20Var.f2 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
