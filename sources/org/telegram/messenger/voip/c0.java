package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f19835a;
    public final VoIPService f19836b;
    public final TLRPC.GroupCallParticipant f19837c;

    public c0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19835a = i10;
        this.f19836b = voIPService;
        this.f19837c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19835a) {
            case 0:
                this.f19836b.lambda$startConferenceGroupCall$37(this.f19837c);
                return;
            default:
                this.f19836b.lambda$startGroupCall$26(this.f19837c);
                return;
        }
    }
}
