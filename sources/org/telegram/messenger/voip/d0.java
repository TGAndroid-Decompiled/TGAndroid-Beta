package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements RequestDelegate {
    public final int f19534a;
    public final VoIPService f19535b;
    public final MessagesStorage f19536c;

    public d0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19534a = i10;
        this.f19535b = voIPService;
        this.f19536c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19534a) {
            case 0:
                this.f19535b.lambda$acceptIncomingCall$103(this.f19536c, tLObject, tL_error);
                return;
            default:
                this.f19535b.lambda$startOutgoingCall$11(this.f19536c, tLObject, tL_error);
                return;
        }
    }
}
