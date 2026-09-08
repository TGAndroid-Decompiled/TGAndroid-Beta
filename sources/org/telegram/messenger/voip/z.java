package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f19468a;
    public final VoIPService f19469b;
    public final MessagesStorage f19470c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19468a = i10;
        this.f19469b = voIPService;
        this.f19470c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19468a) {
            case 0:
                this.f19469b.lambda$acceptIncomingCall$103(this.f19470c, tLObject, tL_error);
                return;
            default:
                this.f19469b.lambda$startOutgoingCall$11(this.f19470c, tLObject, tL_error);
                return;
        }
    }
}
