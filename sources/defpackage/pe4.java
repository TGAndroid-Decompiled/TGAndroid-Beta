package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pe4 implements RequestDelegate {
    public final byte a;
    public final nf4 b;

    public pe4(nf4 nf4Var, byte b) {
        this.a = b;
        this.b = nf4Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        nf4 nf4Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new vx3(nf4Var, tLObject, (byte) 28));
                return;
            default:
                nf4Var.getClass();
                hl.c3(new re4((Object) nf4Var, (Object) tL_error, (Object) tLObject, (byte) 0));
                return;
        }
    }
}
