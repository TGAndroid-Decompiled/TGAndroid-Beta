package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f19372a;
    public final VoIPService f19373b;
    public final TLRPC.GroupCallParticipant f19374c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19372a = i10;
        this.f19373b = voIPService;
        this.f19374c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19372a) {
            case 0:
                this.f19373b.lambda$startConferenceGroupCall$37(this.f19374c);
                return;
            default:
                this.f19373b.lambda$startGroupCall$26(this.f19374c);
                return;
        }
    }
}
