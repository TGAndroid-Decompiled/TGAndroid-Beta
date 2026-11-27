package defpackage;
public final class ti0 implements cr7 {
    public final byte a;
    public final bj0 b;

    public ti0(bj0 bj0Var, byte b) {
        this.a = b;
        this.b = bj0Var;
    }

    @Override
    public final void S0(Object obj) {
        byte b = this.a;
        String str = null;
        bj0 bj0Var = this.b;
        switch (b) {
            case 0:
                gj0 gj0Var = (gj0) obj;
                if (gj0Var != null) {
                    bj0Var.W(gj0Var);
                    mj0 mj0Var = bj0Var.m0;
                    qj7 qj7Var = mj0Var.p;
                    if (qj7Var == null) {
                        qj7Var = new qj7();
                        mj0Var.p = qj7Var;
                    }
                    mj0.f(qj7Var, null);
                    return;
                }
                return;
            default:
                if (((Boolean) obj).booleanValue()) {
                    if (bj0Var.R()) {
                        bj0Var.T();
                    } else {
                        mj0 mj0Var2 = bj0Var.m0;
                        String str2 = mj0Var2.i;
                        if (str2 != null) {
                            str = str2;
                        } else {
                            ij0 ij0Var = mj0Var2.d;
                            if (ij0Var != null && (str = ij0Var.c) == null) {
                                str = "";
                            }
                        }
                        if (str == null) {
                            str = bj0Var.q(2131689578);
                        }
                        bj0Var.U(13, str);
                        bj0Var.O(2);
                    }
                    bj0Var.m0.e(false);
                    return;
                }
                return;
        }
    }
}
