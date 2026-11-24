package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jj6 implements RequestDelegate {
    public final byte a;
    public final ak6 b;

    public jj6(ak6 ak6Var, byte b) {
        this.a = b;
        this.b = ak6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        ak6 ak6Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new pj6(ak6Var, tL_error, tLObject, (byte) 0));
                return;
            default:
                gm.c3(new lj6(ak6Var, tL_error, (byte) 0));
                return;
        }
    }
}
