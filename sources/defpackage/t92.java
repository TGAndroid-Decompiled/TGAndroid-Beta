package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t92 implements RequestDelegate {
    public final byte a;
    public final ba2 b;

    public t92(ba2 ba2Var, byte b) {
        this.a = b;
        this.b = ba2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        ba2 ba2Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new co1(ba2Var, tL_error, tLObject, (byte) 15));
                return;
            case 1:
                gm.c3(new v92(ba2Var, (byte) 1));
                return;
            default:
                ba2Var.getClass();
                gm.c3(new v92(ba2Var, (byte) 4));
                return;
        }
    }
}
