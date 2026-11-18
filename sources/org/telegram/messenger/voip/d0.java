package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f27481a;
    public final VoIPService f27482b;
    public final TLRPC.GroupCallParticipant f27483c;

    public d0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i7) {
        this.f27481a = i7;
        this.f27482b = voIPService;
        this.f27483c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f27481a) {
            case 0:
                this.f27482b.lambda$startConferenceGroupCall$37(this.f27483c);
                return;
            default:
                this.f27482b.lambda$startGroupCall$26(this.f27483c);
                return;
        }
    }
}
