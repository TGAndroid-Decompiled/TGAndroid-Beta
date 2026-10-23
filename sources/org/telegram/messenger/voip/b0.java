package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements RequestDelegate {
    public final int f19853a;
    public final VoIPService f19854b;
    public final MessagesStorage f19855c;

    public b0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19853a = i10;
        this.f19854b = voIPService;
        this.f19855c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19853a) {
            case 0:
                this.f19854b.lambda$acceptIncomingCall$103(this.f19855c, tLObject, tL_error);
                return;
            default:
                this.f19854b.lambda$startOutgoingCall$11(this.f19855c, tLObject, tL_error);
                return;
        }
    }
}
