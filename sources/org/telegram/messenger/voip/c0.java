package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f19856a;
    public final VoIPService f19857b;
    public final TLRPC.GroupCallParticipant f19858c;

    public c0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19856a = i10;
        this.f19857b = voIPService;
        this.f19858c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19856a) {
            case 0:
                this.f19857b.lambda$startConferenceGroupCall$37(this.f19858c);
                return;
            default:
                this.f19857b.lambda$startGroupCall$26(this.f19858c);
                return;
        }
    }
}
