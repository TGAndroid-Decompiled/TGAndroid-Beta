package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o83 implements RequestDelegate {
    public final byte a;
    public final r83 b;

    public o83(r83 r83Var, byte b) {
        this.a = b;
        this.b = r83Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        r83 r83Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                r83Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new o83(r83Var, (byte) 1));
                return;
            default:
                r83Var.getMessagesController().T2(true);
                return;
        }
    }
}
