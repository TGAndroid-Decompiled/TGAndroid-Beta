package defpackage;

import android.view.View;
public final class xx5 implements View.OnClickListener {
    public final byte a;
    public final wy5 b;

    public xx5(wy5 wy5Var, byte b) {
        this.a = b;
        this.b = wy5Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        wy5 wy5Var = this.b;
        switch (b) {
            case 0:
                if (wy5Var.D0) {
                    wy5Var.t0(null, true);
                    return;
                } else {
                    wy5Var.E0(0);
                    return;
                }
            case 1:
                int i = wy5Var.Q0;
                wy5Var.E0(1);
                wy5Var.postDelayed(new by5(wy5Var, (byte) 1), 350L);
                ly5 ly5Var = new ly5(wy5Var, wy5Var.getContext(), wy5Var.A1);
                wy5Var.K1 = ly5Var;
                ly5Var.y1 = new ey5(wy5Var);
                ly5Var.K0(new p12(wy5Var, (byte) 4));
                ly5Var.setOnDismissListener(new gy5(wy5Var, ly5Var, i, (byte) 0));
                ly5Var.show();
                wy5Var.q0(true);
                return;
            case 2:
                wy5Var.g0();
                n8 n8Var = wy5Var.B1;
                if (n8Var != null && n8Var.isShowing()) {
                    wy5Var.B1.d(true);
                    return;
                }
                return;
            case 3:
                wy5Var.n0();
                return;
            default:
                wy5Var.E0(2);
                if (!(wy5Var.C0 instanceof rlb)) {
                    wy5Var.f0(true);
                    return;
                }
                return;
        }
    }
}
