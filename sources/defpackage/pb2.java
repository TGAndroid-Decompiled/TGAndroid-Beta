package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pb2 extends AnimatorListenerAdapter {
    public final rc2 a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final wb2 f;

    public pb2(wb2 wb2Var, rc2 rc2Var, float f, float f2, float f3, float f4) {
        this.f = wb2Var;
        this.a = rc2Var;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        rc2 rc2Var = this.a;
        rc2Var.getTransitionParams().e();
        rc2Var.getPhotoImage().i0(this.b, this.c, this.d, this.e);
        ua2 ua2Var = this.f.P;
        if (ua2Var != null) {
            ua2Var.h.setAlpha(1.0f);
        }
        rc2Var.invalidate();
    }
}
