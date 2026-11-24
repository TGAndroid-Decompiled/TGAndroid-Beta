package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zb0 extends AnimatorListenerAdapter {
    public final byte a;
    public final mc0 b;

    public zb0(mc0 mc0Var, byte b) {
        this.a = b;
        this.b = mc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        byte b = this.a;
        mc0 mc0Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                mc0Var.f = false;
                return;
            default:
                if (mc0Var.G) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                mc0Var.n0(false, f);
                mc0Var.G = false;
                return;
        }
    }
}
