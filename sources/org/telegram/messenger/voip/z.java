package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f17971a;
    public final VoIPService f17972b;
    public final MessagesStorage f17973c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f17971a = i10;
        this.f17972b = voIPService;
        this.f17973c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17971a) {
            case 0:
                this.f17972b.lambda$acceptIncomingCall$103(this.f17973c, tLObject, tL_error);
                return;
            default:
                this.f17972b.lambda$startOutgoingCall$11(this.f17973c, tLObject, tL_error);
                return;
        }
    }
}
