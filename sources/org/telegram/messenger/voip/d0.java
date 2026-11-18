package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f27479a;
    public final VoIPService f27480b;
    public final TLRPC.GroupCallParticipant f27481c;

    public d0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i7) {
        this.f27479a = i7;
        this.f27480b = voIPService;
        this.f27481c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f27479a) {
            case 0:
                this.f27480b.lambda$startConferenceGroupCall$37(this.f27481c);
                return;
            default:
                this.f27480b.lambda$startGroupCall$26(this.f27481c);
                return;
        }
    }
}
