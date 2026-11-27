package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cq8 implements RequestDelegate {
    public final byte a;
    public final eq8 b;

    public cq8(eq8 eq8Var, byte b) {
        this.a = b;
        this.b = eq8Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        eq8 eq8Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                eq8Var.c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new cq8(eq8Var, (byte) 1));
                return;
            default:
                eq8Var.c.getMessagesController().a3(true);
                return;
        }
    }
}
