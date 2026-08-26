package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class VoIPService$$ExternalSyntheticLambda55 implements RequestDelegate {
    public final int $r8$classId;
    public final VoIPService f$0;
    public final MessagesStorage f$1;

    public VoIPService$$ExternalSyntheticLambda55(VoIPService voIPService, MessagesStorage messagesStorage, int i) {
        this.$r8$classId = i;
        this.f$0 = voIPService;
        this.f$1 = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$acceptIncomingCall$103(this.f$1, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$startOutgoingCall$11(this.f$1, tLObject, tL_error);
                break;
        }
    }
}
