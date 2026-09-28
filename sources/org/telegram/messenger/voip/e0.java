package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f17895a;
    public final VoIPService f17896b;
    public final TLRPC.GroupCallParticipant f17897c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f17895a = i10;
        this.f17896b = voIPService;
        this.f17897c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f17895a) {
            case 0:
                this.f17896b.lambda$startConferenceGroupCall$37(this.f17897c);
                return;
            default:
                this.f17896b.lambda$startGroupCall$26(this.f17897c);
                return;
        }
    }
}
