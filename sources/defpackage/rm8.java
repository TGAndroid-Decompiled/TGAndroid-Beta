package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rm8 implements RequestDelegate {
    public final byte a;
    public final tm8 b;

    public rm8(tm8 tm8Var, byte b) {
        this.a = b;
        this.b = tm8Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        tm8 tm8Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                tm8Var.c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new rm8(tm8Var, (byte) 1));
                return;
            default:
                tm8Var.c.getMessagesController().U2(true);
                return;
        }
    }
}
