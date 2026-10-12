package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e0 implements RequestDelegate {
    public final int f18790a;
    public final VoIPService f18791b;
    public final MessagesStorage f18792c;

    public e0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f18790a = i10;
        this.f18791b = voIPService;
        this.f18792c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18790a) {
            case 0:
                this.f18791b.lambda$acceptIncomingCall$103(this.f18792c, tLObject, tL_error);
                return;
            default:
                this.f18791b.lambda$startOutgoingCall$11(this.f18792c, tLObject, tL_error);
                return;
        }
    }
}
