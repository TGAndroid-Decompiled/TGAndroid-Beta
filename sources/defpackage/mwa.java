package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mwa implements RequestDelegate {
    public final byte a;
    public final uxa b;

    public mwa(uxa uxaVar, byte b) {
        this.a = b;
        this.b = uxaVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        uxa uxaVar = this.b;
        switch (b) {
            case 0:
                uxaVar.h0(tLObject);
                return;
            default:
                uxaVar.i0(tLObject);
                return;
        }
    }
}
