package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f19832a;
    public final VoIPService f19833b;
    public final TLRPC.GroupCallParticipant f19834c;

    public c0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19832a = i10;
        this.f19833b = voIPService;
        this.f19834c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19832a) {
            case 0:
                this.f19833b.lambda$startConferenceGroupCall$37(this.f19834c);
                return;
            default:
                this.f19833b.lambda$startGroupCall$26(this.f19834c);
                return;
        }
    }
}
