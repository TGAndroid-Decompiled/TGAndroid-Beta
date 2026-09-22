package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f17880a;
    public final VoIPService f17881b;
    public final TLRPC.GroupCallParticipant f17882c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f17880a = i10;
        this.f17881b = voIPService;
        this.f17882c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f17880a) {
            case 0:
                this.f17881b.lambda$startConferenceGroupCall$37(this.f17882c);
                return;
            default:
                this.f17881b.lambda$startGroupCall$26(this.f17882c);
                return;
        }
    }
}
