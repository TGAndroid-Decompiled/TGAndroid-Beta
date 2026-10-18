package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements RequestDelegate {
    public final int f19842a;
    public final VoIPService f19843b;
    public final MessagesStorage f19844c;

    public c0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19842a = i10;
        this.f19843b = voIPService;
        this.f19844c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19842a) {
            case 0:
                this.f19843b.lambda$acceptIncomingCall$103(this.f19844c, tLObject, tL_error);
                return;
            default:
                this.f19843b.lambda$startOutgoingCall$11(this.f19844c, tLObject, tL_error);
                return;
        }
    }
}
