package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f27575a;
    public final VoIPService f27576b;
    public final TLRPC.GroupCallParticipant f27577c;

    public d0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i7) {
        this.f27575a = i7;
        this.f27576b = voIPService;
        this.f27577c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f27575a) {
            case 0:
                this.f27576b.lambda$startConferenceGroupCall$37(this.f27577c);
                return;
            default:
                this.f27576b.lambda$startGroupCall$26(this.f27577c);
                return;
        }
    }
}
