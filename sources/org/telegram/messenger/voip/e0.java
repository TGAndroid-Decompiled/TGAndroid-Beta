package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f18771a;
    public final VoIPService f18772b;
    public final TLRPC.GroupCallParticipant f18773c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f18771a = i10;
        this.f18772b = voIPService;
        this.f18773c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f18771a) {
            case 0:
                this.f18772b.lambda$startConferenceGroupCall$37(this.f18773c);
                return;
            default:
                this.f18772b.lambda$startGroupCall$26(this.f18773c);
                return;
        }
    }
}
