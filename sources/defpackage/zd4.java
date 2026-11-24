package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
public final class zd4 extends gb3 {
    public final he4 F;

    public zd4(he4 he4Var) {
        this.F = he4Var;
    }

    @Override
    public final void C(s49 s49Var, fb3 fb3Var) {
        super.C(s49Var, fb3Var);
        View view = s49Var.a;
        if (view instanceof fe4) {
            fe4 fe4Var = (fe4) view;
            if (fe4Var.x) {
                ValueAnimator valueAnimator = fe4Var.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    fe4Var.a.removeAllUpdateListeners();
                    fe4Var.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new yd4(fe4Var, (byte) 0));
                ofFloat.addListener(new im2(fe4Var, (byte) 21));
                fe4Var.a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override
    public final void f(s49 s49Var) {
        super.f(s49Var);
        View view = s49Var.a;
        view.setTranslationX(0.0f);
        if (view instanceof fe4) {
            ((fe4) view).a();
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
            ofFloat.addUpdateListener(new uz1(this, (byte) 27));
            ofFloat.setDuration(this.e);
            ofFloat.start();
        }
        super.m();
    }

    @Override
    public final boolean r(defpackage.s49 r23, defpackage.zw8 r24, int r25, int r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zd4.r(s49, zw8, int, int, int, int):boolean");
    }

    @Override
    public final void x(s49 s49Var) {
        s49Var.a.setTranslationX(0.0f);
        View view = s49Var.a;
        if (view instanceof fe4) {
            ((fe4) view).a();
        }
    }
}
