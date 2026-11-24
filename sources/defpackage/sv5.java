package defpackage;

import android.view.View;
public final class sv5 implements View.OnClickListener {
    public final byte a;
    public final rw5 b;

    public sv5(rw5 rw5Var, byte b) {
        this.a = b;
        this.b = rw5Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        rw5 rw5Var = this.b;
        switch (b) {
            case 0:
                if (rw5Var.J0) {
                    rw5Var.t0(null, true);
                    return;
                } else {
                    rw5Var.E0(0);
                    return;
                }
            case 1:
                int i = rw5Var.W0;
                rw5Var.E0(1);
                rw5Var.postDelayed(new wv5(rw5Var, (byte) 1), 350L);
                gw5 gw5Var = new gw5(rw5Var, rw5Var.getContext(), rw5Var.G1);
                rw5Var.Q1 = gw5Var;
                gw5Var.y1 = new zv5(rw5Var);
                gw5Var.J0(new z02(rw5Var, (byte) 4));
                gw5Var.setOnDismissListener(new bw5(rw5Var, gw5Var, i, (byte) 0));
                gw5Var.show();
                rw5Var.q0(true);
                return;
            case 2:
                rw5Var.g0();
                m8 m8Var = rw5Var.H1;
                if (m8Var != null && m8Var.isShowing()) {
                    rw5Var.H1.d(true);
                    return;
                }
                return;
            case 3:
                rw5Var.n0();
                return;
            default:
                rw5Var.E0(2);
                if (!(rw5Var.I0 instanceof vhb)) {
                    rw5Var.f0(true);
                    return;
                }
                return;
        }
    }
}
