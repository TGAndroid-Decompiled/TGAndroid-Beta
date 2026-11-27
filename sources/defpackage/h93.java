package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h93 implements RequestDelegate {
    public final byte a;
    public final k93 b;

    public h93(k93 k93Var, byte b) {
        this.a = b;
        this.b = k93Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        k93 k93Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                k93Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new h93(k93Var, (byte) 1));
                return;
            default:
                k93Var.getMessagesController().a3(true);
                return;
        }
    }
}
