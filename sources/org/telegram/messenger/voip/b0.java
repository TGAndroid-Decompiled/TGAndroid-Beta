package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f21618a;
    public final VoIPService f21619b;
    public final TLRPC.GroupCallParticipant f21620c;

    public b0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f21618a = i10;
        this.f21619b = voIPService;
        this.f21620c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f21618a) {
            case 0:
                this.f21619b.lambda$startConferenceGroupCall$37(this.f21620c);
                return;
            default:
                this.f21619b.lambda$startGroupCall$26(this.f21620c);
                return;
        }
    }
}
