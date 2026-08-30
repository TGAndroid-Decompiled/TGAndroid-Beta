package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f18859a;
    public final VoIPService f18860b;
    public final MessagesStorage f18861c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f18859a = i10;
        this.f18860b = voIPService;
        this.f18861c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18859a) {
            case 0:
                this.f18860b.lambda$acceptIncomingCall$103(this.f18861c, tLObject, tL_error);
                return;
            default:
                this.f18860b.lambda$startOutgoingCall$11(this.f18861c, tLObject, tL_error);
                return;
        }
    }
}
