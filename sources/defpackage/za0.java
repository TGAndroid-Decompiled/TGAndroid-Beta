package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class za0 extends AnimatorListenerAdapter {
    public final byte a;
    public final mb0 b;

    public za0(mb0 mb0Var, byte b) {
        this.a = b;
        this.b = mb0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        byte b = this.a;
        mb0 mb0Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                mb0Var.f = false;
                return;
            default:
                if (mb0Var.G) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                mb0Var.m0(false, f);
                mb0Var.G = false;
                return;
        }
    }
}
