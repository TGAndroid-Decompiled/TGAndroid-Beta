package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class so8 implements RequestDelegate {
    public final byte a;
    public final uo8 b;

    public so8(uo8 uo8Var, byte b) {
        this.a = b;
        this.b = uo8Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        uo8 uo8Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                uo8Var.c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new so8(uo8Var, (byte) 1));
                return;
            default:
                uo8Var.c.getMessagesController().W2(true);
                return;
        }
    }
}
