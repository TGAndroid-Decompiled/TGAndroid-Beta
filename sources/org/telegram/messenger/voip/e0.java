package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f18487a;
    public final VoIPService f18488b;
    public final TLRPC.GroupCallParticipant f18489c;

    public e0(VoIPService voIPService, TLRPC.GroupCallParticipant groupCallParticipant, int i10) {
        this.f18487a = i10;
        this.f18488b = voIPService;
        this.f18489c = groupCallParticipant;
    }

    @Override
    public final void run() {
        switch (this.f18487a) {
            case 0:
                this.f18488b.lambda$startConferenceGroupCall$37(this.f18489c);
                return;
            default:
                this.f18488b.lambda$startGroupCall$26(this.f18489c);
                return;
        }
    }
}
