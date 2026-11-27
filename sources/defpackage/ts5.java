package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ts5 implements RequestDelegate {
    public final byte a;
    public final vs5 b;

    public ts5(vs5 vs5Var, byte b) {
        this.a = b;
        this.b = vs5Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        vs5 vs5Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new ls5(vs5Var, tL_error, tLObject, (byte) 1));
                return;
            default:
                hl.c3(new tg5(vs5Var, tL_error, (byte) 11));
                return;
        }
    }
}
