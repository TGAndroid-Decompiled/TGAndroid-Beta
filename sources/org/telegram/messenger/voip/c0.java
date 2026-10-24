package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f19916a;
    public final VoIPService f19917b;
    public final TLRPC.GroupCallParticipant f19918c;

    public c0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19916a = i10;
        this.f19917b = voIPService;
        this.f19918c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19916a) {
            case 0:
                this.f19917b.lambda$startConferenceGroupCall$37(this.f19918c);
                return;
            default:
                this.f19917b.lambda$startGroupCall$26(this.f19918c);
                return;
        }
    }
}
