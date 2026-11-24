package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ea2 extends AnimatorListenerAdapter {
    public final gb2 a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final la2 f;

    public ea2(la2 la2Var, gb2 gb2Var, float f, float f2, float f3, float f4) {
        this.f = la2Var;
        this.a = gb2Var;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        gb2 gb2Var = this.a;
        gb2Var.getTransitionParams().e();
        gb2Var.getPhotoImage().i0(this.b, this.c, this.d, this.e);
        i92 i92Var = this.f.P;
        if (i92Var != null) {
            i92Var.h.setAlpha(1.0f);
        }
        gb2Var.invalidate();
    }
}
