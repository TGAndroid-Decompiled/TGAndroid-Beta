package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f26092a;
    public final VoIPService f26093b;
    public final TLRPC.GroupCallParticipant f26094c;

    public c0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i7) {
        this.f26092a = i7;
        this.f26093b = voIPService;
        this.f26094c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f26092a) {
            case 0:
                this.f26093b.lambda$startConferenceGroupCall$37(this.f26094c);
                return;
            default:
                this.f26093b.lambda$startGroupCall$26(this.f26094c);
                return;
        }
    }
}
