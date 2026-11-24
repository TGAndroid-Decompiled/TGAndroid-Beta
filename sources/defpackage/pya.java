package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pya implements RequestDelegate {
    public final byte a;
    public final xza b;

    public pya(xza xzaVar, byte b) {
        this.a = b;
        this.b = xzaVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        xza xzaVar = this.b;
        switch (b) {
            case 0:
                xzaVar.i0(tLObject);
                return;
            default:
                xzaVar.j0(tLObject);
                return;
        }
    }
}
