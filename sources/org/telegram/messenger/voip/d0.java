package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements RequestDelegate {
    public final int f19526a;
    public final VoIPService f19527b;
    public final MessagesStorage f19528c;

    public d0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19526a = i10;
        this.f19527b = voIPService;
        this.f19528c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19526a) {
            case 0:
                this.f19527b.lambda$acceptIncomingCall$103(this.f19528c, tLObject, tL_error);
                return;
            default:
                this.f19527b.lambda$startOutgoingCall$11(this.f19528c, tLObject, tL_error);
                return;
        }
    }
}
