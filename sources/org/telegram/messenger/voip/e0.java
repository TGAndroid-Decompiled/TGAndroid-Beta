package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f19545a;
    public final VoIPService f19546b;
    public final TLRPC.GroupCallParticipant f19547c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19545a = i10;
        this.f19546b = voIPService;
        this.f19547c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19545a) {
            case 0:
                this.f19546b.lambda$startConferenceGroupCall$37(this.f19547c);
                return;
            default:
                this.f19546b.lambda$startGroupCall$26(this.f19547c);
                return;
        }
    }
}
