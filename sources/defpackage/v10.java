package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v10 extends AnimatorListenerAdapter {
    public final byte a;
    public final j20 b;

    public v10(j20 j20Var, byte b) {
        this.a = b;
        this.b = j20Var;
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
        j20 j20Var = this.b;
        switch (b) {
            case 0:
                j20Var.f2 = false;
                return;
            case 1:
                j20Var.b2.setVisibility(4);
                j20Var.c2.setImageBitmap(null);
                j20Var.f2 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
