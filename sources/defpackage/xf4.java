package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
public final class xf4 extends zb3 {
    public final fg4 F;

    public xf4(fg4 fg4Var) {
        this.F = fg4Var;
    }

    @Override
    public final void C(f89 f89Var, yb3 yb3Var) {
        super.C(f89Var, yb3Var);
        View view = f89Var.a;
        if (view instanceof dg4) {
            dg4 dg4Var = (dg4) view;
            if (dg4Var.x) {
                ValueAnimator valueAnimator = dg4Var.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    dg4Var.a.removeAllUpdateListeners();
                    dg4Var.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new wf4(dg4Var, (byte) 0));
                ofFloat.addListener(new cn2(dg4Var, (byte) 21));
                dg4Var.a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(f89 f89Var) {
        super.f(f89Var);
        View view = f89Var.a;
        view.setTranslationX(0.0f);
        if (view instanceof dg4) {
            ((dg4) view).a();
        }
    }

    @Override
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new az1(this, (byte) 29));
            ofFloat.setDuration(this.e);
            ofFloat.start();
        }
        super.m();
    }

    @Override
    public final boolean r(defpackage.f89 r34, defpackage.l09 r35, int r36, int r37, int r38, int r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf4.r(f89, l09, int, int, int, int):boolean");
    }

    @Override
    public final void x(f89 f89Var) {
        f89Var.a.setTranslationX(0.0f);
        View view = f89Var.a;
        if (view instanceof dg4) {
            ((dg4) view).a();
        }
    }
}
