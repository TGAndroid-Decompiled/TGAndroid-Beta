package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ad6 implements RequestDelegate {
    public final byte a;
    public final id6 b;

    public ad6(id6 id6Var, byte b) {
        this.a = b;
        this.b = id6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        id6 id6Var = this.b;
        switch (b) {
            case 0:
                if (tL_error == null) {
                    id6Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                if (tL_error == null) {
                    id6Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                if (tLObject instanceof TLRPC.TL_messages_affectedMessages) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    id6Var.getMessagesController().W3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    return;
                }
                id6Var.getClass();
                return;
        }
    }
}
