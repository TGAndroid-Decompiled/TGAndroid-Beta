package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f17894a;
    public final VoIPService f17895b;
    public final TLRPC.GroupCallParticipant f17896c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f17894a = i10;
        this.f17895b = voIPService;
        this.f17896c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f17894a) {
            case 0:
                this.f17895b.lambda$startConferenceGroupCall$37(this.f17896c);
                return;
            default:
                this.f17895b.lambda$startGroupCall$26(this.f17896c);
                return;
        }
    }
}
