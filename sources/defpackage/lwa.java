package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lwa implements RequestDelegate {
    public final byte a;
    public final jxa b;

    public lwa(jxa jxaVar, byte b) {
        this.a = b;
        this.b = jxaVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        jxa jxaVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new ova(jxaVar, tLObject, (byte) 1));
                return;
            case 1:
                hl.c3(new ova(jxaVar, tLObject, (byte) 2));
                return;
            case 2:
                hl.c3(new ova(jxaVar, tLObject, (byte) 3));
                return;
            case 3:
                hl.c3(new ova(jxaVar, tLObject, (byte) 4));
                return;
            default:
                hl.c3(new ova(jxaVar, tLObject, (byte) 0));
                return;
        }
    }
}
