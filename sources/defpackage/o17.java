package defpackage;

import org.telegram.tgnet.TLRPC;
public final class o17 extends yp {
    public final u17 c;

    public o17(u17 u17Var) {
        this.c = u17Var;
    }

    @Override
    public final int i(int i) {
        u17 u17Var = this.c;
        k17 k17Var = u17Var.f;
        if (i != 0) {
            int i2 = i - 1;
            Object J = k17Var.J(i2);
            if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                return 100;
            }
            if (J instanceof TLRPC.Document) {
                return 20;
            }
            if (k17Var.I() != null || k17Var.V != null) {
                i = i2;
            }
            n17 n17Var = u17Var.d;
            n17Var.z1();
            return n17Var.R.get(i);
        }
        return 100;
    }
}
