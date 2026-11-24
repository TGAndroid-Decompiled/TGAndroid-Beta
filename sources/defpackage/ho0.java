package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ho0 implements RequestDelegate {
    public final byte a;
    public final qac b;
    public final qac c;

    public ho0(qac qacVar, qac qacVar2, byte b) {
        this.a = b;
        this.b = qacVar;
        this.c = qacVar2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                gm.c3(new op6(tL_error, this.b, this.c));
                return;
            default:
                gm.c3(new l97(tL_error, this.b, tLObject, this.c, (byte) 9));
                return;
        }
    }
}
