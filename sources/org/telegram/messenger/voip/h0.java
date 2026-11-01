package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class h0 implements Runnable {
    public final int f18813a;
    public final VoIPService f18814b;
    public final TLRPC.GroupCallParticipant f18815c;

    public h0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f18813a = i10;
        this.f18814b = voIPService;
        this.f18815c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f18813a) {
            case 0:
                this.f18814b.lambda$startConferenceGroupCall$37(this.f18815c);
                return;
            default:
                this.f18814b.lambda$startGroupCall$26(this.f18815c);
                return;
        }
    }
}
