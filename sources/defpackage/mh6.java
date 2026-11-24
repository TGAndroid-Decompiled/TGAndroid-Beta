package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh6 implements Runnable {
    public final byte a;
    public final yh6 b;
    public final TLRPC.TL_error c;
    public final TLObject d;

    public mh6(yh6 yh6Var, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.b = yh6Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        yh6 yh6Var = this.b;
        switch (b) {
            case 0:
                yh6Var.getNotificationCenter().d(new mh6(yh6Var, tL_error, tLObject, (byte) 1));
                return;
            default:
                yh6Var.f0(tLObject, tL_error);
                return;
        }
    }
}
