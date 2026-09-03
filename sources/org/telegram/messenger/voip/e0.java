package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f18752a;
    public final VoIPService f18753b;
    public final TLRPC.GroupCallParticipant f18754c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f18752a = i10;
        this.f18753b = voIPService;
        this.f18754c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f18752a) {
            case 0:
                this.f18753b.lambda$startConferenceGroupCall$37(this.f18754c);
                return;
            default:
                this.f18753b.lambda$startGroupCall$26(this.f18754c);
                return;
        }
    }
}
