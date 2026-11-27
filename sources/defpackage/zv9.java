package defpackage;

import android.view.View;
public final class zv9 implements View.OnClickListener {
    public final ox0 a;

    public zv9(ox0 ox0Var) {
        this.a = ox0Var;
    }

    @Override
    public final void onClick(View view) {
        aw9 aw9Var = (aw9) this.a.d;
        for (int i = 0; i < aw9Var.e.size(); i++) {
            r47 r47Var = (r47) aw9Var.e.get(i);
            boolean z = aw9Var.I;
            int i2 = yac.t0;
            if (z) {
                xb4.G(k5.a(i2).a).f(r47Var.F0());
            } else {
                xb4.G(k5.a(i2).a).X(r47Var.F0(), r47Var, 0, 0);
                lq3.q(aw9Var.d).y();
            }
        }
        aw9Var.d(true);
    }
}
