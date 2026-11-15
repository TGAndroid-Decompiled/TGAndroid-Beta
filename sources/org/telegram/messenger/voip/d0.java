package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f27113a;
    public final VoIPService f27114b;
    public final TLRPC.GroupCallParticipant f27115c;

    public d0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i7) {
        this.f27113a = i7;
        this.f27114b = voIPService;
        this.f27115c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f27113a) {
            case 0:
                this.f27114b.lambda$startConferenceGroupCall$37(this.f27115c);
                return;
            default:
                this.f27114b.lambda$startGroupCall$26(this.f27115c);
                return;
        }
    }
}
