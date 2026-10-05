package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f19540a;
    public final VoIPService f19541b;
    public final TLRPC.GroupCallParticipant f19542c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19540a = i10;
        this.f19541b = voIPService;
        this.f19542c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19540a) {
            case 0:
                this.f19541b.lambda$startConferenceGroupCall$37(this.f19542c);
                return;
            default:
                this.f19541b.lambda$startGroupCall$26(this.f19542c);
                return;
        }
    }
}
