package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class VoIPService$$ExternalSyntheticLambda90 implements Runnable {
    public final int $r8$classId;
    public final VoIPService f$0;
    public final TLRPC.TL_error f$1;
    public final TLObject f$2;

    public VoIPService$$ExternalSyntheticLambda90(int i, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.$r8$classId = i;
        this.f$0 = voIPService;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processAcceptedCall$19(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$startGroupCheckShortpoll$61(this.f$2, this.f$1);
                break;
            default:
                this.f$0.lambda$acceptIncomingCall$101(this.f$1, this.f$2);
                break;
        }
    }

    public VoIPService$$ExternalSyntheticLambda90(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.$r8$classId = 1;
        this.f$0 = voIPService;
        this.f$2 = tLObject;
        this.f$1 = tL_error;
    }
}
