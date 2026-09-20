package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f17952a;
    public final VoIPService f17953b;
    public final MessagesStorage f17954c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f17952a = i10;
        this.f17953b = voIPService;
        this.f17954c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17952a) {
            case 0:
                this.f17953b.lambda$acceptIncomingCall$103(this.f17954c, tLObject, tL_error);
                return;
            default:
                this.f17953b.lambda$startOutgoingCall$11(this.f17954c, tLObject, tL_error);
                return;
        }
    }
}
