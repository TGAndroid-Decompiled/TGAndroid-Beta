package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e0 implements RequestDelegate {
    public final int f19546a;
    public final VoIPService f19547b;
    public final MessagesStorage f19548c;

    public e0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19546a = i10;
        this.f19547b = voIPService;
        this.f19548c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19546a) {
            case 0:
                this.f19547b.lambda$acceptIncomingCall$103(this.f19548c, tLObject, tL_error);
                return;
            default:
                this.f19547b.lambda$startOutgoingCall$11(this.f19548c, tLObject, tL_error);
                return;
        }
    }
}
