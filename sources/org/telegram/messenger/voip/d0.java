package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f21935a;
    public final VoIPService f21936b;
    public final TLRPC.GroupCallParticipant f21937c;

    public d0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f21935a = i10;
        this.f21936b = voIPService;
        this.f21937c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f21935a) {
            case 0:
                this.f21936b.lambda$startConferenceGroupCall$37(this.f21937c);
                return;
            default:
                this.f21936b.lambda$startGroupCall$26(this.f21937c);
                return;
        }
    }
}
