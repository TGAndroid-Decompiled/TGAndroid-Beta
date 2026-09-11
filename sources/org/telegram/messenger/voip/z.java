package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f19455a;
    public final VoIPService f19456b;
    public final MessagesStorage f19457c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19455a = i10;
        this.f19456b = voIPService;
        this.f19457c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19455a) {
            case 0:
                this.f19456b.lambda$acceptIncomingCall$103(this.f19457c, tLObject, tL_error);
                return;
            default:
                this.f19456b.lambda$startOutgoingCall$11(this.f19457c, tLObject, tL_error);
                return;
        }
    }
}
