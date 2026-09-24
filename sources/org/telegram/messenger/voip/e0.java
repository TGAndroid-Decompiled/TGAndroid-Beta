package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f17869a;
    public final VoIPService f17870b;
    public final TLRPC.GroupCallParticipant f17871c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f17869a = i10;
        this.f17870b = voIPService;
        this.f17871c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f17869a) {
            case 0:
                this.f17870b.lambda$startConferenceGroupCall$37(this.f17871c);
                return;
            default:
                this.f17870b.lambda$startGroupCall$26(this.f17871c);
                return;
        }
    }
}
