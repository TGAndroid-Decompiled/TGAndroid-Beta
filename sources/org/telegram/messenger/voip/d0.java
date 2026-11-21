package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f27507a;
    public final VoIPService f27508b;
    public final TLRPC.GroupCallParticipant f27509c;

    public d0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i7) {
        this.f27507a = i7;
        this.f27508b = voIPService;
        this.f27509c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f27507a) {
            case 0:
                this.f27508b.lambda$startConferenceGroupCall$37(this.f27509c);
                return;
            default:
                this.f27508b.lambda$startGroupCall$26(this.f27509c);
                return;
        }
    }
}
