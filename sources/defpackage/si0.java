package defpackage;
public final class si0 implements co7 {
    public final byte a;
    public final aj0 b;

    public si0(aj0 aj0Var, byte b) {
        this.a = b;
        this.b = aj0Var;
    }

    @Override
    public final void D2(Object obj) {
        byte b = this.a;
        String str = null;
        aj0 aj0Var = this.b;
        switch (b) {
            case 0:
                fj0 fj0Var = (fj0) obj;
                if (fj0Var != null) {
                    aj0Var.W(fj0Var);
                    lj0 lj0Var = aj0Var.m0;
                    hh7 hh7Var = lj0Var.p;
                    if (hh7Var == null) {
                        hh7Var = new hh7();
                        lj0Var.p = hh7Var;
                    }
                    lj0.f(hh7Var, null);
                    return;
                }
                return;
            default:
                if (((Boolean) obj).booleanValue()) {
                    if (aj0Var.R()) {
                        aj0Var.T();
                    } else {
                        lj0 lj0Var2 = aj0Var.m0;
                        String str2 = lj0Var2.i;
                        if (str2 != null) {
                            str = str2;
                        } else {
                            hj0 hj0Var = lj0Var2.d;
                            if (hj0Var != null && (str = hj0Var.c) == null) {
                                str = "";
                            }
                        }
                        if (str == null) {
                            str = aj0Var.q(2131689578);
                        }
                        aj0Var.U(13, str);
                        aj0Var.O(2);
                    }
                    aj0Var.m0.e(false);
                    return;
                }
                return;
        }
    }
}
