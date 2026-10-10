package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class f0 implements Runnable {
    public final int f19558a;
    public final VoIPService f19559b;
    public final TLRPC.GroupCallParticipant f19560c;

    public f0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19558a = i10;
        this.f19559b = voIPService;
        this.f19560c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19558a) {
            case 0:
                this.f19559b.lambda$startConferenceGroupCall$37(this.f19560c);
                return;
            default:
                this.f19559b.lambda$startGroupCall$26(this.f19560c);
                return;
        }
    }
}
