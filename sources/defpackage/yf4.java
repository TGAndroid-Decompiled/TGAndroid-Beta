package defpackage;

import android.graphics.RectF;
import android.view.View;
public final class yf4 implements g59, h59 {
    public final ig4 a;

    public yf4(ig4 ig4Var) {
        this.a = ig4Var;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        ig4 ig4Var = this.a;
        dg4 dg4Var = ig4Var.K;
        if (!((dk3) dg4Var).b.l2) {
            gg4 gg4Var = (gg4) view;
            if (ig4Var.n) {
                if (i != 0) {
                    int L = gm.L(6.0f);
                    RectF rectF = gg4Var.f;
                    float f3 = L;
                    if (rectF.left - f3 < f && rectF.right + f3 > f) {
                        dk3 dk3Var = (dk3) ig4Var.K;
                        dk3Var.d((ub7) dk3Var.b.getMessagesController().S0().get(gg4Var.b.a));
                    }
                }
            } else if (i == ig4Var.L && dg4Var != null) {
                ((dk3) dg4Var).b.R4(true, false);
            } else {
                ig4Var.g(gg4Var.b, i);
            }
        }
    }

    @Override
    public final boolean g(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yf4.g(int, android.view.View):boolean");
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    @Override
    public final void p(View view, float f, float f2) {
    }
}
