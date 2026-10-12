package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class f0 implements Runnable {
    public final int f18797a;
    public final VoIPService f18798b;
    public final TLRPC.GroupCallParticipant f18799c;

    public f0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f18797a = i10;
        this.f18798b = voIPService;
        this.f18799c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f18797a) {
            case 0:
                this.f18798b.lambda$startConferenceGroupCall$37(this.f18799c);
                return;
            default:
                this.f18798b.lambda$startGroupCall$26(this.f18799c);
                return;
        }
    }
}
