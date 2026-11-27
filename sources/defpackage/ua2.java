package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ua2 extends AnimatorListenerAdapter {
    public final wb2 a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final bb2 f;

    public ua2(bb2 bb2Var, wb2 wb2Var, float f, float f2, float f3, float f4) {
        this.f = bb2Var;
        this.a = wb2Var;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        wb2 wb2Var = this.a;
        wb2Var.getTransitionParams().e();
        wb2Var.getPhotoImage().i0(this.b, this.c, this.d, this.e);
        y92 y92Var = this.f.P;
        if (y92Var != null) {
            y92Var.h.setAlpha(1.0f);
        }
        wb2Var.invalidate();
    }
}
