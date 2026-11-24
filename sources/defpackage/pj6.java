package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj6 implements Runnable {
    public final byte a;
    public final ak6 b;
    public final TLRPC.TL_error c;
    public final TLObject d;

    public pj6(ak6 ak6Var, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.b = ak6Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        ak6 ak6Var = this.b;
        switch (b) {
            case 0:
                ak6Var.getNotificationCenter().d(new pj6(ak6Var, tL_error, tLObject, (byte) 1));
                return;
            default:
                ak6Var.g0(tLObject, tL_error);
                return;
        }
    }
}
