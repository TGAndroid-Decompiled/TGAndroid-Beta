package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vc6 implements RequestDelegate {
    public final byte a;
    public final dd6 b;

    public vc6(dd6 dd6Var, byte b) {
        this.a = b;
        this.b = dd6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        dd6 dd6Var = this.b;
        switch (b) {
            case 0:
                if (tL_error == null) {
                    dd6Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                if (tL_error == null) {
                    dd6Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                if (tLObject instanceof TLRPC.TL_messages_affectedMessages) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    dd6Var.getMessagesController().R3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    return;
                }
                dd6Var.getClass();
                return;
        }
    }
}
