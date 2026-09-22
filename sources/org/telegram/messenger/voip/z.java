package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f17723a;
    public final VoIPService f17724b;
    public final MessagesStorage f17725c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f17723a = i10;
        this.f17724b = voIPService;
        this.f17725c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17723a) {
            case 0:
                this.f17724b.lambda$acceptIncomingCall$103(this.f17725c, tLObject, tL_error);
                return;
            default:
                this.f17724b.lambda$startOutgoingCall$11(this.f17725c, tLObject, tL_error);
                return;
        }
    }
}
