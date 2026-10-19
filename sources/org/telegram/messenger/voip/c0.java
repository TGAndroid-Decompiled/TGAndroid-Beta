package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f19838a;
    public final VoIPService f19839b;
    public final TLRPC.GroupCallParticipant f19840c;

    public c0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19838a = i10;
        this.f19839b = voIPService;
        this.f19840c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19838a) {
            case 0:
                this.f19839b.lambda$startConferenceGroupCall$37(this.f19840c);
                return;
            default:
                this.f19839b.lambda$startGroupCall$26(this.f19840c);
                return;
        }
    }
}
