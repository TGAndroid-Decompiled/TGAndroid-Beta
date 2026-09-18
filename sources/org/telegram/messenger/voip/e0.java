package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f17827a;
    public final VoIPService f17828b;
    public final TLRPC.GroupCallParticipant f17829c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f17827a = i10;
        this.f17828b = voIPService;
        this.f17829c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f17827a) {
            case 0:
                this.f17828b.lambda$startConferenceGroupCall$37(this.f17829c);
                return;
            default:
                this.f17828b.lambda$startGroupCall$26(this.f17829c);
                return;
        }
    }
}
