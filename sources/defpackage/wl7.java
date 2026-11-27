package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wl7 implements RequestDelegate {
    public final byte a;
    public final lm7 b;

    public wl7(lm7 lm7Var, byte b) {
        this.a = b;
        this.b = lm7Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        lm7 lm7Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new pl7(lm7Var, tLObject, (byte) 1));
                return;
            default:
                if (tLObject instanceof TLRPC.Updates) {
                    lm7Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
        }
    }
}
