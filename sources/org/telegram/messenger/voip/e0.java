package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f17865a;
    public final VoIPService f17866b;
    public final TLRPC.GroupCallParticipant f17867c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f17865a = i10;
        this.f17866b = voIPService;
        this.f17867c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f17865a) {
            case 0:
                this.f17866b.lambda$startConferenceGroupCall$37(this.f17867c);
                return;
            default:
                this.f17866b.lambda$startGroupCall$26(this.f17867c);
                return;
        }
    }
}
