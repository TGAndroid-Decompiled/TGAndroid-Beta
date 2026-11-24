package defpackage;
public final class sj0 implements fq7 {
    public final byte a;
    public final ak0 b;

    public sj0(ak0 ak0Var, byte b) {
        this.a = b;
        this.b = ak0Var;
    }

    @Override
    public final void j1(Object obj) {
        byte b = this.a;
        String str = null;
        ak0 ak0Var = this.b;
        switch (b) {
            case 0:
                fk0 fk0Var = (fk0) obj;
                if (fk0Var != null) {
                    ak0Var.W(fk0Var);
                    lk0 lk0Var = ak0Var.m0;
                    kj7 kj7Var = lk0Var.p;
                    if (kj7Var == null) {
                        kj7Var = new kj7();
                        lk0Var.p = kj7Var;
                    }
                    lk0.f(kj7Var, null);
                    return;
                }
                return;
            default:
                if (((Boolean) obj).booleanValue()) {
                    if (ak0Var.R()) {
                        ak0Var.T();
                    } else {
                        lk0 lk0Var2 = ak0Var.m0;
                        String str2 = lk0Var2.i;
                        if (str2 != null) {
                            str = str2;
                        } else {
                            hk0 hk0Var = lk0Var2.d;
                            if (hk0Var != null && (str = hk0Var.c) == null) {
                                str = "";
                            }
                        }
                        if (str == null) {
                            str = ak0Var.q(2131689578);
                        }
                        ak0Var.U(13, str);
                        ak0Var.O(2);
                    }
                    ak0Var.m0.e(false);
                    return;
                }
                return;
        }
    }
}
