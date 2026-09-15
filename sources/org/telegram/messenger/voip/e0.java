package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f17641a;
    public final VoIPService f17642b;
    public final TLRPC.GroupCallParticipant f17643c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f17641a = i10;
        this.f17642b = voIPService;
        this.f17643c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f17641a) {
            case 0:
                this.f17642b.lambda$startConferenceGroupCall$37(this.f17643c);
                return;
            default:
                this.f17642b.lambda$startGroupCall$26(this.f17643c);
                return;
        }
    }
}
