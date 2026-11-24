package defpackage;

import android.view.View;
public final class sx5 implements View.OnClickListener {
    public final byte a;
    public final ry5 b;

    public sx5(ry5 ry5Var, byte b) {
        this.a = b;
        this.b = ry5Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        ry5 ry5Var = this.b;
        switch (b) {
            case 0:
                if (ry5Var.J0) {
                    ry5Var.t0(null, true);
                    return;
                } else {
                    ry5Var.E0(0);
                    return;
                }
            case 1:
                int i = ry5Var.W0;
                ry5Var.E0(1);
                ry5Var.postDelayed(new wx5(ry5Var, (byte) 1), 350L);
                gy5 gy5Var = new gy5(ry5Var, ry5Var.getContext(), ry5Var.G1);
                ry5Var.Q1 = gy5Var;
                gy5Var.y1 = new zx5(ry5Var);
                gy5Var.J0(new k22(ry5Var, (byte) 4));
                gy5Var.setOnDismissListener(new by5(ry5Var, gy5Var, i, (byte) 0));
                gy5Var.show();
                ry5Var.q0(true);
                return;
            case 2:
                ry5Var.g0();
                m8 m8Var = ry5Var.H1;
                if (m8Var != null && m8Var.isShowing()) {
                    ry5Var.H1.d(true);
                    return;
                }
                return;
            case 3:
                ry5Var.n0();
                return;
            default:
                ry5Var.E0(2);
                if (!(ry5Var.I0 instanceof xjb)) {
                    ry5Var.f0(true);
                    return;
                }
                return;
        }
    }
}
