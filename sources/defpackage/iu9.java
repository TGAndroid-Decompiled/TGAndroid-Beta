package defpackage;

import android.view.View;
public final class iu9 implements View.OnClickListener {
    public final ny0 a;

    public iu9(ny0 ny0Var) {
        this.a = ny0Var;
    }

    @Override
    public final void onClick(View view) {
        ju9 ju9Var = (ju9) this.a.d;
        for (int i = 0; i < ju9Var.e.size(); i++) {
            k47 k47Var = (k47) ju9Var.e.get(i);
            boolean z = ju9Var.I;
            int i2 = z8c.t0;
            if (z) {
                bc4.G(j5.a(i2).a).f(k47Var.F0());
            } else {
                bc4.G(j5.a(i2).a).X(k47Var.F0(), k47Var, 0, 0);
                er3.q(ju9Var.d).y();
            }
        }
        ju9Var.d(true);
    }
}
