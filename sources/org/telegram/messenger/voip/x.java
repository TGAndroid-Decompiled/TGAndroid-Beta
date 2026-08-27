package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class x implements RequestDelegate {

    public final int f21989a;

    public final VoIPService f21990b;

    public final MessagesStorage f21991c;

    public x(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f21989a = i10;
        this.f21990b = voIPService;
        this.f21991c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21989a) {
            case 0:
                this.f21990b.lambda$acceptIncomingCall$103(this.f21991c, tLObject, tL_error);
                break;
            default:
                this.f21990b.lambda$startOutgoingCall$11(this.f21991c, tLObject, tL_error);
                break;
        }
    }
}
