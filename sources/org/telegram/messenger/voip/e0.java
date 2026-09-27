package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f17878a;
    public final VoIPService f17879b;
    public final TLRPC.GroupCallParticipant f17880c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f17878a = i10;
        this.f17879b = voIPService;
        this.f17880c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f17878a) {
            case 0:
                this.f17879b.lambda$startConferenceGroupCall$37(this.f17880c);
                return;
            default:
                this.f17879b.lambda$startGroupCall$26(this.f17880c);
                return;
        }
    }
}
