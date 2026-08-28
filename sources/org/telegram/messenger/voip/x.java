package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x implements RequestDelegate {
    public final int f21965a;
    public final VoIPService f21966b;
    public final MessagesStorage f21967c;

    public x(VoIPService voIPService, MessagesStorage messagesStorage, int i9) {
        this.f21965a = i9;
        this.f21966b = voIPService;
        this.f21967c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21965a) {
            case 0:
                this.f21966b.lambda$acceptIncomingCall$103(this.f21967c, tLObject, tL_error);
                return;
            default:
                this.f21966b.lambda$startOutgoingCall$11(this.f21967c, tLObject, tL_error);
                return;
        }
    }
}
