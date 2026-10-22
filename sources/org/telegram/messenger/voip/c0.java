package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f19853a;
    public final VoIPService f19854b;
    public final TLRPC.GroupCallParticipant f19855c;

    public c0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19853a = i10;
        this.f19854b = voIPService;
        this.f19855c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19853a) {
            case 0:
                this.f19854b.lambda$startConferenceGroupCall$37(this.f19855c);
                return;
            default:
                this.f19854b.lambda$startGroupCall$26(this.f19855c);
                return;
        }
    }
}
