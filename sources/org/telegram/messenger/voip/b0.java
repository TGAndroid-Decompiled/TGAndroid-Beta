package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f25980a;
    public final VoIPService f25981b;
    public final TLRPC.GroupCallParticipant f25982c;

    public b0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i3) {
        this.f25980a = i3;
        this.f25981b = voIPService;
        this.f25982c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f25980a) {
            case 0:
                this.f25981b.lambda$startConferenceGroupCall$37(this.f25982c);
                return;
            default:
                this.f25981b.lambda$startGroupCall$26(this.f25982c);
                return;
        }
    }
}
