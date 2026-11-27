package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mj6 implements Runnable {
    public final byte a;
    public final ck6 b;
    public final TLRPC.TL_error c;
    public final TLObject d;

    public mj6(ck6 ck6Var, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.b = ck6Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        ck6 ck6Var = this.b;
        switch (b) {
            case 0:
                ck6Var.f0(tLObject, tL_error);
                return;
            default:
                ck6Var.getNotificationCenter().d(new mj6(ck6Var, tL_error, tLObject, (byte) 0));
                return;
        }
    }
}
