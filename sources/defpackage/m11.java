package defpackage;

import android.animation.ObjectAnimator;
public final class m11 implements p11 {
    public long a;

    public m11(k27 k27Var) {
        this.a = k27.B0(k27Var.k);
        k27Var.e1();
    }

    public final boolean a(rg6 rg6Var) {
        if (rg6Var.b == this.a && ah5.c(rg6Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final void f(q11 q11Var, b11 b11Var, nv0 nv0Var, i42 i42Var) {
        q11Var.setInOutOffset(q11Var.getMeasuredHeight());
        i42Var.accept(Float.valueOf(q11Var.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q11Var, q11.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(ls3.d);
        ofFloat.addListener(new u5(b11Var, nv0Var, false, (byte) 5));
        ofFloat.addUpdateListener(new pk(i42Var, q11Var, (byte) 5));
        ofFloat.start();
    }

    @Override
    public final void g(q11 q11Var, b11 b11Var, z01 z01Var, gw gwVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q11Var, q11.IN_OUT_OFFSET_Y2, q11Var.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(ls3.c);
        ofFloat.addListener(new u5(b11Var, z01Var, false, (byte) 6));
        ofFloat.addUpdateListener(new pk(gwVar, q11Var, (byte) 4));
        ofFloat.start();
    }
}
