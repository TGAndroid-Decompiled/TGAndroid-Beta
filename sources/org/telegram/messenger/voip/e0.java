package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f20397a;
    public final VoIPService f20398b;
    public final TLRPC.GroupCallParticipant f20399c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f20397a = i10;
        this.f20398b = voIPService;
        this.f20399c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f20397a) {
            case 0:
                this.f20398b.lambda$startConferenceGroupCall$37(this.f20399c);
                return;
            default:
                this.f20398b.lambda$startGroupCall$26(this.f20399c);
                return;
        }
    }
}
