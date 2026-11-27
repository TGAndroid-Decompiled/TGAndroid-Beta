package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class kx0 extends AnimatorListenerAdapter {
    public final byte a;
    public final lx0 b;

    public kx0(lx0 lx0Var, byte b) {
        this.a = b;
        this.b = lx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        lx0 lx0Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = lx0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lx0Var.h = null;
                }
                jn7.e().k(100, 512);
                return;
            case 1:
                lx0Var.E = 0.0f;
                nx0 nx0Var = lx0Var.H;
                nx0Var.b.setTranslationX(0.0f);
                nx0Var.c.invalidate();
                return;
            case 2:
                nx0 nx0Var2 = lx0Var.H;
                nx0Var2.O0 = true;
                nx0Var2.b.setTranslationX(lx0Var.getMeasuredWidth());
                nx0Var2.dismiss();
                nx0Var2.c.invalidate();
                return;
            default:
                nx0 nx0Var3 = lx0Var.H;
                nx0Var3.b.setTranslationY(0.0f);
                nx0Var3.e0();
                nx0Var3.n0(nx0Var3.b.getTranslationY());
                lx0Var.invalidate();
                return;
        }
    }
}
