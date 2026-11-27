package defpackage;

import android.animation.ObjectAnimator;
public final class v11 implements y11 {
    public long a;

    public v11(r47 r47Var) {
        this.a = r47.B0(r47Var.k);
        r47Var.e1();
    }

    public final boolean a(wi6 wi6Var) {
        if (wi6Var.b == this.a && cj5.c(wi6Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(z11 z11Var, j11 j11Var, fv0 fv0Var, y42 y42Var) {
        z11Var.setInOutOffset(z11Var.getMeasuredHeight());
        y42Var.accept(Float.valueOf(z11Var.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z11Var, z11.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(dt3.d);
        ofFloat.addListener(new v5(j11Var, fv0Var, false, (byte) 5));
        ofFloat.addUpdateListener(new lk(y42Var, z11Var, (byte) 5));
        ofFloat.start();
    }

    @Override
    public final void q(z11 z11Var, j11 j11Var, k11 k11Var, hw hwVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z11Var, z11.IN_OUT_OFFSET_Y2, z11Var.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(dt3.c);
        ofFloat.addListener(new v5(j11Var, k11Var, false, (byte) 6));
        ofFloat.addUpdateListener(new lk(hwVar, z11Var, (byte) 4));
        ofFloat.start();
    }
}
