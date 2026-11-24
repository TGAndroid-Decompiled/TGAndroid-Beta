package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wa6 implements RequestDelegate {
    public final byte a;
    public final eb6 b;

    public wa6(eb6 eb6Var, byte b) {
        this.a = b;
        this.b = eb6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        eb6 eb6Var = this.b;
        switch (b) {
            case 0:
                if (tL_error == null) {
                    eb6Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                if (tL_error == null) {
                    eb6Var.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                if (tLObject instanceof TLRPC.TL_messages_affectedMessages) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    eb6Var.getMessagesController().O3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    return;
                }
                eb6Var.getClass();
                return;
        }
    }
}
