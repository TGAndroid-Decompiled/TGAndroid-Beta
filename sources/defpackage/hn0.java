package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hn0 implements RequestDelegate {
    public final byte a;
    public final pcc b;
    public final pcc c;

    public hn0(pcc pccVar, pcc pccVar2, byte b) {
        this.a = b;
        this.b = pccVar;
        this.c = pccVar2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                hl.c3(new es6(tL_error, this.b, this.c));
                return;
            default:
                hl.c3(new o97(tL_error, this.b, tLObject, this.c, (byte) 9));
                return;
        }
    }
}
