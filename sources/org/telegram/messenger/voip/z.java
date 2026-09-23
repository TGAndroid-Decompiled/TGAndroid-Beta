package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f17712a;
    public final VoIPService f17713b;
    public final MessagesStorage f17714c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f17712a = i10;
        this.f17713b = voIPService;
        this.f17714c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17712a) {
            case 0:
                this.f17713b.lambda$acceptIncomingCall$103(this.f17714c, tLObject, tL_error);
                return;
            default:
                this.f17713b.lambda$startOutgoingCall$11(this.f17714c, tLObject, tL_error);
                return;
        }
    }
}
