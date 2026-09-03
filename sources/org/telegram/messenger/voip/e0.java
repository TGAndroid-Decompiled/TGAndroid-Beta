package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f20399a;
    public final VoIPService f20400b;
    public final TLRPC.GroupCallParticipant f20401c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f20399a = i10;
        this.f20400b = voIPService;
        this.f20401c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f20399a) {
            case 0:
                this.f20400b.lambda$startConferenceGroupCall$37(this.f20401c);
                return;
            default:
                this.f20400b.lambda$startGroupCall$26(this.f20401c);
                return;
        }
    }
}
