package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f17893a;
    public final VoIPService f17894b;
    public final TLRPC.GroupCallParticipant f17895c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f17893a = i10;
        this.f17894b = voIPService;
        this.f17895c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f17893a) {
            case 0:
                this.f17894b.lambda$startConferenceGroupCall$37(this.f17895c);
                return;
            default:
                this.f17894b.lambda$startGroupCall$26(this.f17895c);
                return;
        }
    }
}
