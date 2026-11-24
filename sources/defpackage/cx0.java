package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class cx0 extends AnimatorListenerAdapter {
    public final byte a;
    public final dx0 b;

    public cx0(dx0 dx0Var, byte b) {
        this.a = b;
        this.b = dx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        dx0 dx0Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = dx0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dx0Var.h = null;
                }
                kk7.e().k(99, 512);
                return;
            case 1:
                dx0Var.E = 0.0f;
                fx0 fx0Var = dx0Var.H;
                fx0Var.b.setTranslationX(0.0f);
                fx0Var.c.invalidate();
                return;
            case 2:
                fx0 fx0Var2 = dx0Var.H;
                fx0Var2.O0 = true;
                fx0Var2.b.setTranslationX(dx0Var.getMeasuredWidth());
                fx0Var2.dismiss();
                fx0Var2.c.invalidate();
                return;
            default:
                fx0 fx0Var3 = dx0Var.H;
                fx0Var3.b.setTranslationY(0.0f);
                fx0Var3.e0();
                fx0Var3.n0(fx0Var3.b.getTranslationY());
                dx0Var.invalidate();
                return;
        }
    }
}
