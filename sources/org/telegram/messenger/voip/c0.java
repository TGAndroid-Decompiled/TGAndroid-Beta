package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f26102a;
    public final VoIPService f26103b;
    public final TLRPC.GroupCallParticipant f26104c;

    public c0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i7) {
        this.f26102a = i7;
        this.f26103b = voIPService;
        this.f26104c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f26102a) {
            case 0:
                this.f26103b.lambda$startConferenceGroupCall$37(this.f26104c);
                return;
            default:
                this.f26103b.lambda$startGroupCall$26(this.f26104c);
                return;
        }
    }
}
