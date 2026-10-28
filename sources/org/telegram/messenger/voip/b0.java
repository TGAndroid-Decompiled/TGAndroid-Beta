package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f21606a;
    public final VoIPService f21607b;
    public final TLRPC.GroupCallParticipant f21608c;

    public b0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f21606a = i10;
        this.f21607b = voIPService;
        this.f21608c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f21606a) {
            case 0:
                this.f21607b.lambda$startConferenceGroupCall$37(this.f21608c);
                return;
            default:
                this.f21607b.lambda$startGroupCall$26(this.f21608c);
                return;
        }
    }
}
