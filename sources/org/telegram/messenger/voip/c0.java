package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f26098a;
    public final VoIPService f26099b;
    public final TLRPC.GroupCallParticipant f26100c;

    public c0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i7) {
        this.f26098a = i7;
        this.f26099b = voIPService;
        this.f26100c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f26098a) {
            case 0:
                this.f26099b.lambda$startConferenceGroupCall$37(this.f26100c);
                return;
            default:
                this.f26099b.lambda$startGroupCall$26(this.f26100c);
                return;
        }
    }
}
