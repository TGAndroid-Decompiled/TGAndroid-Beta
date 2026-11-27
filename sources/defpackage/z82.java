package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z82 implements RequestDelegate {
    public final byte a;
    public final g92 b;

    public z82(g92 g92Var, byte b) {
        this.a = b;
        this.b = g92Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        g92 g92Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new on1(g92Var, tL_error, tLObject));
                return;
            case 1:
                hl.c3(new b92(g92Var, (byte) 1));
                return;
            default:
                g92Var.getClass();
                hl.c3(new b92(g92Var, (byte) 4));
                return;
        }
    }
}
