package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f19841a;
    public final VoIPService f19842b;
    public final TLRPC.GroupCallParticipant f19843c;

    public c0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19841a = i10;
        this.f19842b = voIPService;
        this.f19843c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19841a) {
            case 0:
                this.f19842b.lambda$startConferenceGroupCall$37(this.f19843c);
                return;
            default:
                this.f19842b.lambda$startGroupCall$26(this.f19843c);
                return;
        }
    }
}
