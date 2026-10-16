package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements RequestDelegate {
    public final int f18479a;
    public final VoIPService f18480b;
    public final MessagesStorage f18481c;

    public d0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f18479a = i10;
        this.f18480b = voIPService;
        this.f18481c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18479a) {
            case 0:
                this.f18480b.lambda$acceptIncomingCall$103(this.f18481c, tLObject, tL_error);
                return;
            default:
                this.f18480b.lambda$startOutgoingCall$11(this.f18481c, tLObject, tL_error);
                return;
        }
    }
}
