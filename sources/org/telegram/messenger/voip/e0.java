package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f19543a;
    public final VoIPService f19544b;
    public final TLRPC.GroupCallParticipant f19545c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19543a = i10;
        this.f19544b = voIPService;
        this.f19545c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19543a) {
            case 0:
                this.f19544b.lambda$startConferenceGroupCall$37(this.f19545c);
                return;
            default:
                this.f19544b.lambda$startGroupCall$26(this.f19545c);
                return;
        }
    }
}
