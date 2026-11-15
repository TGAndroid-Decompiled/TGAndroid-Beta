package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f27112a;
    public final VoIPService f27113b;
    public final TLRPC.GroupCallParticipant f27114c;

    public d0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i7) {
        this.f27112a = i7;
        this.f27113b = voIPService;
        this.f27114c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f27112a) {
            case 0:
                this.f27113b.lambda$startConferenceGroupCall$37(this.f27114c);
                return;
            default:
                this.f27113b.lambda$startGroupCall$26(this.f27114c);
                return;
        }
    }
}
