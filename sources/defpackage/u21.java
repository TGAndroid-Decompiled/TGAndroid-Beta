package defpackage;

import android.animation.ObjectAnimator;
public final class u21 implements x21 {
    public long a;

    public u21(k47 k47Var) {
        this.a = k47.B0(k47Var.k);
        k47Var.e1();
    }

    public final boolean a(si6 si6Var) {
        if (si6Var.b == this.a && zi5.c(si6Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final void b0(y21 y21Var, j21 j21Var, h21 h21Var, gx gxVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y21Var, y21.IN_OUT_OFFSET_Y2, y21Var.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(vt3.c);
        ofFloat.addListener(new u5(j21Var, h21Var, false, (byte) 6));
        ofFloat.addUpdateListener(new pl(gxVar, y21Var, (byte) 4));
        ofFloat.start();
    }

    @Override
    public final void g0(y21 y21Var, j21 j21Var, yt0 yt0Var, t52 t52Var) {
        y21Var.setInOutOffset(y21Var.getMeasuredHeight());
        t52Var.accept(Float.valueOf(y21Var.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y21Var, y21.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(vt3.d);
        ofFloat.addListener(new u5(j21Var, yt0Var, false, (byte) 5));
        ofFloat.addUpdateListener(new pl(t52Var, y21Var, (byte) 5));
        ofFloat.start();
    }
}
