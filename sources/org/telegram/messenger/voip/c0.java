package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f19921a;
    public final VoIPService f19922b;
    public final TLRPC.GroupCallParticipant f19923c;

    public c0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19921a = i10;
        this.f19922b = voIPService;
        this.f19923c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19921a) {
            case 0:
                this.f19922b.lambda$startConferenceGroupCall$37(this.f19923c);
                return;
            default:
                this.f19922b.lambda$startGroupCall$26(this.f19923c);
                return;
        }
    }
}
