package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class aa3 implements RequestDelegate {
    public final byte a;
    public final da3 b;

    public aa3(da3 da3Var, byte b) {
        this.a = b;
        this.b = da3Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        da3 da3Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                da3Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new aa3(da3Var, (byte) 1));
                return;
            default:
                da3Var.getMessagesController().W2(true);
                return;
        }
    }
}
