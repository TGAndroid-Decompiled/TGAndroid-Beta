package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zh1 implements RequestDelegate {
    public final byte a;
    public final gi1 b;

    public zh1(gi1 gi1Var, byte b) {
        this.a = b;
        this.b = gi1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        gi1 gi1Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new z21(gi1Var, tLObject, (byte) 26));
                return;
            case 1:
                hl.c3(new z21(gi1Var, tL_error, (byte) 25));
                return;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    hl.c3(new xh1(gi1Var, (byte) 3));
                    return;
                }
                return;
            default:
                hl.c3(new tu0(gi1Var, tL_error, tLObject, (byte) 20));
                return;
        }
    }
}
