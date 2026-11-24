package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
public final class ag4 extends sc3 {
    public final ig4 F;

    public ag4(ig4 ig4Var) {
        this.F = ig4Var;
    }

    @Override
    public final void C(u69 u69Var, rc3 rc3Var) {
        super.C(u69Var, rc3Var);
        View view = u69Var.a;
        if (view instanceof gg4) {
            gg4 gg4Var = (gg4) view;
            if (gg4Var.x) {
                ValueAnimator valueAnimator = gg4Var.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    gg4Var.a.removeAllUpdateListeners();
                    gg4Var.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new zf4(gg4Var, (byte) 0));
                ofFloat.addListener(new kh2(gg4Var, (byte) 23));
                gg4Var.a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(u69 u69Var) {
        super.f(u69Var);
        View view = u69Var.a;
        view.setTranslationX(0.0f);
        if (view instanceof gg4) {
            ((gg4) view).a();
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
            ofFloat.addUpdateListener(new et1(this, (byte) 29));
            ofFloat.setDuration(this.e);
            ofFloat.start();
        }
        super.m();
    }

    @Override
    public final boolean r(defpackage.u69 r34, defpackage.az8 r35, int r36, int r37, int r38, int r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ag4.r(u69, az8, int, int, int, int):boolean");
    }

    @Override
    public final void x(u69 u69Var) {
        u69Var.a.setTranslationX(0.0f);
        View view = u69Var.a;
        if (view instanceof gg4) {
            ((gg4) view).a();
        }
    }
}
