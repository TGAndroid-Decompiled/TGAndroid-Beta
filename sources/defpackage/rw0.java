package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rw0 implements RequestDelegate {
    public final byte a;
    public final sw0 b;

    public rw0(sw0 sw0Var, byte b) {
        this.a = b;
        this.b = sw0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        sw0 sw0Var = this.b;
        switch (b) {
            case 0:
                xw0 xw0Var = sw0Var.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    uc7.s1(xw0Var.I).Y3((TLRPC.TL_updates) tLObject, false);
                }
                hl.c3(new wv0(xw0Var, (byte) 16));
                return;
            default:
                hl.c3(new tu0(sw0Var, tLObject, tL_error, (byte) 2));
                return;
        }
    }
}
