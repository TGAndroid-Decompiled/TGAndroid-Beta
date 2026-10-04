package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f19535a;
    public final VoIPService f19536b;
    public final TLRPC.GroupCallParticipant f19537c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f19535a = i10;
        this.f19536b = voIPService;
        this.f19537c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f19535a) {
            case 0:
                this.f19536b.lambda$startConferenceGroupCall$37(this.f19537c);
                return;
            default:
                this.f19536b.lambda$startGroupCall$26(this.f19537c);
                return;
        }
    }
}
