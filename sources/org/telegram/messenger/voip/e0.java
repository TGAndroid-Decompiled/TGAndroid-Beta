package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f19386a;
    public final VoIPService f19387b;
    public final TLRPC.GroupCallParticipant f19388c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19386a = i10;
        this.f19387b = voIPService;
        this.f19388c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19386a) {
            case 0:
                this.f19387b.lambda$startConferenceGroupCall$37(this.f19388c);
                return;
            default:
                this.f19387b.lambda$startGroupCall$26(this.f19388c);
                return;
        }
    }
}
