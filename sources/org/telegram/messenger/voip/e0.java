package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f17911a;
    public final VoIPService f17912b;
    public final TLRPC.GroupCallParticipant f17913c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f17911a = i10;
        this.f17912b = voIPService;
        this.f17913c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f17911a) {
            case 0:
                this.f17912b.lambda$startConferenceGroupCall$37(this.f17913c);
                return;
            default:
                this.f17912b.lambda$startGroupCall$26(this.f17913c);
                return;
        }
    }
}
