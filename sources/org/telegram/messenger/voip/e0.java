package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f17636a;
    public final VoIPService f17637b;
    public final TLRPC.GroupCallParticipant f17638c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f17636a = i10;
        this.f17637b = voIPService;
        this.f17638c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f17636a) {
            case 0:
                this.f17637b.lambda$startConferenceGroupCall$37(this.f17638c);
                return;
            default:
                this.f17637b.lambda$startGroupCall$26(this.f17638c);
                return;
        }
    }
}
