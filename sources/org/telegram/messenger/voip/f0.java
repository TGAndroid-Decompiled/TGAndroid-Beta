package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class f0 implements Runnable {
    public final int f19554a;
    public final VoIPService f19555b;
    public final TLRPC.GroupCallParticipant f19556c;

    public f0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19554a = i10;
        this.f19555b = voIPService;
        this.f19556c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19554a) {
            case 0:
                this.f19555b.lambda$startConferenceGroupCall$37(this.f19556c);
                return;
            default:
                this.f19555b.lambda$startGroupCall$26(this.f19556c);
                return;
        }
    }
}
