package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f19321a;
    public final VoIPService f19322b;
    public final TLRPC.GroupCallParticipant f19323c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19321a = i10;
        this.f19322b = voIPService;
        this.f19323c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19321a) {
            case 0:
                this.f19322b.lambda$startConferenceGroupCall$37(this.f19323c);
                return;
            default:
                this.f19322b.lambda$startGroupCall$26(this.f19323c);
                return;
        }
    }
}
