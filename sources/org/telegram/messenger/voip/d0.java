package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f27434a;
    public final VoIPService f27435b;
    public final TLRPC.GroupCallParticipant f27436c;

    public d0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i7) {
        this.f27434a = i7;
        this.f27435b = voIPService;
        this.f27436c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f27434a) {
            case 0:
                this.f27435b.lambda$startConferenceGroupCall$37(this.f27436c);
                return;
            default:
                this.f27435b.lambda$startGroupCall$26(this.f27436c);
                return;
        }
    }
}
