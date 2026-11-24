package defpackage;

import org.telegram.tgnet.TLRPC;
public final class oz6 extends yo {
    public final uz6 c;

    public oz6(uz6 uz6Var) {
        this.c = uz6Var;
    }

    @Override
    public final int i(int i) {
        uz6 uz6Var = this.c;
        kz6 kz6Var = uz6Var.f;
        if (i != 0) {
            int i2 = i - 1;
            Object J = kz6Var.J(i2);
            if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                return 100;
            }
            if (J instanceof TLRPC.Document) {
                return 20;
            }
            if (kz6Var.I() != null || kz6Var.V != null) {
                i = i2;
            }
            nz6 nz6Var = uz6Var.d;
            nz6Var.z1();
            return nz6Var.R.get(i);
        }
        return 100;
    }
}
