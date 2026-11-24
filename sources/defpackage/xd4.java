package defpackage;

import android.graphics.RectF;
import android.view.View;
public final class xd4 implements d39, e39 {
    public final he4 a;

    public xd4(he4 he4Var) {
        this.a = he4Var;
    }

    @Override
    public final boolean d(int r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd4.d(int, android.view.View):boolean");
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        he4 he4Var = this.a;
        ce4 ce4Var = he4Var.K;
        if (!((ti3) ce4Var).b.l2) {
            fe4 fe4Var = (fe4) view;
            if (he4Var.n) {
                if (i != 0) {
                    int L = gl.L(6.0f);
                    RectF rectF = fe4Var.f;
                    float f3 = L;
                    if (rectF.left - f3 < f && rectF.right + f3 > f) {
                        ti3 ti3Var = (ti3) he4Var.K;
                        ti3Var.d((t97) ti3Var.b.getMessagesController().R0().get(fe4Var.b.a));
                    }
                }
            } else if (i == he4Var.L && ce4Var != null) {
                ((ti3) ce4Var).b.N4(true, false);
            } else {
                he4Var.g(fe4Var.b, i);
            }
        }
    }

    @Override
    public final boolean q(View view) {
        return false;
    }

    @Override
    public final void l(View view, float f, float f2) {
    }
}
