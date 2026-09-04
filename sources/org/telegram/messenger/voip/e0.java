package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f19345a;
    public final VoIPService f19346b;
    public final TLRPC.GroupCallParticipant f19347c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19345a = i10;
        this.f19346b = voIPService;
        this.f19347c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19345a) {
            case 0:
                this.f19346b.lambda$startConferenceGroupCall$37(this.f19347c);
                return;
            default:
                this.f19346b.lambda$startGroupCall$26(this.f19347c);
                return;
        }
    }
}
