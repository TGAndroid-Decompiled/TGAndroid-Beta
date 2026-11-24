package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ps5 implements RequestDelegate {
    public final byte a;
    public final rs5 b;

    public ps5(rs5 rs5Var, byte b) {
        this.a = b;
        this.b = rs5Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        rs5 rs5Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new if4(rs5Var, tL_error, tLObject, (byte) 28));
                return;
            default:
                gm.c3(new fd5(rs5Var, tL_error, (byte) 15));
                return;
        }
    }
}
