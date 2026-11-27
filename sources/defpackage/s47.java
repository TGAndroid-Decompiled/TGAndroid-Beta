package defpackage;

import org.telegram.tgnet.TLRPC;
public final class s47 extends r47 {
    public final byte u3;
    public final v47 v3;

    public s47(v47 v47Var, int i, TLRPC.TL_message tL_message, int i2) {
        super(i, tL_message, true, false);
        this.v3 = v47Var;
        this.u3 = i2;
    }

    @Override
    public final boolean m5() {
        if (this.v3.k) {
            return false;
        }
        return super.m5();
    }

    @Override
    public final void n0(TLRPC.User user) {
        super.n0(user);
        if (this.u3 == 2) {
            this.v3.b(this);
        }
    }
}
