package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p0b implements RequestDelegate {
    public final byte a;
    public final w1b b;

    public p0b(w1b w1bVar, byte b) {
        this.a = b;
        this.b = w1bVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        w1b w1bVar = this.b;
        switch (b) {
            case 0:
                w1bVar.h0(tLObject);
                return;
            default:
                w1bVar.i0(tLObject);
                return;
        }
    }
}
