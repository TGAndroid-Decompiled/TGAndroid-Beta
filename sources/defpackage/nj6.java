package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nj6 implements RequestDelegate {
    public final byte a;
    public final ck6 b;

    public nj6(ck6 ck6Var, byte b) {
        this.a = b;
        this.b = ck6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        ck6 ck6Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new z56(ck6Var, tL_error, (byte) 26));
                return;
            default:
                hl.c3(new mj6(ck6Var, tL_error, tLObject, (byte) 1));
                return;
        }
    }
}
