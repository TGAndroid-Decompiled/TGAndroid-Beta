package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f17884a;
    public final VoIPService f17885b;
    public final TLRPC.GroupCallParticipant f17886c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f17884a = i10;
        this.f17885b = voIPService;
        this.f17886c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f17884a) {
            case 0:
                this.f17885b.lambda$startConferenceGroupCall$37(this.f17886c);
                return;
            default:
                this.f17885b.lambda$startGroupCall$26(this.f17886c);
                return;
        }
    }
}
