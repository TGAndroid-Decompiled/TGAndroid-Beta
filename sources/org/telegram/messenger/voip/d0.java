package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f27470a;
    public final VoIPService f27471b;
    public final TLRPC.GroupCallParticipant f27472c;

    public d0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i7) {
        this.f27470a = i7;
        this.f27471b = voIPService;
        this.f27472c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f27470a) {
            case 0:
                this.f27471b.lambda$startConferenceGroupCall$37(this.f27472c);
                return;
            default:
                this.f27471b.lambda$startGroupCall$26(this.f27472c);
                return;
        }
    }
}
