package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jua implements RequestDelegate {
    public final byte a;
    public final jva b;

    public jua(jva jvaVar, byte b) {
        this.a = b;
        this.b = jvaVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        jva jvaVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new nua(jvaVar, tLObject, (byte) 0));
                return;
            case 1:
                gm.c3(new nua(jvaVar, tLObject, (byte) 1));
                return;
            case 2:
                gm.c3(new nua(jvaVar, tLObject, (byte) 2));
                return;
            case 3:
                gm.c3(new nua(jvaVar, tLObject, (byte) 3));
                return;
            default:
                gm.c3(new nua(jvaVar, tLObject, (byte) 4));
                return;
        }
    }
}
