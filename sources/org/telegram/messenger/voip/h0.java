package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class h0 implements Runnable {
    public final int f16731a;
    public final VoIPService f16732b;
    public final TLRPC.GroupCallParticipant f16733c;

    public h0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f16731a = i10;
        this.f16732b = voIPService;
        this.f16733c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f16731a) {
            case 0:
                this.f16732b.lambda$startConferenceGroupCall$37(this.f16733c);
                return;
            default:
                this.f16732b.lambda$startGroupCall$26(this.f16733c);
                return;
        }
    }
}
