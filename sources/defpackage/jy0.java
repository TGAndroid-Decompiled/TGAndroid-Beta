package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class jy0 extends AnimatorListenerAdapter {
    public final byte a;
    public final ky0 b;

    public jy0(ky0 ky0Var, byte b) {
        this.a = b;
        this.b = ky0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ky0 ky0Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = ky0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ky0Var.h = null;
                }
                nm7.e().k(100, 512);
                return;
            case 1:
                ky0Var.E = 0.0f;
                my0 my0Var = ky0Var.H;
                my0Var.b.setTranslationX(0.0f);
                my0Var.c.invalidate();
                return;
            case 2:
                my0 my0Var2 = ky0Var.H;
                my0Var2.O0 = true;
                my0Var2.b.setTranslationX(ky0Var.getMeasuredWidth());
                my0Var2.dismiss();
                my0Var2.c.invalidate();
                return;
            default:
                my0 my0Var3 = ky0Var.H;
                my0Var3.b.setTranslationY(0.0f);
                my0Var3.e0();
                my0Var3.n0(my0Var3.b.getTranslationY());
                ky0Var.invalidate();
                return;
        }
    }
}
