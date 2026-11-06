package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f26084a;
    public final VoIPService f26085b;
    public final TLRPC.GroupCallParticipant f26086c;

    public c0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i7) {
        this.f26084a = i7;
        this.f26085b = voIPService;
        this.f26086c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f26084a) {
            case 0:
                this.f26085b.lambda$startConferenceGroupCall$37(this.f26086c);
                return;
            default:
                this.f26085b.lambda$startGroupCall$26(this.f26086c);
                return;
        }
    }
}
