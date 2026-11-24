package defpackage;

import android.view.View;
public final class am1 implements View.OnLongClickListener {
    public final byte a;
    public final mu1 b;

    public am1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        k27 k27Var;
        k27 k27Var2;
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                k27 k27Var3 = mu1Var.v5;
                if (k27Var3 == null) {
                    return false;
                }
                if (gl.g(k27Var3.T0)) {
                    new u21(f11.a(mu1Var.getParentActivity()), mu1Var.Ba).k(false).j();
                }
                return true;
            case 1:
                return mu1Var.C9();
            default:
                mu1 mu1Var2 = this.b;
                byte b2 = mu1Var2.Sb;
                if (b2 == 1 && (k27Var2 = mu1Var2.H5) != null) {
                    mu1Var2.J(k27Var2.e1(), 0, 0, 0, true, true);
                } else if (mu1Var2.x5 == null || b2 != 2 || (k27Var = mu1Var2.F5) == null) {
                    return false;
                } else {
                    mu1Var2.J(k27Var.e1(), 0, 0, 0, true, true);
                }
                return true;
        }
    }
}
