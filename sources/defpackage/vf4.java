package defpackage;

import android.graphics.RectF;
import android.view.View;
public final class vf4 implements s69, t69 {
    public final fg4 a;

    public vf4(fg4 fg4Var) {
        this.a = fg4Var;
    }

    @Override
    public final boolean C(View view) {
        return false;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        ag4 ag4Var;
        fg4 fg4Var = this.a;
        if (fg4Var.K.b()) {
            dg4 dg4Var = (dg4) view;
            if (fg4Var.n) {
                if (i != 0) {
                    int L = hl.L(6.0f);
                    RectF rectF = dg4Var.f;
                    float f3 = L;
                    if (rectF.left - f3 < f && rectF.right + f3 > f) {
                        fg4Var.K.l(dg4Var.b.a);
                    }
                }
            } else if (i == fg4Var.L && (ag4Var = fg4Var.K) != null) {
                ag4Var.e();
            } else {
                fg4Var.i(dg4Var.b, i);
            }
        }
    }

    @Override
    public final boolean e(int i, View view) {
        fg4 fg4Var = this.a;
        if (fg4Var.K.b() && !fg4Var.n && fg4Var.K.g((dg4) view)) {
            fg4Var.G.f1(true);
            return true;
        }
        return false;
    }

    @Override
    public final void u(View view, float f, float f2) {
    }
}
