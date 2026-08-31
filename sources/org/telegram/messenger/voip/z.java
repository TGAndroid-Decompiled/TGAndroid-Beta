package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f20494a;
    public final VoIPService f20495b;
    public final MessagesStorage f20496c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f20494a = i10;
        this.f20495b = voIPService;
        this.f20496c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20494a) {
            case 0:
                this.f20495b.lambda$acceptIncomingCall$103(this.f20496c, tLObject, tL_error);
                return;
            default:
                this.f20495b.lambda$startOutgoingCall$11(this.f20496c, tLObject, tL_error);
                return;
        }
    }
}
